package com.example.websitecreate.mapper;


import com.example.websitecreate.DTO.ContactDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContactMapper {

    public void requestCall(ContactDTO contactDTO);


}
