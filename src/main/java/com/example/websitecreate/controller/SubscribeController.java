package com.example.websitecreate.controller;


import com.example.websitecreate.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubscribeController {

    @Autowired
    SubscribeService ss;

    @PostMapping("/subscribe")
    public String subscribe(@RequestParam("email")String email){
        ss.subscribe(email);
        return "index";
    }
}
