package com.example.taskmanagementapp.service;

import com.example.taskmanagementapp.dto.request.MemberRequestDTO;
import com.example.taskmanagementapp.dto.response.MemberResponseDTO;
import com.example.taskmanagementapp.model.Members;

import java.util.List;

public interface MemberService {
    Members addMember(MemberRequestDTO member);

    List<MemberResponseDTO> getAllMembers();
}
