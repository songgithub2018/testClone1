package com.test.testspringcloudorder8000.controller;

import com.test.testspringcloudorder8000.entities.CommonResult;
import com.test.testspringcloudorder8000.entities.Payment;
import com.test.testspringcloudorder8000.service.ITestSleuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ITestSleuthService testSleuthService;

    @GetMapping("/consumer/payment/get/{id}")
     public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
            CommonResult<Payment> result = restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
            return result;

        }


    @GetMapping("/testSleuth/{id}")
    public void testSleuth(@PathVariable("id") Long id){
        CommonResult<Payment> result = restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        log.info("测试sleuth");
    }

    @RequestMapping("/async")
    public String async() throws InterruptedException {
        System.out.println("####控制器输出####   1");
        log.info("####异步方法调用前####");
        testSleuthService.asyncMethod();
        log.info("####异步方法调用后####");
        return "success";
    }
}
