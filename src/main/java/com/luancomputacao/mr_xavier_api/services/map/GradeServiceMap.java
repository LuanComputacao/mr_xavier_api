package com.luancomputacao.mr_xavier_api.services.map;

import com.luancomputacao.mr_xavier_api.models.Grade;
import com.luancomputacao.mr_xavier_api.services.GradeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class GradeServiceMap extends AbstractMapService<Grade, Long> implements GradeService {
    @Override
    public Set<Grade> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Grade object) {
        super.delete(object);
    }

    @Override
    public Grade save(Grade object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Grade findById(Long id) {
        return super.findById(id);
    }
}
