package com.luancomputacao.mr_xavier_api.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

import static java.util.UUID.randomUUID;

@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    protected Long id;

    protected String uuid;

    public BaseEntity() {
        this.uuid = randomUUID().toString();
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
