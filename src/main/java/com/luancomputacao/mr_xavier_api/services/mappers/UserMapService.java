package com.luancomputacao.mr_xavier_api.services.mappers;

import com.luancomputacao.mr_xavier_api.api.v1.mapper.UserMapper;
import com.luancomputacao.mr_xavier_api.api.v1.model.UserDTO;
import com.luancomputacao.mr_xavier_api.models.User;
import com.luancomputacao.mr_xavier_api.services.UserService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Profile({"default", "map"})
public class UserMapService extends AbstractMapService<User, Long, UserDTO> implements UserService {

    private final UserMapper userMapper;

    public UserMapService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDTO> findAllDto() {
        return super.findAll().stream().map(userMapper::userToUserDTO).collect(Collectors.toList());
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
        return super.findById(aLong);
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
