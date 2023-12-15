package com.easy.learn.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_NULL) xóa khi chưa hiển thị
public class TrainerSalaryPaidDTO {
    private Long id;
    private String trainerSalaryPaidId;
    private Integer weekNumber;
    private Integer monthNumber;
    private Integer yearNumber;
    private Double totalNumber;
}
