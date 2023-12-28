package com.easy.learn.dto;

import com.easy.learn.Enum.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseEditDTO {
    private Long id;
    private LocalDateTime lastUpdate;
    private Status status;
    private String title;
    private String description;
    private String img;
    private String file;
}
