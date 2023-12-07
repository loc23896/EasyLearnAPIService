package com.easy.learn.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="manager")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id ;
    @Column(name = "uuid", length = 5)
    private String uuid;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    @Column(name = "username")
    private String userNameManager;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;
    @NotNull (message = "is required")
    @Size(min=1, message = "is required")
    @Column(name = "password")
    private String password;
    @Column(name = "managementType")
    private String managementType;

    public Manager(String uuid, String firstName, String lastName, String usernamemanager, String email, String address, String phone, String password, String managementType) {
        this.uuid = uuid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userNameManager = usernamemanager;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.password = password;
        this.managementType = managementType;
    }

}
