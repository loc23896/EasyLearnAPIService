package com.easy.learn.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;


@JsonInclude(JsonInclude.Include.NON_NULL)
@EqualsAndHashCode
@Data
public class TrainerSalaryPaidDTO {
    private Long id;
    private String trainerSalaryPaidId;
    private Integer weekNumber;
    private Integer monthNumber;
    private Integer yearNumber;
    private double totalNumber;

}
