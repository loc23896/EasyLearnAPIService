package com.easy.learn.mapper;

import com.easy.learn.dto.TrainerSalaryPaidSummaryDTO;
import com.easy.learn.entity.TrainerSalaryPaidSummary;

public class TrainerSalaryPaidSummaryMapper extends AbstractMapper<TrainerSalaryPaidSummary, TrainerSalaryPaidSummaryDTO>{
    public TrainerSalaryPaidSummaryMapper(){
        super(TrainerSalaryPaidSummary.class,TrainerSalaryPaidSummaryDTO.class);
    }
}
