package com.example.websitecreate.mapper;


import com.example.websitecreate.DTO.PaymentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface PaymentMapper {

    public int buyPoint(PaymentDTO paymentDTO);
    public ArrayList<PaymentDTO> pointList(PaymentDTO paymentDTO);


}
