package com.example.taskmanagementapp.service;

import com.example.taskmanagementapp.dto.request.MemberRequestDTO;
import com.example.taskmanagementapp.model.Members;

public interface MemberService {
    Members addMember(MemberRequestDTO member);
}
