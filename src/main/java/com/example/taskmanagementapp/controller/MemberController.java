package com.example.taskmanagementapp.controller;

import com.example.taskmanagementapp.dto.request.MemberRequestDTO;
import com.example.taskmanagementapp.dto.response.MemberResponseDTO;
import com.example.taskmanagementapp.model.Members;
import com.example.taskmanagementapp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
@CrossOrigin
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/add")
    public ResponseEntity<MemberResponseDTO> addMember(@RequestBody MemberRequestDTO memberRequestDTO){
        Members savedMember = memberService.addMember(memberRequestDTO);
        MemberResponseDTO memberResponseDTO = new MemberResponseDTO(
                savedMember.getId(),
                savedMember.getMemberName()
        );
        return ResponseEntity.ok().body(memberResponseDTO);
    }

    @GetMapping("/")
    public ResponseEntity<List<MemberResponseDTO>> getAllMembers(){
        List<MemberResponseDTO> memberResponseDTOList = memberService.getAllMembers();
        return ResponseEntity.ok().body(memberResponseDTOList);
    }
}
