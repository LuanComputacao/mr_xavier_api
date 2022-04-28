package com.luancomputacao.mr_xavier_api.services;

import com.luancomputacao.mr_xavier_api.models.Question;

import java.util.Set;

public interface QuestionService {
    Question findById();

    Set<Question> findAll();

    Question save();
}
