package com.example.websitecreate.repository;


import com.example.websitecreate.mapper.SubscribeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public class SubscribeRepository {

    @Autowired
    SubscribeMapper mapper;

    public void subscribe(@RequestParam("email")String email){
        mapper.subscribe(email);
    }
}
