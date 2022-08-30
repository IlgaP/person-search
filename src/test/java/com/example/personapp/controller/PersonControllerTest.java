package com.example.personapp.controller;

import com.example.personapp.service.PersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class PersonControllerTest {

    @Mock
    PersonService personService;

    @InjectMocks
    PersonController personController;

    @Test
    void testFindPerson() {
        String personalId = "852973-593341";
        LocalDate dateOfBirth = LocalDate.of(1988, 9, 13);

        personController.getPerson(personalId, dateOfBirth);
        Mockito.verify(personService).getPerson(personalId, dateOfBirth);
    }
}
