package com.resilia.hugo.helloworld.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/people")
public class HelloController {

    private List<String> names = new ArrayList<>(List.of());

    @GetMapping("/all")
    public String sayAllNames() {
        return Arrays.toString(names.toArray());
    }

    @GetMapping("/{id}")
    public String sayNameById(
           @PathVariable int id
    ) {
        String response;

        try {
            System.out.println(id);
            response = names.get(id);
        } catch (IndexOutOfBoundsException e) {
            response = "Invalid position requested";
        }

        return response;
    }

    @PostMapping
    public String addName(@RequestBody String name) {
        names.add(name);
        return "name added";
    }

    @DeleteMapping
    public String deleteName(@RequestParam int id) {
        String response;

        try {
            response = "Sucess: " + names.remove(id) + " has been removed";
        } catch (IndexOutOfBoundsException e) {
            response = "Cannot remove name with this id";
        }

        return response;
    }

}

// CRUD <-> Http
// Create - Post
// Read/Retrieve - Get
// Update - Put/Patch
// Delete - Delete