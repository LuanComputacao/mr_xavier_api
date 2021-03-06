package com.luancomputacao.mr_xavier_api.services.map;

import com.luancomputacao.mr_xavier_api.models.Knowledge;
import com.luancomputacao.mr_xavier_api.services.CrudService;

import java.util.Set;

public class KnowledgeServiceMap  extends AbstractMapService<Knowledge, Long> implements CrudService<Knowledge, Long> {
    @Override
    public Set<Knowledge> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Knowledge object) {
        super.delete(object);
    }

    @Override
    public Knowledge save(Knowledge object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Knowledge findById(Long id) {
        return super.findById(id);
    }
}
