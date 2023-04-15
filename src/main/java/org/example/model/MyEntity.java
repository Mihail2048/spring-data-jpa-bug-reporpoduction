package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class MyEntity {

    @Id
    private Integer id;

    private String type;

    private String position;

    @ManyToOne
    @JoinColumn(name = "dependency_id")
    private Dependency dependency;
}