package com.luancomputacao.mr_xavier_api.services;

import com.luancomputacao.mr_xavier_api.models.Professor;

import java.util.Set;

public interface ProfessorService {

    Professor findById();

    Professor findByCpf();

    Set<Professor> findAll();

    Professor save();
}
