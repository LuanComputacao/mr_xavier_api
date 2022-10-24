package com.luancomputacao.mr_xavier_api.models;

import lombok.*;

import javax.persistence.*;


@Setter
@Getter
@NoArgsConstructor
@Entity
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    protected Long id;

    protected String uuid;
    private String cpf;
    private String name;
    private String phone;
    private String email;
    private String user;
    private String password;

    @Builder
    public User(Long id, String uuid, String cpf, String name, String phone, String email, String user, String password) {
        this.id = id;
        this.uuid = uuid;
        this.cpf = cpf;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.user = user;
        this.password = password;
    }
}
