package com.galvanize.indus.cryptozoo.unittests.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.indus.cryptozoo.controllers.AnimalController;
import com.galvanize.indus.cryptozoo.model.Animal;
import com.galvanize.indus.cryptozoo.services.AnimalService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(controllers = AnimalController.class)
public class AnimalControllerTest {

    ObjectMapper objectMapper = new ObjectMapper();


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AnimalService animalService;

    @Test
    public void getAnimals() throws Exception {
        mockMvc.perform(get("/api/animals"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(0)));
    }

    @Test
    public void postAnimal() throws Exception {
        Animal animal = new Animal();
        Animal animalWithId = new Animal();
        animalWithId.setId("01");
        when(animalService.save(any())).thenReturn(animalWithId);

        mockMvc
                .perform(
                        post("/api/animals")
                                .contentType(MediaType.APPLICATION_JSON)
                                .characterEncoding("utf-8")
                                .content(objectMapper.writeValueAsString(animal))
                )
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").exists());
//                .andExpect(jsonPath("$.username").value(username))
//                .andExpect(jsonPath("$.password").doesNotExist())
//                .andExpect(jsonPath("$.active").value(true));
    }

}
