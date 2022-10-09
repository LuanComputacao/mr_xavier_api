package com.luancomputacao.mr_xavier_api.models;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class User extends BaseEntity {
    private String cpf;
    private String name;
    private String phone;
    private String email;
    private String user;
    private String password;

    public User() {
        super();
    }

    public User(String cpf, String name, String phone, String email, String user, String password) {
        this.cpf = cpf;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.user = user;
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        User user1 = (User) o;
        return Objects.equals(cpf, user1.cpf) &&
                Objects.equals(name, user1.name) &&
                Objects.equals(phone, user1.phone) &&
                Objects.equals(email, user1.email) &&
                Objects.equals(user, user1.user) &&
                Objects.equals(password, user1.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, name, phone, email, user, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "cpf='" + cpf + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
