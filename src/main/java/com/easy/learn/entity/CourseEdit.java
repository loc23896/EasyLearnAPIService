package com.easy.learn.entity;

import com.easy.learn.Enum.Status;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "COURSE_EDIT")
@Setter
@Getter
public class CourseEdit extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime lastUpdate;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(length = 50)
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "AdminTrainer_Id")
    private AdminTrainer adminTrainer;

    @OneToMany(mappedBy = "courseEdit",cascade = CascadeType.ALL)
    Set<LessonEdit> lessonEdits = new HashSet<>();

    @PreUpdate
    protected void onUpdate(){
        lastUpdate = LocalDateTime.now();
    }



}
