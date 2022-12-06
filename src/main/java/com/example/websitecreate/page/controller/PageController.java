package com.example.websitecreate.page.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {


    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/goSignup")
    public String signup(){
        return "signup";
    }
    @GetMapping("/goLogin")
    public String login(){
        return "login";
    }
    @GetMapping("/goPay")
    public String pay(HttpSession session){
        if (session.getAttribute("email") == null) {
            return "login";
        }else{
            session.setAttribute("email",session.getAttribute("email"));
            return "pay";
        }
    }
    @GetMapping("/goMarket")
    public String market(HttpSession session){
        if (session.getAttribute("email") == null) {
            return "login";
        }else{
            session.setAttribute("email",session.getAttribute("email"));
            return "market";
        }
    }
    @GetMapping("/goHistory")
    public String history(HttpSession session){
        if (session.getAttribute("email") == null) {
            return "login";
        }else{
            session.setAttribute("email",session.getAttribute("email"));
            return "history";
        }
    }

}
/*
 <div id="mySidepanel" class="sidepanel" style="font-family: 'Jua', sans-serif;">
        <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">×</a>
        <a href="/">홈으로</a>
        <a class="active" href="/goSignup">가입하기</a>
        <a href="/goLogin">로그인하기</a>
        <a href="/goPay">충전하기</a>
        <a href="/goMarket">거래하기</a>
        <a href="/goHistory">거래내역</a>
    </div>
 */
