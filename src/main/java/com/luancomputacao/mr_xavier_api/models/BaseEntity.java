package com.luancomputacao.mr_xavier_api.models;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    protected Long id;

    protected String uuid;

    public BaseEntity() {
    }

    public BaseEntity(Long id, String uuid) {
        this.id = id;
        this.uuid = uuid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
