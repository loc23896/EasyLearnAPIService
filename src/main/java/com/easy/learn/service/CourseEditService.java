package com.easy.learn.service;


import com.easy.learn.dto.CourseEditDTO;

public interface CourseEditService extends BaseService<CourseEditDTO>{
    boolean delete(Long id);

    CourseEditDTO findByCourseEditId(Long id);
}
