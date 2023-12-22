package com.easy.learn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainerSalaryPaidSummaryDTO {
    private Long id;
    private String trainerSalaryPaidId;
    private Integer weekNumber;
    private Integer monthNumber;
    private Integer yearNumber;
    private Double totalNumber;
}
