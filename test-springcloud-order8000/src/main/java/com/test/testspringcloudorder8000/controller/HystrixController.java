package com.test.testspringcloudorder8000.controller;

import com.test.testspringcloudorder8000.hystrix.service.IHystrixSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @Autowired
    private IHystrixSerivce hystrixSerivce;

    @RequestMapping("/hystrixHello")
    public String hystrixHello(String id){
        return hystrixSerivce.execute(id);
    }

}
