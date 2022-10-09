package com.luancomputacao.mr_xavier_api.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Objects;
import java.util.Set;

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

    public Professor() {
        super();
    }

    public Professor(User user, String speciality) {
        this.user = user;
        this.speciality = speciality;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Set<Question> getQuestionSet() {
        return questionSet;
    }

    public void setQuestionSet(Set<Question> questionSet) {
        this.questionSet = questionSet;
    }

    public Set<Professor> getProfessorSet() {
        return professorSet;
    }

    public void setProfessorSet(Set<Professor> professorSet) {
        this.professorSet = professorSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;

        Professor professor = (Professor) o;

        if (getSpeciality() != null ? !getSpeciality().equals(professor.getSpeciality()) : professor.getSpeciality() != null)
            return false;
        if (getUser() != null ? !getUser().equals(professor.getUser()) : professor.getUser() != null) return false;
        if (getQuestionSet() != null ? !getQuestionSet().equals(professor.getQuestionSet()) : professor.getQuestionSet() != null)
            return false;
        return getProfessorSet() != null ? getProfessorSet().equals(professor.getProfessorSet()) : professor.getProfessorSet() == null;
    }

    @Override
    public int hashCode() {
        int result = getSpeciality() != null ? getSpeciality().hashCode() : 0;
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        result = 31 * result + (getQuestionSet() != null ? getQuestionSet().hashCode() : 0);
        result = 31 * result + (getProfessorSet() != null ? getProfessorSet().hashCode() : 0);
        return result;
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
