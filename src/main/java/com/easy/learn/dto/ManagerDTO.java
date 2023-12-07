package com.easy.learn.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonInclude(JsonInclude.Include.NON_NULL)
@EqualsAndHashCode
@Data
public class ManagerDTO {
    private Long id;
    private String uuid;
    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private String address;
    private String phone;
    private String password;
    private String managementtype;
}
