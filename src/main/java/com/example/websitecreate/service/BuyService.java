package com.example.websitecreate.service;


import com.example.websitecreate.DTO.BuyDTO;
import com.example.websitecreate.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyService {

    @Autowired
    BuyRepository br;

    public int buyCoin(BuyDTO buyDTO){
        return br.buyCoin(buyDTO);
    }

    public double checkBalance(String total){
        return br.checkBalance(total);
    }
}
