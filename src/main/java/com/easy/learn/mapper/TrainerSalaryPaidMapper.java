package com.easy.learn.mapper;

import com.easy.learn.dto.TrainerSalaryPaidDTO;
import com.easy.learn.dto.UserDTO;
import com.easy.learn.entity.TrainerSalaryPaid;
import com.easy.learn.entity.User;
import org.springframework.stereotype.Service;

@Service
public class TrainerSalaryPaidMapper extends AbstractMapper<TrainerSalaryPaid, TrainerSalaryPaidDTO>{

    public TrainerSalaryPaidMapper(){ super(TrainerSalaryPaid.class,
            TrainerSalaryPaidDTO.class);}
}
