package com.example.personapp.repository;

import com.example.personapp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByPersonalIdAndDateOfBirth(String personalId, LocalDate dateOfBirth);
}
