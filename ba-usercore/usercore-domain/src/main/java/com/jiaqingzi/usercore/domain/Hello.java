package com.jiaqingzi.usercore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author xxq
 * @Date 2021/07/23/ 10:57
 * @Describe
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hello implements Serializable {
    private String name;

}
