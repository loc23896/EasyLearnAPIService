package com.easy.learn.controller;

import com.easy.learn.consts.ApiPath;
import com.easy.learn.dto.TrainerDTO;
import com.easy.learn.response.TrainerResponseDTO;
import com.easy.learn.service.TrainerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class TrainerController {
    @Autowired
    TrainerService service;

    @GetMapping(value = ApiPath.TRAINER_GET_ALL)
    public ResponseEntity<TrainerResponseDTO> getAllTrainer() {
        TrainerResponseDTO response = new TrainerResponseDTO();
        try {
            List<TrainerDTO> list = service.findAll();
            response.setList(list);
            response.setMessage("Success get all trainers");
            response.setErrorCode(200);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setMessage("Error when get all trainers:" + e);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = ApiPath.TRAINER_CREATE)
    public ResponseEntity<TrainerResponseDTO> createTrainer(@RequestBody TrainerDTO request) {
        TrainerResponseDTO response = new TrainerResponseDTO();
            if(service.findByUuid(request.getUuid())!=null) {
                response.setMessage("Dublicating UUID");
               return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST) ;
            }
            response.setData(request);
            response.setMessage("Create trainer success");
            response.setErrorCode(201);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


}
