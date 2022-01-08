package com.test.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestGaoKeYongController {

    @RequestMapping("/testGaoKeYong")
    public String testGaoKeYong(){
        return "测试高可用";
    }
}
