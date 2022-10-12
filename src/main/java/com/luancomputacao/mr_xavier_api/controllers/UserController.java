package com.luancomputacao.mr_xavier_api.controllers;

import com.luancomputacao.mr_xavier_api.api.v1.model.UserDTO;
import com.luancomputacao.mr_xavier_api.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping(UserController.BASE_URL)
public class UserController {
    public static final String BASE_URL = "/users";

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String listUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users/index";
    }


}
