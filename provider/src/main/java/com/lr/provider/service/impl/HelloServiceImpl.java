package com.lr.provider.service.impl;

import com.lr.dubbo.interfaces.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String message) {
        return "sayHello :"+message;
    }

    @Override
    public String sayHello2(String message) {
        return "sayHello2 :"+message;
    }
}
