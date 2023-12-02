package com.easy.learn.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

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

    @Column(name = "WEEK_NUMBER")
    private Integer weekNumber;

    @Column(name = "MONTH_NUMBER")
    private Integer monthNumber;

    @Column(name = "YEAR_NUMBER")
    private Integer yearNumber;

    @Column(name = "TOTAL_NUMBER")
    private Double totalNumber;
}
