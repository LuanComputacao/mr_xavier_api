package com.luancomputacao.mr_xavier_api.services;

import com.luancomputacao.mr_xavier_api.api.v1.model.UserDTO;
import com.luancomputacao.mr_xavier_api.models.User;

import java.util.List;
import java.util.Set;

public interface UserService extends CrudService<User, Long, UserDTO> {

    UserDTO findByName(String name);
}
