package com.luancomputacao.mr_xavier_api.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Objects;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Knowledge extends BaseEntity {
    private String name;
    @ManyToMany
    private Set<Question> questionSet;


    public Knowledge(Long id, String uuid, String name) {
        super();
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
