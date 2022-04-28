package com.luancomputacao.mr_xavier_api.services;

import com.luancomputacao.mr_xavier_api.models.Knowledge;

import java.util.Set;

public interface KnowledgeService {
    Knowledge findById();

    Set<Knowledge> findAll();

    Knowledge save();
}
