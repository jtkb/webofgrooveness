package com.example.groovy.service

import com.example.groovy.model.Person
import org.springframework.stereotype.Service

@Service(value = "groovyService")
class GroovyPersonServiceImpl implements PersonService
{
    @Override
    Person getPerson(final Long id)
    {
        final Person person = new Person()
        person
    }
}
