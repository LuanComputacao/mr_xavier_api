package com.luancomputacao.mr_xavier_api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/professors")
@Controller
public class ProfessorController {

    @RequestMapping({"", "/"})
    public String listProfessors() {
        return "index";
    }

}
