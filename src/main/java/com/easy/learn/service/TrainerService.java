package com.easy.learn.service;

import com.easy.learn.dto.TrainerDTO;
import com.easy.learn.entity.Trainer;

public interface TrainerService extends BaseService<TrainerDTO>{
    Trainer findByUuid(String uuid);
}
