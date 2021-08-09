package com.jiaqingzi.usercore.provider;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@Slf4j
public class UsercoreProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsercoreProviderApplication.class, args);
        System.out.println("======================启动usercore-provider服务======================");
    }

}
