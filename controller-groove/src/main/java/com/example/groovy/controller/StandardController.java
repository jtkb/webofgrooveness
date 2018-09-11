package com.example.groovy.controller;

import com.example.groovy.model.Person;
import com.example.groovy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
public class StandardController
{

    @Autowired
    private PersonService personService;

    @ResponseBody
    @RequestMapping(path = "/person/{id}", method = RequestMethod.GET)
    public Person getPerson(@PathVariable(name = "id") @NotNull Long id)
    {
        return null;
    }
}
