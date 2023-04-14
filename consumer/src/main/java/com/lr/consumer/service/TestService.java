package com.lr.consumer.service;

import com.lr.dubbo.interfaces.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author liurui
 * @Date 2023/3/28 15:15
 */
@Service
public class TestService {

    @DubboReference
    private HelloService helloService;

    public String call(String msg){
        return helloService.sayHello(msg);
    }
}
