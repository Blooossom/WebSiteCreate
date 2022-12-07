package com.example.websitecreate.repository;

import com.example.websitecreate.DTO.BuyDTO;
import com.example.websitecreate.mapper.BuyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BuyRepository {

    @Autowired
    BuyMapper mapper;

    public int buyCoin(BuyDTO buyDTO){
        return mapper.buyCoin(buyDTO);
    }

    public double checkBalance(String total){
        return mapper.checkBalance(total);
    }
}
