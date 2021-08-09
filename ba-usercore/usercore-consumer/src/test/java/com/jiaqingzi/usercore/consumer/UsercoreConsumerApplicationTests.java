package com.jiaqingzi.usercore.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaqingzi.usercore.api.hello.HelloDubboSercice;
import com.jiaqingzi.usercore.domain.Hello;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsercoreConsumerApplicationTests {

    @DubboReference
    HelloDubboSercice helloDubboSercice;

    @Test
    void contextLoads() {
        System.out.println(helloDubboSercice.hello(new Hello("Dubbo")));
    }

}
