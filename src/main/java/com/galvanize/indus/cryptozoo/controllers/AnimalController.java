package com.galvanize.indus.cryptozoo.controllers;

import com.galvanize.indus.cryptozoo.model.Animal;
import com.galvanize.indus.cryptozoo.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @GetMapping("/api/animals")
    public List<Animal> getAnimals() {
        return animalService.findAll();
    }

    @PostMapping("/api/animals")
    @ResponseStatus(HttpStatus.CREATED)
    public Animal saveAnimal(@RequestBody Animal animal) {
        return animalService.save(animal);
    }
}
