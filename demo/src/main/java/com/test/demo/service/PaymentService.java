package com.test.demo.service;


import com.test.demo.entities.Payment;

public interface PaymentService {


      public int insert(Payment payment);

      public Payment getPaymentById(Long id);
}
