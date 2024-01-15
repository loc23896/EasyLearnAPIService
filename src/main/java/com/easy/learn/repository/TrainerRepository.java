package com.easy.learn.repository;



import com.easy.learn.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrainerRepository extends JpaRepository<Trainer , Long> {
    Trainer findByUuid(String uuid);
    @Query("SELECT t FROM Trainer t WHERE t.id IN (SELECT tsp.trainerId FROM TrainerSalaryPaid tsp WHERE tsp.active = 0)")
    List<Trainer> findTrainersNotInSalaryPaid();
}
