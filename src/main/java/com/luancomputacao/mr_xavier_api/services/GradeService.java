package com.luancomputacao.mr_xavier_api.services;

import com.luancomputacao.mr_xavier_api.models.Grade;

import java.util.Set;

public interface GradeService {

    Grade findById();

    Set<Grade> findAll();

    Grade save();
}
