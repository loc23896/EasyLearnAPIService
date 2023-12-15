package com.easy.learn.repository;

import com.easy.learn.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {
    Manager findByUserNameManagerAndPassword(String userNameManager, String password);
    Manager findByUuid(String uuid);
}
