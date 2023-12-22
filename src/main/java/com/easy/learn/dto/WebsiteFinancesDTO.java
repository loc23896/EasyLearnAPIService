package com.easy.learn.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonInclude(JsonInclude.Include.NON_NULL)
@EqualsAndHashCode
@Data
public class WebsiteFinancesDTO {
    private Long id;
    private String dataRecorded;
    private String paymentDate;
    private Double amount;
    private String transactionType;
    private boolean paymentMethod;
    private boolean description;
}
