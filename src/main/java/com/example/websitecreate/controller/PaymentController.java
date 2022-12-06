package com.example.websitecreate.controller;


import com.example.websitecreate.DTO.PaymentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@RestController
public class PaymentController {


    @GetMapping("/point")
    public String charge(HttpSession session) {
        if (session.getAttribute("email") == null) {
            return "login";
        } else {
            session.setAttribute("email", session.getAttribute("email"));
            return "index";
        }
    }
}
