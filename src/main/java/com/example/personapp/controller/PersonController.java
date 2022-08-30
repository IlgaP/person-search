package com.example.personapp.controller;

import com.example.personapp.model.Person;
import com.example.personapp.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/person")
@AllArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/search")
    public Person getPerson(@RequestParam("personalId") String personalId,
                            @RequestParam("dateOfBirth") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateOfBirth) {
        return personService.getPerson(personalId, dateOfBirth);
    }
}
