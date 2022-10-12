package com.luancomputacao.mr_xavier_api.api.v1.mapper;

import com.luancomputacao.mr_xavier_api.api.v1.model.UserDTO;
import com.luancomputacao.mr_xavier_api.models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserMapperTest {

    public static final String NAME = "Luan";
    public static final Long ID = 1L;

    UserMapper userMapper = UserMapper.INSTANCE;

    @Test
    public void userToUserDTO() throws Exception{
        //given
        User user = new User();
        user.setName(NAME);
        user.setId(ID);

        //when
        UserDTO userDTO = userMapper.userToUserDTO(user);

        //then
        assertEquals(ID, userDTO.getId());
        assertEquals(NAME, userDTO.getName());
    }

    @Test
    public void userDToToUser() throws Exception{
        //given
        UserDTO userDTO = new UserDTO();
        userDTO.setName(NAME);
        userDTO.setId(ID);

        //when
        User user = userMapper.userDTOToUser(userDTO);

        //then
        assertEquals(ID, user.getId());
        assertEquals(NAME, user.getName());
    }

}