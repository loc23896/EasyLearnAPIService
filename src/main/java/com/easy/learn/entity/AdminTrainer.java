package com.easy.learn.entity;

import com.easy.learn.Enum.Gender;
import com.easy.learn.Enum.Status;
import com.easy.learn.configure.SwaggerConfig;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.id.UUIDGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "ADMIN_TRAINER")
@Setter
@Getter
public class AdminTrainer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //random uuid
    @Type(type="uuid-char")
    private UUID uuid = UUID.randomUUID();

    @Column(length = 30)
    private String firstName;
    @Column(length = 15)
    private String lastName;
    private String country;
    //account active or inactive
    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDate dob;
    private String email;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(length = 20)
    private String phoneNumber;
    @Column(length = 16)
    private String cardNumber;

    @OneToMany(mappedBy = "adminTrainer", cascade = CascadeType.ALL)
    Set<CourseEdit> courseEdits = new HashSet<>();



}
