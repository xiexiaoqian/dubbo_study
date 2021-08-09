package com.jiaqingzi.usercore.provider.rpc;

import com.alibaba.fastjson.JSONArray;
import com.jiaqingzi.usercore.api.hello.HelloDubboSercice;
import com.jiaqingzi.usercore.domain.Hello;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author xxq
 * @Date 2021/07/21/ 14:17
 * @Describe
 */

@DubboService       // 在dubbo中注册服务
public class HelloDubboSerciceImpl implements HelloDubboSercice {


    @Override
    public String hello(Hello hello) {
        return "Hello, " + hello.getName() + "!";
    }
}
