package com.example.taskmanagementapp.service.impl;

import com.example.taskmanagementapp.dto.request.TaskRequestDTO;
import com.example.taskmanagementapp.model.Tasks;
import com.example.taskmanagementapp.repository.TaskRepository;
import com.example.taskmanagementapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;
    @Override
    public Tasks save(TaskRequestDTO taskRequestDTO) {
        Tasks task = new Tasks(
                taskRequestDTO.getMemberId(),
                taskRequestDTO.getTaskName(),
                taskRequestDTO.getTaskDescription(),
                taskRequestDTO.getTaskStatus()
        );
        Tasks savedTask = taskRepository.save(task);
        return savedTask;
    }
}
