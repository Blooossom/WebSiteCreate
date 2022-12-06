package com.example.websitecreate.mapper;


import com.example.websitecreate.DTO.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    public int signup(MemberDTO memberDTO);
    public MemberDTO login(MemberDTO memberDTO);


}
