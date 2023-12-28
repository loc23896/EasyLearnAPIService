package com.easy.learn.repository;

import com.easy.learn.entity.AdminTrainer;
import com.easy.learn.entity.TrainerSalaryPaid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminTrainerRepository extends JpaRepository<AdminTrainer,Long> {
    Optional<AdminTrainer> findById (Long id);
}
