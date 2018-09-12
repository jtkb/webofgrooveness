package com.example.groovy.service;

import com.example.groovy.model.Person;
import com.example.groovy.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService
{
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person getPerson(final Long id)
    {
        return personRepository.getOne(id);
    }
}
