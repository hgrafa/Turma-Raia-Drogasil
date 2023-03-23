package com.resilia.marvel.resourcers;

import com.resilia.marvel.domain.dto.request.CreateHeroDto;
import com.resilia.marvel.domain.model.Hero;
import com.resilia.marvel.service.HeroService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/heroes")
public class HeroController {

    @NonNull
    private HeroService heroService;

    @PostMapping
    public ResponseEntity<Hero> registerNewHero(@RequestBody CreateHeroDto heroDto) {
        var savedHero = heroService.registerHero(heroDto);

        if(savedHero == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_ACCEPTABLE)
                    .build();
        }

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedHero);
    }

    @GetMapping
    public ResponseEntity<List<Hero>> getAllHeroes() {
        var heroes = heroService.getAll();

        if(heroes.isEmpty())
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .build();

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(heroes);
    }
}
