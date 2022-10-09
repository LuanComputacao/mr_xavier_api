package com.luancomputacao.mr_xavier_api.services.map;

import com.luancomputacao.mr_xavier_api.models.Professor;
import com.luancomputacao.mr_xavier_api.services.ProfessorService;

import java.util.Set;

public class ProfessorServiceMap  extends AbstractMapService<Professor, Long> implements ProfessorService {
    @Override
    public Set<Professor> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Professor object) {
        super.delete(object);
    }

    @Override
    public Professor save(Professor object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Professor findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Professor findByCpf() {
        return null;
    }
}
