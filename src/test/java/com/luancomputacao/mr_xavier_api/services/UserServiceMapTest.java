package com.luancomputacao.mr_xavier_api.services;

import com.luancomputacao.mr_xavier_api.api.v1.mapper.UserMapper;
import com.luancomputacao.mr_xavier_api.api.v1.model.UserDTO;
import com.luancomputacao.mr_xavier_api.models.User;
import com.luancomputacao.mr_xavier_api.repositories.UserRepository;

import com.luancomputacao.mr_xavier_api.services.mappers.UserServiceMap;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class UserServiceMapTest {

    public static final Long ID = 2L;
    public static final String NAME = "Jimmy";
    UserService userService;

    @Mock
    UserRepository userRepository;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        userService = new UserServiceMap(UserMapper.INSTANCE, userRepository);
    }

    @Test
    public void getAllUsers() {

        //given
        List<User> categories = Arrays.asList(new User(), new User(), new User());

        when(userRepository.findAll()).thenReturn(categories);

        //when
        List<UserDTO> userDTOS = userService.findAllDto();

        //then
        assertEquals(3, userDTOS.size());

    }

    // @Test
    // public void getUserByName() throws Exception {
    //
    //     //given
    //     User user = new User();
    //     user.setId(ID);
    //     user.setName(NAME);
    //
    //     when(userRepository.findByName(anyString())).thenReturn(user);
    //
    //     //when
    //     UserDTO userDTO = userService.getUserByName(NAME);
    //
    //     //then
    //     assertEquals(ID, userDTO.getId());
    //     assertEquals(NAME, userDTO.getName());
    //
    // }
}