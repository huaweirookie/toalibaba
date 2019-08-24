package com.zhunongyun.toalibaba.designpatterns.observer.jdk;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Questtion {
    /**
     * 提问人
     */
    private String userName;
    /**
     * 问题内容
     */
    private String context;
}