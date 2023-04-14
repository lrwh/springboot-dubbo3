package com.lr.provider.service.impl;

import com.lr.dubbo.interfaces.service.BuyService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Description
 * @Author liurui
 * @Date 2023/3/29 9:08
 */
@DubboService
public class BuyServiceImpl implements BuyService {
    @Override
    public String buyCar(String carName) {
        return "success buy : "+carName;
    }
}
