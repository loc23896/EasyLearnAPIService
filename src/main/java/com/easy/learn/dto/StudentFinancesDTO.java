package com.easy.learn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentFinancesDTO {
    private Long id;
    private String dataRecorded;
    private String courseName;
    private String paymentDate;
    private Double amount;
    private String transactionType;
    private boolean paymentMethod;
    private boolean description;
    private boolean creditDebit;
    private boolean status;
}
