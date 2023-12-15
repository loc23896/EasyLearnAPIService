package com.easy.learn.repository;

import com.easy.learn.entity.TrainerSalaryPaid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrainerSalaryPaidRepository extends JpaRepository<TrainerSalaryPaid, Long> {
    Optional<TrainerSalaryPaid> findById (Long id);
}
