package com.lr.provider.service.impl;

import com.lr.dubbo.interfaces.service.BuyService;
import com.lr.dubbo.interfaces.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements HelloService {
    @DubboReference
    BuyService buyService;
    @Override
    public String sayHello(String message) {
        String car = buyService.buyCar("AIR-CAR");
        System.out.println(car);
        return "sayHello :"+message;
    }

    @Override
    public String sayHello2(String message) {
        return "sayHello2 :"+message;
    }
}
