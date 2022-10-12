package com.luancomputacao.mr_xavier_api.controllers.v1;

import com.luancomputacao.mr_xavier_api.api.v1.model.UserDTO;
import com.luancomputacao.mr_xavier_api.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UserRestController.BASE_URL)
public class UserRestController {
    public static final String BASE_URL = "/api/v1/users";

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserDTO> getAllUsers() {
        return userService.findAllDto();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO getUserById(@PathVariable Long id) {
        return userService.findByIdDto(id);
    }
}
