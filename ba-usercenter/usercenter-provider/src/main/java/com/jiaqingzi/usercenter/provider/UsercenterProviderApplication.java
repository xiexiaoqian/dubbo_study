package com.jiaqingzi.usercenter.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class UsercenterProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsercenterProviderApplication.class, args);
        System.out.println("======================启动服务usercenter-provider======================");
    }

}
