package com.test.demo.controller;


import com.test.demo.entities.CommonResult;
import com.test.demo.entities.Payment;
import com.test.demo.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/insert")
    public CommonResult insert(@RequestBody Payment payment) {
        int result = paymentService.insert(payment);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功，服务端口：" + serverPort);
        } else {
            return new CommonResult(500, "插入数据失败");
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);

        if (result != null) {
            return new CommonResult(200, "查询成功，服务端口：" + serverPort, result);
        } else {
            return new CommonResult(500, "查询失败");
        }
    }

    @RequestMapping("/payment/getPayment/{id}")
    public Payment getPayment(@PathVariable Long id){
        Payment payment=paymentService.getPaymentById(id);
        return payment;
    }




}
