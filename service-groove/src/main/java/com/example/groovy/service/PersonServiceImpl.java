package com.example.groovy.service;

import com.example.groovy.model.Person;
import com.example.groovy.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.function.Function;

@Service
public class PersonServiceImpl implements PersonService
{
    @Autowired
    private PersonRepository personRepository;

    @Override
    @Transactional(readOnly = true)
    public Person getPerson(final Long id)
    {
        return personRepository.findById(id).get();
    }

    @Override
    @Transactional
    public Person createPerson(final Person person)
    {
        return personRepository.save(person);
    }
}
