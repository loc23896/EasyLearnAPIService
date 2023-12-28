package com.easy.learn.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "LESSON_EDIT")
@Setter
@Getter
public class LessonEdit extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String name;

    @ManyToOne
    @JoinColumn(name = "Course_id")
    private CourseEdit courseEdit;

    @OneToOne
    @JoinColumn(name = "testEdit_id")
    private TestEdit testEdit;


    private LocalDateTime lastUpdate;
    @PreUpdate
    protected void onUpdate(){
        lastUpdate = LocalDateTime.now();
    }
}



