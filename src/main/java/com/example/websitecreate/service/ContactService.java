package com.example.websitecreate.service;


import com.example.websitecreate.DTO.ContactDTO;
import com.example.websitecreate.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {



    @Autowired
    ContactRepository cr;

    public void requestCall(ContactDTO contactDTO){
        cr.requestCall(contactDTO);
    }
}
