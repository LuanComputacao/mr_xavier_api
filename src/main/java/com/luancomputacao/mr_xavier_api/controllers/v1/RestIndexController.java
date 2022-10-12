package com.luancomputacao.mr_xavier_api.controllers.v1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({RestIndexController.BASE_URL, RestIndexController.BASE_URL + "/"})
public class RestIndexController {
    public static final String BASE_URL = "/api/v1";

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String index() {
        return "Welcome to Mr. Xavier API";
    }
}
