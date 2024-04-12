package com.example.taskmanagementapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getters and Setters adding using lombok
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "members_info_table")
public class Members {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String memberName;

    public Members(String memberName) {
        this.memberName = memberName;
    }
}
