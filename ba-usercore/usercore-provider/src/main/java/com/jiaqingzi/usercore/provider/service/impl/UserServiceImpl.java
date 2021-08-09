package com.jiaqingzi.usercore.provider.service.impl;

import com.jiaqingzi.usercore.provider.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author xxq
 * @Date 2021/07/21/ 16:02
 * @Describe
 */

@Service
public class UserServiceImpl implements UserService {
    public String test(){
        return "test";
    }
}
