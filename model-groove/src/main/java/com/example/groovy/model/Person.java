package com.example.groovy.model;

import com.example.groovy.view.Views;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "person")
public class Person implements Serializable
{
    @Id
    @JsonView(Views.Person.class)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonView(Views.Person.class)
    private String firstName;

    @JsonView(Views.Person.class)
    private String lastName;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @MapKey
    private Address address;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @MapKey
    private Employer employer;

    public Long getId()
    {
        return id;
    }

    public void setId(final Long id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(final String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(final String lastName)
    {
        this.lastName = lastName;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(final Address address)
    {
        this.address = address;
    }

    public Employer getEmployer()
    {
        return employer;
    }

    public void setEmployer(final Employer employer)
    {
        this.employer = employer;
    }
}
