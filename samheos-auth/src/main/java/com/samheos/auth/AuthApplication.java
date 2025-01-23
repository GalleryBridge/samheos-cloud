package com.samheos.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: Laidor
 * @Description: 认证启动类
 * @Date:2025/1/22 下午 04:55
 */
@SpringBootApplication
public class AuthApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AuthApplication.class, args);
        String things = run.getEnvironment().getProperty("app.name");
        System.out.println(things);
    }
}
