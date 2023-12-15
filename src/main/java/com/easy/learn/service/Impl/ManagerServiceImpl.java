package com.easy.learn.service.Impl;

import com.easy.learn.dto.ManagerDTO;
import com.easy.learn.mapper.ManagerMapper;
import com.easy.learn.entity.Manager;
import com.easy.learn.repository.ManagerRepository;
import com.easy.learn.service.ManagerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    ManagerRepository repository;

    @Autowired
    ManagerMapper mapper;

    @Override
    public ManagerDTO create(ManagerDTO dto) {
        ManagerDTO result = new ManagerDTO();
        try {
            Manager manager = mapper.convertDTOToEntity(dto);
            result =mapper.convertEntityToDTO(repository.saveAndFlush(manager));
        } catch (Exception ex) {
            log.error("Error when creating:", ex);
        }

        return result;
    }

    @Override
    public boolean update(ManagerDTO dto) {
        try {
            Manager manager = mapper.convertDTOToEntity(dto);
            mapper.convertEntityToDTO(repository.saveAndFlush(manager));
            return true;
        } catch (Exception ex) {
            log.error("Error when updating:", ex);
            return false;
        }
    }

    @Override
    public List<ManagerDTO> findAll() {
        List<Manager> managers = repository.findAll();
        return managers == null ? new ArrayList<>()
                : managers.stream().map(entity -> mapper.convertEntityToDTO(entity))
                .collect(Collectors.toList());
    }

    @Override
    public boolean delete(Long id) {
        Manager manager = repository.findById(id).get();
        if (manager != null) {
            repository.delete(manager);
            return true;
        }
        return false;
    }

    @Override
    public ManagerDTO login(String name, String password) {
        Manager manager = repository.findByUserNameManagerAndPassword(name, password);
        return manager == null ?  null : mapper.convertEntityToDTO(manager);
    }
}
