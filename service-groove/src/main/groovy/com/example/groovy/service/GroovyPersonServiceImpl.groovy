package com.example.groovy.service

import com.example.groovy.model.Person
import com.example.groovy.repository.PersonRepository
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Slf4j
@Service
class GroovyPersonServiceImpl implements PersonService
{
    @Autowired
    private PersonRepository personRepository

    def myLogger = {log.info(it)}

    @Override
    Person getPerson(final Long id)
    {
        myLogger"getting id ${id}"
        final Person person = new Person()

        return person
    }

    @Override
    Person createPerson(final Person person)
    {
        return personRepository.save(person)
    }
}
