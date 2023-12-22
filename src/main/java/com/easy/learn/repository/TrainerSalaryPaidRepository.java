package com.easy.learn.repository;

import com.easy.learn.entity.TrainerSalaryPaid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrainerSalaryPaidRepository extends JpaRepository<TrainerSalaryPaid, Long> {
    Optional<TrainerSalaryPaid> findById (Long id);
}
