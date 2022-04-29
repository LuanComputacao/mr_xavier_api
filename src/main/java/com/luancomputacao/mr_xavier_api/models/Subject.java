package com.luancomputacao.mr_xavier_api.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Objects;
import java.util.Set;

@Entity
public class Subject extends BaseEntity {
    private String name;

    @OneToMany
    @JoinColumn(name="subject_id")
    private Set<Question> questions;

    public Subject() {
        super();
    }

    public Subject(Long id, String uuid, String name) {
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
        Subject subject = (Subject) o;
        return Objects.equals(id, subject.id) && Objects.equals(uuid, subject.uuid) && Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uuid, name);
    }


    @Override
    public String toString() {
        return "Subject{" +
                "id='" + id + '\'' +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
