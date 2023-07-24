package com.zss.dubbo.provider;

import com.zss.dubbo.api.GreetingsService;

/**
 * @author 周书胜
 * @date 2023年07月24 12:30
 */
public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayHi(String name) {
        return "hi, [dubbo-api]" + name;
    }
}
