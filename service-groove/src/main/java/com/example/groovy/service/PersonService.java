package com.example.groovy.service;

import com.example.groovy.model.Person;

public interface PersonService
{
    Person getPerson(Long id);

    Person createPerson(Person person);

}
