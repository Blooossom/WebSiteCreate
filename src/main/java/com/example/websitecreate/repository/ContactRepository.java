package com.example.websitecreate.repository;


import com.example.websitecreate.DTO.ContactDTO;
import com.example.websitecreate.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository {

    @Autowired
    ContactMapper mapper;

    public void requestCall(ContactDTO contactDTO){
        mapper.requestCall(contactDTO);
    }

}
