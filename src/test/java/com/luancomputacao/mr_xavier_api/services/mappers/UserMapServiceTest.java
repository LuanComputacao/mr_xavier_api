package com.luancomputacao.mr_xavier_api.services.mappers;

import com.luancomputacao.mr_xavier_api.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserMapServiceTest {

    UserMapService userMapService;

    @BeforeEach
    void setUp() {
        userMapService = new UserMapService(userMapper);
        userMapService.save(User.builder().id(1L).build());
    }

    @Test
    void findAll() {
    }

    @Test
    void save() {
    }

    @Test
    void findAllDto() {
    }

    @Test
    void testFindAllDto() {
    }

    @Test
    void testFindAll() {
    }

    @Test
    void findByIdDto() {
    }

    @Test
    void findById() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void findByName() {
    }
}