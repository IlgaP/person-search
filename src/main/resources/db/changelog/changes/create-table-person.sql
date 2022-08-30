--liquibase formatted sql

--changeset ilga:1

CREATE TABLE person
(
    id            serial PRIMARY KEY,
    personal_id   VARCHAR(255) NOT NULL,
    first_name    VARCHAR(255) NOT NULL,
    last_name     VARCHAR(255) NOT NULL,
    gender        VARCHAR(255) NOT NULL,
    date_of_birth date         NOT NULL
);

--changeset ilga:2

INSERT INTO person (personal_id, first_name, last_name, gender, date_of_birth)
VALUES ('852973-593341', 'John', 'Brown', 'MALE', '1988-09-13'),
       ('196209-564511', 'Anna', 'Crown', 'FEMALE', '1995-06-15'),
       ('239790-813036', 'Lisa', 'Green', 'FEMALE', '1990-10-20'),
       ('886696-021791', 'Hanna', 'Mark', 'FEMALE', '1977-08-11'),
       ('235943-598848', 'Carl', 'Smith', 'MALE', '1980-11-29'),
       ('733625-858541', 'Otto', 'Miller', 'MALE', '2000-12-01'),
       ('873299-126432', 'Arno', 'Moon', 'MALE', '1996-08-06');

