package com.zhunongyun.toalibaba.designpatterns.proxy.staticproxy;

import com.zhunongyun.toalibaba.designpatterns.proxy.Person;

public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("寻找伴侣要求: 肤白貌美大长腿");
    }
}