package com.luobo.consumer;

import com.luobo.providerapi.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsumerRunner implements ApplicationRunner {
    private static final Logger log = LoggerFactory.getLogger(ConsumerRunner.class);
    @DubboReference
    private TestService testService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String result = testService.test("consumer");
        log.info("result: {}", result);
    }
}
