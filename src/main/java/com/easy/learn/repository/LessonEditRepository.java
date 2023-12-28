package com.easy.learn.repository;

import com.easy.learn.entity.CourseEdit;
import com.easy.learn.entity.LessonEdit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LessonEditRepository extends JpaRepository<LessonEdit,Long> {
    Optional<LessonEdit> findById (Long id);
}
