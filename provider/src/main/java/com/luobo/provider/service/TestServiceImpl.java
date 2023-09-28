package com.luobo.provider.service;

import com.luobo.providerapi.TestService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class TestServiceImpl implements TestService {
    @Override
    public String test(String name) {
        return "hello" + name;
    }
}
