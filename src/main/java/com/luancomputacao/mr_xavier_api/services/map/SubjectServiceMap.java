package com.luancomputacao.mr_xavier_api.services.map;

import com.luancomputacao.mr_xavier_api.models.Subject;
import com.luancomputacao.mr_xavier_api.services.CrudService;

import java.util.Set;

public class SubjectServiceMap  extends AbstractMapService<Subject, Long> implements CrudService<Subject, Long> {
    @Override
    public Set<Subject> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Subject object) {
        super.delete(object);
    }

    @Override
    public Subject save(Subject object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Subject findById(Long id) {
        return super.findById(id);
    }
}
