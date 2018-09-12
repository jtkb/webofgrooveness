package com.example.groovy.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = {"com.example.groovy.model"})
public class ModelConfiguration
{
}
