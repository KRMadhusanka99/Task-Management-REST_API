package com.example.taskmanagementapp.service.impl;

import com.example.taskmanagementapp.dto.request.TaskRequestDTO;
import com.example.taskmanagementapp.model.Members;
import com.example.taskmanagementapp.model.Tasks;
import com.example.taskmanagementapp.repository.MemberRepository;
import com.example.taskmanagementapp.repository.TaskRepository;
import com.example.taskmanagementapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Autowired
    MemberRepository memberRepository;
    @Override
    public Tasks save(TaskRequestDTO taskRequestDTO) {
        // Fetch the member from the database
        Members member = memberRepository.findById(taskRequestDTO.getMemberId()).orElse(null);
        if (member == null) {
            // Handle the case when member is not found
            // You can throw an exception or handle it according to your application logic
        }
        // Create the task object
        Tasks task = new Tasks(
                member,
                taskRequestDTO.getTaskName(),
                taskRequestDTO.getTaskDescription(),
                taskRequestDTO.getTaskStatus()
        );
        Tasks savedTask = taskRepository.save(task);
        return savedTask;
    }
}
