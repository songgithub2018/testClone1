package com.test.springcloud.service;

import com.test.springcloud.entities.Payment;

public interface PaymentService {


      public int insert(Payment payment);

      public Payment getPaymentById(Long id);
}
