package com.easy.learn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainerSalaryPaidDTO {
    private Long id;
    private String trainerSalaryPaidId;
    private String dataRecorded;
    private String paymentDate;
    private Double amount;
    private String transactionType;
    private boolean paymentMethod;
    private boolean description;
    private boolean creditDebit;
    private boolean status;
}
