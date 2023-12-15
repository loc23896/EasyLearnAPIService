package com.easy.learn.service.Impl;

import com.easy.learn.dto.TrainerSalaryPaidDTO;
import com.easy.learn.entity.TrainerSalaryPaid;
import com.easy.learn.mapper.TrainerSalaryPaidMapper;
import com.easy.learn.repository.TrainerSalaryPaidRepository;
import com.easy.learn.service.TrainerSalaryPaidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class TrainerSalaryPaidServiceImpl implements TrainerSalaryPaidService {
    @Autowired
    TrainerSalaryPaidRepository repository;

    @Autowired
    TrainerSalaryPaidMapper mapper;

    @Override
    public TrainerSalaryPaidDTO create(TrainerSalaryPaidDTO tspDTO) {
        TrainerSalaryPaidDTO result = new TrainerSalaryPaidDTO();
        try {
            TrainerSalaryPaid tsp = mapper.convertDTOToEntity(tspDTO);
            result = mapper.convertEntityToDTO(repository.saveAndFlush(tsp));
        } catch (Exception e) {
            log.error("Error when creating:", e);
        }
        return result;

    }

    @Override
    public boolean update(TrainerSalaryPaidDTO dto) {
        try {
            TrainerSalaryPaid tsp = mapper.convertDTOToEntity(dto);
            mapper.convertEntityToDTO(repository.saveAndFlush(tsp));
            return true;
        } catch (Exception e) {
            log.error("Error when creating:", e);
            return false;
        }
    }

    @Override
    public List<TrainerSalaryPaidDTO> findAll() {
        List<TrainerSalaryPaid> tsp = repository.findAll();
        return tsp == null ? new ArrayList<>() :
                tsp.stream().map(entity -> mapper.convertEntityToDTO(entity)).collect(Collectors.toList());
    }


    @Override
    public boolean delete(Long id) {
        TrainerSalaryPaid tsp = repository.findById(id).get();
        if (tsp != null) {
            repository.delete(tsp);
            return true;
        }
        return false;
    }

    @Override
    public TrainerSalaryPaidDTO findByTrainerSalaryPaidId(Long id) {
        TrainerSalaryPaid entity = repository.findById(id) != null ? repository.findById(id).get() : new TrainerSalaryPaid();

        return mapper.convertEntityToDTO(entity);
    }
}
