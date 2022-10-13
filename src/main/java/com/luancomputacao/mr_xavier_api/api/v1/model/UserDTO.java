package com.luancomputacao.mr_xavier_api.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements DataTransferObject {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String cpf;
    private String phone;

    public void setUserUrl(String s) {

    }
}
