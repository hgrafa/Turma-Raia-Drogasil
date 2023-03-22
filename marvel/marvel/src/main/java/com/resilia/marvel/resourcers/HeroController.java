package com.resilia.marvel.resourcers;

import com.resilia.marvel.domain.Hero;
import com.resilia.marvel.repository.HeroRepository;
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
    private HeroRepository heroRepository;

    private static final double PI = 3.14159265;

    // substituido pela lombok
    // public HeroController(HeroRepository heroRepository) {
    //      this.heroRepository = heroRepository;
    // }

    @PostMapping
    public ResponseEntity<Hero> registerNewHero(@RequestBody Hero hero) {
        var savedHero = heroRepository.save(hero);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedHero);
    }

    @GetMapping
    public ResponseEntity<List<Hero>> getAllHeroes() {
        var heroes = heroRepository.findAll();

        if(heroes.isEmpty())
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .build();

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(heroes);
    }
}
