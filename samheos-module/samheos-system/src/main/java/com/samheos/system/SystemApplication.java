package com.samheos.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: Laidor
 * @Description: 系统启动类
 * @Date:2025/1/22 下午 04:59
 */
@SpringBootApplication
public class SystemApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SystemApplication.class, args);
        String things = run.getEnvironment().getProperty("app.name");
        System.out.println(things);
    }
}
