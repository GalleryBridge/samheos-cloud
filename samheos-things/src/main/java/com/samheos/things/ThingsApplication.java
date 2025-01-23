package com.samheos.things;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: Laidor
 * @Description: 物模型启动类
 * @Date:2025/1/20 上午 11:34
 */
@SpringBootApplication
public class ThingsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ThingsApplication.class, args);
        String things = run.getEnvironment().getProperty("app.name");
        System.out.println(things);
    }
}
