package com.example.taskmanagementapp.controller;

import com.example.taskmanagementapp.dto.request.TaskRequestDTO;
import com.example.taskmanagementapp.dto.response.TaskResponseDTO;
import com.example.taskmanagementapp.model.Tasks;
import com.example.taskmanagementapp.service.TaskService;
import com.example.taskmanagementapp.service.impl.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    TaskService taskService;
    @PostMapping("/add")
    public ResponseEntity<TaskResponseDTO> addTask(@RequestBody TaskRequestDTO taskRequestDTO) {
        Tasks tasks = taskService.save(taskRequestDTO);
        TaskResponseDTO taskResponseDTO = new TaskResponseDTO(
                tasks.getTaskId(),
                tasks.getTaskName(),
                tasks.getTaskDescription(),
                tasks.getTaskStatus(),
                tasks.getMember().getId()
        );
        return ResponseEntity.ok().body(taskResponseDTO);
    }
}
