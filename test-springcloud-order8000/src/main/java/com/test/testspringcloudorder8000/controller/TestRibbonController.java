package com.test.testspringcloudorder8000.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestRibbonController {

    @Autowired
    private RestTemplate restTemplate;

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @RequestMapping("/testRibbon")
    public String testRibbon() {
        String s = restTemplate.getForObject(PAYMENT_URL + "/testRibbon", String.class);
        return s;

    }
}