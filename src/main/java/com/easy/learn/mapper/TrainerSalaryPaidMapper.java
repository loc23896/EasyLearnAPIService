package com.easy.learn.mapper;

import com.easy.learn.dto.TrainerSalaryPaidSummaryDTO;
import com.easy.learn.entity.TrainerSalaryPaidSummary;
import org.springframework.stereotype.Service;

@Service
public class TrainerSalaryPaidMapper extends AbstractMapper<TrainerSalaryPaidSummary, TrainerSalaryPaidSummaryDTO>{

    public TrainerSalaryPaidMapper(){ super(TrainerSalaryPaidSummary.class,
            TrainerSalaryPaidSummaryDTO.class);}
}
