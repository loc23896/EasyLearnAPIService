package com.easy.learn.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TRAINER_SALARY_PAID")
@Getter
@Setter
public class TrainerSalaryPaid extends BaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "TRAINER_SLR_PAID_ID", length = 5)
    private String trainerSalaryPaidId;

    @Column(name = "DATA_RECORDED")
    private String dataRecorded;

    @Column(name = "PAYMENT_DATE")
    private Date paymentDate;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;

    @Column(name = "PAYMENT_METHOD")
    private boolean paymentMethod;

    @Column(name = "DESCRIPTION")
    private boolean description;

    @Column(name = "CREDIT_DEBIT_CARD")
    private String creditDebit;

    @Column(name = "STATUS")
    private boolean status;

}
