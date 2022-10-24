package com.luancomputacao.mr_xavier_api.services.mappers;

import com.luancomputacao.mr_xavier_api.api.v1.model.DataTransferObject;
import com.luancomputacao.mr_xavier_api.models.BaseEntity;
import org.springframework.stereotype.Service;

import java.util.*;


public abstract class AbstractMapService<T extends BaseEntity, ID extends Long, DTO extends DataTransferObject> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    public abstract DTO findByIdDto(ID id);

    public T findById(ID id) {
        return null;
    }

    public T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    private Long getNextId() {
        try{
            return Collections.max(map.keySet()) + 1;
        } catch (Exception e) {
            return 1L;
        }
    }

    public abstract void delete(T object);

    public abstract void deleteById(ID id);


    protected List<DTO> findAllDto() {
        return null;
    }
}
