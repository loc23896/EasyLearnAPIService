package com.easy.learn.controller;

import com.easy.learn.consts.ApiPath;
import com.easy.learn.dto.TrainerSalaryPaidDTO;
import com.easy.learn.response.TrainerSalaryPaidResponseDTO;
import com.easy.learn.service.TrainerSalaryPaidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class TrainerSalaryPaidController {
     @Autowired
     TrainerSalaryPaidService service;

    @GetMapping(value = ApiPath.TRAINER_SALARY_GET_ALL)
    public ResponseEntity<TrainerSalaryPaidResponseDTO> getAllTrainerSalaryPaid() {
        TrainerSalaryPaidResponseDTO response = new TrainerSalaryPaidResponseDTO();
        try {
            List<TrainerSalaryPaidDTO> list = service.findAll();
            response.setList(list);
            response.setMessage("Success get all users");
            response.setErrorCode(200);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setMessage("Error when get all users:" + e);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
