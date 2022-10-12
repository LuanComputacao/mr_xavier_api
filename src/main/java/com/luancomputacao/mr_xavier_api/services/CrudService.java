package com.luancomputacao.mr_xavier_api.services;

import com.luancomputacao.mr_xavier_api.api.v1.model.DTO;
import com.luancomputacao.mr_xavier_api.models.BaseEntity;

import java.util.List;
import java.util.Set;

public interface CrudService<T extends BaseEntity,  ID extends Long, D extends DTO>{
    List<D> findAllDto();

    Set<T> findAll();

    D findByIdDto(ID id);

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}