package com.test.testspringcloudorder8000.hystrix.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.test.testspringcloudorder8000.entities.CommonResult;
import com.test.testspringcloudorder8000.hystrix.service.IHystrixSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HystrixServiceImpl implements IHystrixSerivce {


    @Autowired
    private RestTemplate restTemplate;

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String execute(String id) {
        Object object=restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        return object.toString();
    }

    public String hiError(String id){
        System.out.println("======================hiError========================");
        return "hi,"+id+",sorry,error";
    }
}
