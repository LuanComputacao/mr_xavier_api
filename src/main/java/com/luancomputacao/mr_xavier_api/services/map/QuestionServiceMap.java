package com.luancomputacao.mr_xavier_api.services.map;

import com.luancomputacao.mr_xavier_api.models.Question;
import com.luancomputacao.mr_xavier_api.services.CrudService;

import java.util.Set;

public class QuestionServiceMap  extends AbstractMapService<Question, Long> implements CrudService<Question, Long> {
    @Override
    public Set<Question> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Question object) {
        super.delete(object);
    }

    @Override
    public Question save(Question object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Question findById(Long id) {
        return super.findById(id);
    }
}
