package com.resilia.marvel.service;

import com.resilia.marvel.domain.dto.request.CreateHeroDto;
import com.resilia.marvel.domain.model.Hero;
import com.resilia.marvel.domain.model.SecretIndetity;
import com.resilia.marvel.repository.HeroRepository;
import com.resilia.marvel.repository.SecretIdentityRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.Set;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HeroService {

    @NonNull
    private HeroRepository heroRepository;
    @NonNull
    private SecretIdentityRepository identityRepository;

    public List<Hero> getAll() {
        return heroRepository.findAll();
    }

    public Hero registerHero(CreateHeroDto heroDto) {
        var heroesWithSameName = heroRepository
                .findAll()
                .stream()
                .filter(h -> h.getName().equalsIgnoreCase(heroDto.getName()))
                .toList();

        if(heroesWithSameName.size() > 0) {
            return null;
        }
        
        var heroToSave = toHero(heroDto);
        identityRepository.save(heroToSave.getSecretIndetity());
        return heroRepository.save(heroToSave);
    }

    private Hero toHero(CreateHeroDto heroForm) {
        SecretIndetity identity = (heroForm.getSecretIdentity() == null ) ?
                null : SecretIndetity
                .builder()
                .age(heroForm.getSecretIdentity().getAge())
                .realName(heroForm.getSecretIdentity().getRealName())
                .city(heroForm.getSecretIdentity().getCity())
                .password(heroForm.getSecretIdentity().getPassword())
                .build();

        return Hero.builder()
                .name(heroForm.getName())
                .secretIndetity(identity)
                .build();
    }
}
