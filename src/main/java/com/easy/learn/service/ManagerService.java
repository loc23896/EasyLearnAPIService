package com.easy.learn.service;

import com.easy.learn.dto.ManagerDTO;

public interface ManagerService extends BaseService<ManagerDTO>{
    ManagerDTO login(String name, String password);
}
