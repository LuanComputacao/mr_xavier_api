package com.luancomputacao.mr_xavier_api.models;

import lombok.*;

import javax.persistence.*;


@Data
@EqualsAndHashCode(callSuper = false)
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

}
