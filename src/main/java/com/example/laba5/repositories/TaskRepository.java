package com.example.laba5.repositories;

import com.example.laba5.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<com.example.laba5.models.Task, Long> {
}