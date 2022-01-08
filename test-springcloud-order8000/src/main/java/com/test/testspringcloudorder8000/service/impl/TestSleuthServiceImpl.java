package com.test.testspringcloudorder8000.service.impl;

import com.test.testspringcloudorder8000.service.ITestSleuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
class TestSleuthServiceImp implements ITestSleuthService {

    @Override
    @Async
    public void asyncMethod() throws InterruptedException {
        log.info("开始执行异步方法");
        Thread.sleep(1000L);
        log.info("异步方法执行结束");
    }
}
