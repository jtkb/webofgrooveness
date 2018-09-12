package com.example.groovy.controller;

import com.example.groovy.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@Slf4j
@RestController
public class StandardController
{

    @Autowired
    @Qualifier("personServiceImpl")
    private PersonService personService;

    @ResponseBody
    @RequestMapping(path = "/person/{id}", method = RequestMethod.GET)
    public void getPerson(@PathVariable(name = "id") @NotNull Long id)
    {
        log.info(String.format("Getting person %d.", id));
    }
}
