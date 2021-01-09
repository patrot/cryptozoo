package com.galvanize.indus.cryptozoo.controllers;

import com.galvanize.indus.cryptozoo.model.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AnimalController {

    @GetMapping("/api/animals")
    public List<Animal> getAnimals() {
        return new ArrayList<>();
    }
}
