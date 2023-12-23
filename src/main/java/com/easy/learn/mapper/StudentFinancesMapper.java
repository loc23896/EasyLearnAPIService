package com.easy.learn.mapper;

import com.easy.learn.dto.StudentFinancesDTO;
import com.easy.learn.entity.StudentFinances;

public class StudentFinancesMapper extends AbstractMapper<StudentFinances, StudentFinancesDTO>{
    public StudentFinancesMapper(){
        super(StudentFinances.class, StudentFinancesDTO.class);
    }
}
