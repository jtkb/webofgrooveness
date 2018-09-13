package com.example.groovy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Vehicle implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String manufacturer;

    private String model;

    private String colour;

    public Long getId()
    {
        return id;
    }

    public void setId(final Long id)
    {
        this.id = id;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(final String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(final String model)
    {
        this.model = model;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(final String colour)
    {
        this.colour = colour;
    }
}
