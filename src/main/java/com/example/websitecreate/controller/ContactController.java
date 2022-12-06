package com.example.websitecreate.controller;


import com.example.websitecreate.DTO.ContactDTO;
import com.example.websitecreate.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {


    @Autowired
    ContactService cs;

    @PostMapping("/requestCall")
    public String requestCall(ContactDTO contactDTO){
        cs.requestCall(contactDTO);
        return "index";
    }
}
