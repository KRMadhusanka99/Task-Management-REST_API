package com.example.taskmanagementapp.repository;

import com.example.taskmanagementapp.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Tasks, Integer> {
}
