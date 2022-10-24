package com.luancomputacao.mr_xavier_api.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

import static java.util.UUID.randomUUID;

@Getter
@Setter
@AllArgsConstructor
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

    public BaseEntity(Long id) {
        this.id = id;
        this.uuid = randomUUID().toString();
    }
}
