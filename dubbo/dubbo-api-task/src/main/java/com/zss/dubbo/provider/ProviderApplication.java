package com.zss.dubbo.provider;

import com.zss.dubbo.api.GreetingsService;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.log4j.BasicConfigurator;

/**
 * @author 周书胜
 * @date 2023年07月24 12:31
 */
public class ProviderApplication {
    public static void main(String[] args) {
        // 定义具体的服务
        ServiceConfig<GreetingsService> service = new ServiceConfig<>();
        // 指定接口
        service.setInterface(GreetingsService.class);
        // 指定实现类
        service.setRef(new GreetingsServiceImpl());

        // 启动 Dubbo
        DubboBootstrap.getInstance()
                .application("first-dubbo-provider")
                .registry(new RegistryConfig("zookeeper://127.0.0.1:2181"))
                .protocol(new ProtocolConfig("dubbo", -1))
                .service(service)
                .start()
                .await();
    }
}
