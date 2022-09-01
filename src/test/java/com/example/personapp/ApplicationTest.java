package com.example.personapp;

import com.example.personapp.controller.PersonController;
import com.example.personapp.model.Gender;
import com.example.personapp.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ApplicationTest {

    @Autowired
    PersonController personController;

    @Test
    void canGetPerson(){

        String personalId = "852973-593341";
        LocalDate dateOfBirth = LocalDate.of(1988, 9, 13);

        Person person = personController.getPerson(personalId, dateOfBirth);

        assertNotNull(person);
        assertEquals(person.getPersonalId(), personalId);
        assertEquals(person.getFirstName(), "John");
        assertEquals(person.getLastName(), "Brown");
        assertEquals(person.getGender(), Gender.MALE);
        assertEquals(person.getDateOfBirth(), LocalDate.of(1988, 9, 13));
    }

}
