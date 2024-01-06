package com.easy.learn.service;


import com.easy.learn.dto.LessonEditDTO;

public interface LessonEditService extends BaseService<LessonEditDTO>{
    boolean delete(Long id);

    LessonEditDTO saveOrUpdate(LessonEditDTO lessonEditDTO);

    LessonEditDTO findByLessonEditId(Long id);
}
