package com.example.websitecreate.repository;


import com.example.websitecreate.DTO.PaymentDTO;
import com.example.websitecreate.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PaymentRepository {



    @Autowired
    PaymentMapper mapper;

    public int buyPoint(PaymentDTO paymentDTO){
        return mapper.buyPoint(paymentDTO);
    }
    public ArrayList<PaymentDTO> pointList(PaymentDTO paymentDTO){
        return mapper.pointList(paymentDTO);
    }
}
