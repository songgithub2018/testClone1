package com.test.testspringcloudorder8000.controller;

import com.test.testspringcloudorder8000.entities.Payment;
import com.test.testspringcloudorder8000.feign.OrderFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeignController {

    @Autowired
    private OrderFeignService orderFeignService;

    @RequestMapping("/getPaymentByFeign")
    @ResponseBody
    public Payment getPaymentByFeign(Long id){
        return orderFeignService.getPayment(id);
    }
}
