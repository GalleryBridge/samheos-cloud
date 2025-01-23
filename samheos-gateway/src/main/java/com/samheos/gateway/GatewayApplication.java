package com.samheos.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: Laidor
 * @Description: 网关启动类
 * @Date:2025/1/21 下午 04:58
 */
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(GatewayApplication.class, args);
        String things = run.getEnvironment().getProperty("app.name");
        System.out.println(things);
    }
}
