package com.zss.dubbo.provider.service.impl;

import com.zss.dubbo.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author 周书胜
 * @date 2023年07月24 13:36
 */
@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
