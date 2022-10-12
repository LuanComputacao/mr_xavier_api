package com.luancomputacao.mr_xavier_api.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

@Data
@Entity
public class Grade extends BaseEntity {
    private String name;

    // RELATIONSHIPS
    @ManyToMany
    private Set<Question> questionSet;

    @ManyToOne
    private Professor professor;

    public Grade(String name, Set<Question> questionSet, Professor professor) {
        this.name = name;
        this.questionSet = questionSet;
        this.professor = professor;
    }

    public Grade() {

    }
}
