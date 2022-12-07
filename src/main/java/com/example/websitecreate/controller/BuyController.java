package com.example.websitecreate.controller;


import com.example.websitecreate.DTO.BuyDTO;
import com.example.websitecreate.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class BuyController {



    @Autowired
    BuyService bs;

    @PostMapping("/buyCoin")
    public String buyCoin(BuyDTO buyDTO, HttpSession session){
        if(session.getAttribute("email") != null){
            String email = String.valueOf(session.getAttribute("email"));
            buyDTO.setEmail(email);
            bs.buyCoin(buyDTO);
        }else {
            return "로그인 먼저";
        }
        return "결제 성공";
    }

    @GetMapping("/checkBalance")
    public String checkBalance(HttpSession session, String total){
        if(session.getAttribute("email") != null){
            String email = String.valueOf(session.getAttribute("email"));
            double totalAmount = Double.parseDouble(total);
            double totalPrice = bs.checkBalance(email);
            if(totalAmount - totalPrice > 0){
                return "can";
            } else {
                return "cannot";
            }
        } else {
          return "login";
        }
    }

}
