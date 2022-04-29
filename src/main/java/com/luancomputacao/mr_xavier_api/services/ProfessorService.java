package com.luancomputacao.mr_xavier_api.services;

import com.luancomputacao.mr_xavier_api.models.Professor;

public interface ProfessorService extends CrudService<Professor, Long> {

    Professor findByCpf();

}
