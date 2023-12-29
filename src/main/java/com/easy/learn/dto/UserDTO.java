package com.easy.learn.dto;

import com.easy.learn.Enum.Role;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;


@JsonInclude(JsonInclude.Include.NON_NULL)
@EqualsAndHashCode
@Data
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
}
