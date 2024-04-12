package com.example.taskmanagementapp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskRequestDTO {
    private int memberId;
    private String taskName;
    private String taskDescription;
    private String taskStatus;

}
