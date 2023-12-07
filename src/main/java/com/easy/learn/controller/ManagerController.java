package com.easy.learn.controller;

import com.easy.learn.consts.ApiPath;
import com.easy.learn.dto.ManagerDTO;
import com.easy.learn.response.ManagerResponseDTO;
import com.easy.learn.service.ManagerService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Slf4j
public class ManagerController {
    @Autowired
    ManagerService service;

    @GetMapping(value = ApiPath.MANAGER_GET_ALL)
    public ResponseEntity<ManagerResponseDTO> getAllManagers() {
        ManagerResponseDTO response = new ManagerResponseDTO();
        try {
            List<ManagerDTO> list = service.findAll();
            response.setList(list);
            response.setMessage("Success get all managers");
            response.setErrorCode(200);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setMessage("Error when get all managers:" + e);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = ApiPath.MANAGER_SIGN_IN)
    public ResponseEntity<ManagerResponseDTO> signIn(@RequestBody ManagerDTO request) {
        ManagerResponseDTO response = new ManagerResponseDTO();
        try {
            ManagerDTO manager = service.login(request.getUsername(), request.getPassword());
            if (manager != null && manager.getId() != null) {
                response.setData(manager);
                response.setMessage("Success sign in");
                response.setErrorCode(200);
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
            response.setMessage("UserName or password incorrect!!");
            response.setErrorCode(400);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setMessage("Error when signIn:" + e);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
