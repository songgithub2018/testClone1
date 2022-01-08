package com.test.demo.dao;

import com.test.demo.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    public int insert(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
