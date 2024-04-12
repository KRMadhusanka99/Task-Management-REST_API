package com.example.taskmanagementapp.service;

import com.example.taskmanagementapp.dto.request.TaskRequestDTO;
import com.example.taskmanagementapp.dto.response.TaskResponseDTO;
import com.example.taskmanagementapp.model.Tasks;

public interface TaskService {

    Tasks save(TaskRequestDTO taskRequestDTO);
}
