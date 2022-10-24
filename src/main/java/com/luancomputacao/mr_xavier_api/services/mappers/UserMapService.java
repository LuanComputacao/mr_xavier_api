package com.luancomputacao.mr_xavier_api.services.mappers;

import com.luancomputacao.mr_xavier_api.api.v1.model.UserDTO;
import com.luancomputacao.mr_xavier_api.models.User;
import com.luancomputacao.mr_xavier_api.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceMap extends AbstractMapService<User, Long, UserDTO> implements UserService {


    @Override
    public List<UserDTO> findAllDto() {
        return super.findAllDto();
    }

    @Override
    public Set<User> findAll() {
        return super.findAll();
    }

    @Override
    public UserDTO findByIdDto(Long aLong) {
        return null;
    }

    @Override
    public User findById(Long aLong) {
        return null;
    }

    @Override
    public void delete(User object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public UserDTO findByName(String name) {
        return null;
    }
}
