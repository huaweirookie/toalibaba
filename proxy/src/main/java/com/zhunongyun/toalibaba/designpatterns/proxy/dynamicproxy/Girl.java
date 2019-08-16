package com.zhunongyun.toalibaba.designpatterns.proxy.dynamicproxy;

import com.zhunongyun.toalibaba.designpatterns.proxy.Person;

public class Girl implements Person {

    @Override
    public void findLove() {
        System.out.println("寻找对象要求:");
        System.out.println("身高180");
        System.out.println("有钱");
        System.out.println("有六块腹肌");
    }
}
