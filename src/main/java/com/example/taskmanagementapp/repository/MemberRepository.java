package com.example.taskmanagementapp.repository;

import com.example.taskmanagementapp.model.Members;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Members, Integer> {
}
