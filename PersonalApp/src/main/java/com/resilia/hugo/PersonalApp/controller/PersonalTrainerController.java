package com.resilia.hugo.PersonalApp.controller;

import com.resilia.hugo.PersonalApp.model.PersonalTrainer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/trainers")
public class PersonalTrainerController {

    private List<PersonalTrainer> trainers = new ArrayList<>();

    @GetMapping
    public List<PersonalTrainer> getAll() {
        return trainers;
    }

    @GetMapping("/{id}")
    public PersonalTrainer getById(@PathVariable long id) {
        PersonalTrainer emptyTrainer = new PersonalTrainer();

        return trainers
                .stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(emptyTrainer);
    }

    @PostMapping
    public PersonalTrainer create(@RequestBody PersonalTrainer trainer) {
        trainers.add(trainer);
        return trainer;
    }

}
