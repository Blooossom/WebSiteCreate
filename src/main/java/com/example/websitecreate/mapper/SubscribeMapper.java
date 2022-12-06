package com.example.websitecreate.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

@Mapper
public interface SubscribeMapper {


    public void subscribe(@RequestParam("email")String email);
}
