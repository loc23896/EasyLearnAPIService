package com.easy.learn.service.Impl;

import com.easy.learn.dto.TrainerDTO;
import com.easy.learn.entity.Trainer;
import com.easy.learn.mapper.TrainerMapper;
import com.easy.learn.repository.TrainerRepository;
import com.easy.learn.service.TrainerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class TrainerServiceImpl implements TrainerService {
    @Autowired
    TrainerRepository repo;

    @Autowired
    TrainerMapper mapper;

    @Override
    public TrainerDTO create(TrainerDTO dto) {
        TrainerDTO result = new TrainerDTO();
        try {
            Trainer trainer = mapper.convertDTOToEntity(dto);
            result = mapper.convertEntityToDTO(repo.saveAndFlush(trainer));
        } catch (Exception ex) {
            log.error("Error when creating:", ex);
        }

        return result;
    }

    @Override
    public boolean update(TrainerDTO dto) {
        try {
            Trainer trainer = mapper.convertDTOToEntity(dto);
            mapper.convertEntityToDTO(repo.saveAndFlush(trainer));
            return true;
        } catch (Exception ex) {
            log.error("Error when updating:", ex);
            return false;
        }
    }

    @Override
    public List<TrainerDTO> findAll() {
        List<Trainer> trainers = repo.findAll();
        return trainers == null ? new ArrayList<>()
                : trainers.stream().map(entity -> mapper.convertEntityToDTO(entity))
                .collect(Collectors.toList());
    }

    @Override
    public boolean delete(String uuid) {
        Trainer trainer = repo.findByUuid(uuid);
        if (trainer != null) {
            repo.delete(trainer);
            return true;
        }
        return false;
    }


    @Override
    public Trainer findByUuid(String uuid) {
        return repo.findByUuid(uuid);
    }
}
