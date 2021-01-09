package com.galvanize.indus.cryptozoo.unittests.services;

import com.galvanize.indus.cryptozoo.model.Animal;
import com.galvanize.indus.cryptozoo.respositories.AnimalRepository;
import com.galvanize.indus.cryptozoo.services.AnimalService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnimalServiceTest {

    AnimalRepository animalRepository = mock(AnimalRepository.class);

    AnimalService animalService;

    @BeforeEach
    public void setUp() {
        animalService = new AnimalService(animalRepository);
    }

    @Test
    public void findAllTest() {
        when(animalRepository.findAll()).thenReturn(new ArrayList<>());
        List<Animal> result = animalService.findAll();
        assertTrue(result.isEmpty());
    }

    @Test
    public void saveTest() {
        Animal animal = new Animal();
        when(animalRepository.save(animal)).thenReturn(animal);
        Animal result = animalService.save(animal);
        assertEquals(animal, result);
    }
}
