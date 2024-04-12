package com.example.taskmanagementapp.controller;

import com.example.taskmanagementapp.dto.request.MemberRequestDTO;
import com.example.taskmanagementapp.dto.response.MemberResponseDTO;
import com.example.taskmanagementapp.model.Members;
import com.example.taskmanagementapp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/add")
    public ResponseEntity<MemberResponseDTO> addMember(@RequestBody MemberRequestDTO memberRequestDTO){
        Members savedMember = memberService.addMember(memberRequestDTO);
        MemberResponseDTO memberResponseDTO = new MemberResponseDTO(savedMember.getId(), savedMember.getMemberName());
        return ResponseEntity.ok().body(memberResponseDTO);
    }
}
