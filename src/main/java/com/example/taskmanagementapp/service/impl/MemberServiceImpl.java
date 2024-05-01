package com.example.taskmanagementapp.service.impl;

import com.example.taskmanagementapp.dto.request.MemberRequestDTO;
import com.example.taskmanagementapp.dto.response.MemberResponseDTO;
import com.example.taskmanagementapp.model.Members;
import com.example.taskmanagementapp.repository.MemberRepository;
import com.example.taskmanagementapp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;
    @Override
    public Members addMember(MemberRequestDTO memberRequestDTO){
        Members member = new Members(memberRequestDTO.getMemberName());
        Members savedMember = memberRepository.save(member);
        return savedMember;
    }

    @Override
    public List<MemberResponseDTO> getAllMembers() {
        List<Members> members = memberRepository.findAll();
        return members.stream().map(member -> new MemberResponseDTO(member.getId(), member.getMemberName())).toList();
    }
}
