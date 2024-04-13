package com.example.taskmanagementapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "task_info_table")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Members member;

    private String taskName;

    private String taskDescription;

    private String taskStatus;

    public Tasks(Members member, String taskName, String taskDescription, String taskStatus) {
        this.member = member;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }
}
