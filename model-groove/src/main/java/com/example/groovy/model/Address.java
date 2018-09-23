package com.example.groovy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "address")
public class Address implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String firstLine;

    String lastLine;

    String postCode;

    public Long getId()
    {
        return id;
    }

    public void setId(final Long id)
    {
        this.id = id;
    }

    public String getFirstLine()
    {
        return firstLine;
    }

    public void setFirstLine(final String firstLine)
    {
        this.firstLine = firstLine;
    }

    public String getLastLine()
    {
        return lastLine;
    }

    public void setLastLine(final String lastLine)
    {
        this.lastLine = lastLine;
    }

    public String getPostCode()
    {
        return postCode;
    }

    public void setPostCode(final String postCode)
    {
        this.postCode = postCode;
    }
}
