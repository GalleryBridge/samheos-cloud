package com.samheos.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: Laidor
 * @Description: 对话启动类
 * @Date:2025/1/23 上午 11:22
 */
@SpringBootApplication
public class ChatApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ChatApplication.class, args);
        String things = run.getEnvironment().getProperty("app.name");
        System.out.println(things);
    }
}
