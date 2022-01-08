package com.test.demo1.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRibbonController {

    @Value("${spring.cloud.client.ip-address}")
    private String ip;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/testRibbon")
    public String testRibbonController(){
        return ip+":"+port+"服务调用";
    }

}
