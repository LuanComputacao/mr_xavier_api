package com.luancomputacao.mr_xavier_api.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Objects;
import java.util.Set;

@Entity
public class Knowledge extends BaseEntity {
    private String name;
    @ManyToMany
    private Set<Question> questionSet;

    public Knowledge() {
        super();
    }

    public Knowledge(Long id, String uuid, String name) {
        super(id, uuid);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knowledge knowledge = (Knowledge) o;
        return Objects.equals(name, knowledge.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
