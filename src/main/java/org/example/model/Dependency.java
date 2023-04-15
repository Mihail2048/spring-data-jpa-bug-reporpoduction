package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dependency {

    @Id
    private Integer id;

    private String status;
}