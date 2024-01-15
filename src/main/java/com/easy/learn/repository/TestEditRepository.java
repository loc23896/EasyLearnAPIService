package com.easy.learn.repository;

import com.easy.learn.dto.TestEditDTO;
import com.easy.learn.entity.CourseEdit;
import com.easy.learn.entity.LessonEdit;
import com.easy.learn.entity.TestEdit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.Optional;

public interface TestEditRepository extends JpaRepository<TestEdit,Long> {
    Optional<TestEdit> findById (Long id);

    @Query("SELECT l FROM TestEdit l WHERE l.lessonEditId = ?1")
    List<TestEdit> getAllTestByLessonId(Long id);

//    @Query("SELECT t FROM CourseEdit c JOIN c.lessonList l JOIN l.testEdit t WHERE c.id = ?1")
//    List<TestEdit> findTestByCourseId(Long id);





}
