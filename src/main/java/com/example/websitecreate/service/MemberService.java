package com.example.websitecreate.service;

import com.example.websitecreate.DTO.MemberDTO;
import com.example.websitecreate.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberService {

    @Autowired
    MemberRepository mr;

    public int signup(MemberDTO memberDTO){
        return mr.signup(memberDTO);
    }
    public MemberDTO login(MemberDTO memberDTO){
        return mr.login(memberDTO);
    }
}
