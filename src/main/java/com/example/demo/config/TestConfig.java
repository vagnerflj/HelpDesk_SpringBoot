package com.example.demo.config;

import com.example.demo.services.DBService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private DBService dbService;

    @PostConstruct
    public void instanciaDB(){
        this.dbService.instanciaDB();
    }

}
