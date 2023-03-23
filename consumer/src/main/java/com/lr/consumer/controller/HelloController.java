package com.lr.consumer.controller;

import com.lr.dubbo.interfaces.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @DubboReference
    private HelloService helloService;

    @GetMapping("/")
    public String say(){
        String result = helloService.sayHello("hello");
        return "response:"+result;
    }

    @GetMapping("/say2")
    public String say2(){
        String result = helloService.sayHello("hello");
        new Thread(new Runnable() {
            @Override
            public void run() {
                String async = helloService.sayHello2("async");
                System.out.println("thread success : "+async);
            }
        }).start();
        return result;
    }
}
