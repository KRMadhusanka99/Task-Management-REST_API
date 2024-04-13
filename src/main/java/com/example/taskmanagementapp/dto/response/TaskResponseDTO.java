package com.example.taskmanagementapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponseDTO {
    private int taskId;
    private String taskName;
    private String taskDescription;
    private String taskStatus;
    private int memberId;
    private String memberName;
}
