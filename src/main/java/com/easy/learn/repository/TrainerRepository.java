package com.easy.learn.repository;



import com.easy.learn.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainer , Long> {
    Trainer findByUuid(String uuid);
}
