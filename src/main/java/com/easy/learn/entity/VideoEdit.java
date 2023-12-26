package com.easy.learn.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "VIDEO_EDIT")
@Setter
@Getter
public class VideoEdit extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "videoEdit_id")
    private Long id;
    private String videoURL;
    private String name;

    @OneToOne(mappedBy = "videoEdit")
    private LessonEdit lessonEdit;
}
