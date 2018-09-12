package com.example.groovy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    @OneToOne
    private Address address;

    private Vehicle vehicle;

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

    public Vehicle getVehicle()
    {
        return vehicle;
    }

    public void setVehicle(final Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

}
