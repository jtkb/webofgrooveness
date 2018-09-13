package com.example.groovy.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "address")
class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id

    String firstLine

    String lastLine;

    String postCode;
}
