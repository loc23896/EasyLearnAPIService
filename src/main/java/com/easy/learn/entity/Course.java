package com.easy.learn.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "course")
@Getter
@Setter
public class Course extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime lastUpdate;



    @Column(length = 50)
    private String title;
    private String description;

    private String lessonsList;

}
