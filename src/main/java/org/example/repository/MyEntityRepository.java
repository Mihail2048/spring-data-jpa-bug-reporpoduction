package org.example.repository;

import java.util.List;

import org.example.model.MyEntity;
import org.springframework.data.repository.CrudRepository;

public interface MyEntityRepository extends CrudRepository<MyEntity, Integer> {

    List<MyEntity> findByDependency_status(String status);
}