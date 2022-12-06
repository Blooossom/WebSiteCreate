package com.example.websitecreate.repository;

import com.example.websitecreate.DTO.MemberDTO;
import com.example.websitecreate.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MemberRepository {
    @Autowired
    MemberMapper mapper;

    public int signup(MemberDTO memberDTO){
        return mapper.signup(memberDTO);
    }
    public MemberDTO login(MemberDTO memberDTO){
        return mapper.login(memberDTO);
    }
}
