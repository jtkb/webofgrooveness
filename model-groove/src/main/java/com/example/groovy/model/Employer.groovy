package com.example.groovy.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Employer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id

    String name
}
