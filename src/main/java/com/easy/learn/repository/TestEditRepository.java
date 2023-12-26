package com.easy.learn.repository;

import com.easy.learn.entity.CourseEdit;
import com.easy.learn.entity.TestEdit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TestEditRepository extends JpaRepository<TestEdit,Long> {
    Optional<TestEdit> findById (Long id);
}
