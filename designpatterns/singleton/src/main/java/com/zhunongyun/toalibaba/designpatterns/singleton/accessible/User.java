package com.zhunongyun.toalibaba.designpatterns.singleton.accessible;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * setAccessible方法测试对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;

    private String name;

    private Integer age;

    private Double score;

    private String testMethod(){
        return "abcd";
    }
}