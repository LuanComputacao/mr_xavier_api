package com.luancomputacao.mr_xavier_api.services;

import com.luancomputacao.mr_xavier_api.models.Subject;

import java.util.Set;

public interface SubjectService {
    Subject findById();

    Set<Subject> findAll();

    Subject save();
}
