package com.jiaqingzi.usercenter.provider;

import com.jiaqingzi.usercenter.provider.service.impl.HelloServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsercenterProviderApplicationTests {

    @Autowired
    HelloServiceImpl helloService;

    @Test
    void contextLoads() {
        System.out.println(helloService.dubboHello());
    }

}
