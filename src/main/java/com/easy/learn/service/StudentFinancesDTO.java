package com.easy.learn.service;

public interface StudentFinancesDTO extends BaseService<StudentFinancesDTO>{
    boolean delete(Long id);
    StudentFinancesDTO findById(Long id);
}
