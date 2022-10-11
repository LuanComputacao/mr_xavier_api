package com.luancomputacao.mr_xavier_api.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Objects;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Professor extends BaseEntity {

    private String speciality;

    @OneToOne
    private User user;

    // RELATIONSHIPS
    @OneToMany
    @JoinColumn(name = "professor_id")
    private Set<Question> questionSet;
    @OneToMany
    @JoinColumn(name = "professor_id")
    private Set<Professor> professorSet;

    @Builder
    public Professor(User user, String speciality) {
        super();
        this.user = user;
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", speciality='" + speciality + '\'' +
                ", user=" + user +
                ", questionSet=" + questionSet +
                ", professorSet=" + professorSet +
                '}';
    }
}
