package com.example.personapp.service;

import com.example.personapp.model.Person;
import com.example.personapp.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.Optional;


@Service

public class PersonService {

    private final PersonRepository personRepository;
    Logger logger = LoggerFactory.getLogger(PersonService.class);

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public Person getPerson(String personalId, LocalDate dateOfBirth) {


        String personNotFound = "Person with personal: ID " + personalId + " and date of birth: " + dateOfBirth + " was NOT found! ";

        Optional<Person> person = personRepository.findByPersonalIdAndDateOfBirth(personalId, dateOfBirth);
        if (person.isPresent()) {
            String personFound = "Person with personal ID: " + personalId + " and date of birth: " + dateOfBirth + " was found! ";
            logger.info(personFound);
        } else {
            logger.info(personNotFound);
        }

        return person.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, personNotFound));
    }
}
