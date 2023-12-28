package com.easy.learn.repository;

import com.easy.learn.entity.CourseEdit;
import com.easy.learn.entity.VideoEdit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VideoEditRepository extends JpaRepository<VideoEdit,Long> {
    Optional<VideoEdit> findById (Long id);
}
