package org.example.repository;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.example.model.MyEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyEntityRepositoryTest {

    @Autowired
    private MyEntityRepository myEntityRepository;

    @Test
    void whenFindByDependencyStatus_then2SelectsIssuedOneWithJoinAnotherIsJustWhy() {
        List<MyEntity> activeEntity = myEntityRepository.findByDependency_status("active");
        Assertions.assertThat(activeEntity).hasSize(1);
        Assertions.assertThat(activeEntity.get(0).getDependency()).isNotNull();
    }
}