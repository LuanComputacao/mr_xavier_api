package com.luancomputacao.mr_xavier_api.services.map;

import com.luancomputacao.mr_xavier_api.models.Knowledge;
import com.luancomputacao.mr_xavier_api.services.KnowledgeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class KnowledgeServiceMap  extends AbstractMapService<Knowledge, Long> implements KnowledgeService {
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
