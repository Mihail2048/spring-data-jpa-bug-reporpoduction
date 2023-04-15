package org.example;

import org.example.repository.MyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    @Autowired
    private MyEntityRepository myEntityRepository;

    public static void main( String[] args ) {
        SpringApplication.run(Application.class, args);
    }
}