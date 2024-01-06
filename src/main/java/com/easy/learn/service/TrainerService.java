package com.easy.learn.service;

import com.easy.learn.dto.TrainerDTO;

public interface TrainerService extends BaseService<TrainerDTO>{

    TrainerDTO findById(Long id);
}