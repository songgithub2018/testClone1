package com.test.demo.service.impl;


import com.test.demo.dao.PaymentDao;
import com.test.demo.entities.Payment;
import com.test.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    public int insert(Payment payment){
        return paymentDao.insert(payment);
    }
}
