package com.jiaqingzi.usercenter.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaqingzi.usercenter.provider.service.HelloService;
import com.jiaqingzi.usercore.api.hello.HelloDubboSercice;
import com.jiaqingzi.usercore.domain.Hello;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @Author xxq
 * @Date 2021/07/22/ 11:52
 * @Describe
 */

@Service
public class HelloServiceImpl implements HelloService {
    @DubboReference
    HelloDubboSercice helloDubboSercice;

    @Override
    public String dubboHello() {
        String str = helloDubboSercice.hello(new Hello("Dubbo"));
        return str;
    }

}
