package com.example.websitecreate.controller;

import com.example.websitecreate.DTO.MemberDTO;
import com.example.websitecreate.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;


@Controller
public class MemberController {

    @Autowired
    MemberService ms;

    @PostMapping("signup")
    public String signup(MemberDTO memberDTO){
        ms.signup(memberDTO);
        return "index";
    }

    @PostMapping("login")
    public String login(MemberDTO memberDTO, HttpSession session){
        ms.login(memberDTO);
        session.setAttribute("email",memberDTO.getEmail());
        return "index";
    }
}
