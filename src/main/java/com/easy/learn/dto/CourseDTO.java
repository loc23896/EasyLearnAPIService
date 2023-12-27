package com.easy.learn.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonInclude(JsonInclude.Include.NON_NULL)
@EqualsAndHashCode
@Data
public class CourseDTO {
    private Long id;
    private String title;
    private String description;
    private double price;
    private int totalVideos;
    private String level;
    private double rating;
}
