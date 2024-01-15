package com.easy.learn.service;


import com.easy.learn.dto.TestEditDTO;
import com.easy.learn.entity.TestEdit;

import java.util.List;

public interface TestEditService extends BaseService<TestEditDTO>{
    boolean delete(Long id);

    TestEditDTO saveOrUpdate(TestEditDTO testEditDTO);

    TestEditDTO findByTestEditId(Long id);

    List<TestEditDTO> getAllTestByLessonId(Long id);

    boolean deleteAllTestByLessonId(Long id);

    List<TestEditDTO> saveListTest (List<TestEditDTO> testEditDTOS);

//    List<TestEditDTO> findTestByCourseId(Long id);

}
