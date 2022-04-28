package com.luancomputacao.mr_xavier_api.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Objects;
import java.util.Set;

@Entity
public class Professor extends BaseModel {
    private String name;
    private String phone;
    private String email;
    private String user;
    private String password;

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

    public Professor(Long id, String uuid, String name, String phone, String email, String user, String password) {
        super(id, uuid);
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.user = user;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(name, professor.name) && Objects.equals(phone, professor.phone) && Objects.equals(email, professor.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, email);
    }
}
