package com.galvanize.indus.cryptozoo.services;

import com.galvanize.indus.cryptozoo.model.Animal;
import com.galvanize.indus.cryptozoo.respositories.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    AnimalRepository animalRepository;

    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    public Animal save(Animal animal) {
        return animalRepository.save(animal);
    }
}
