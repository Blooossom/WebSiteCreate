package com.example.websitecreate.mapper;


import com.example.websitecreate.DTO.BuyDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BuyMapper {

    public int buyCoin(BuyDTO buyDTO);

    public double checkBalance(String total);



}
