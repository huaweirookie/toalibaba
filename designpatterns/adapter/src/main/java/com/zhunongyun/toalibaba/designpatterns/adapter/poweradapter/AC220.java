package com.zhunongyun.toalibaba.designpatterns.adapter.poweradapter;

public class AC220 {

    public int outputAC220() {
        int output = 220;
        System.out.println("输出电压" + output + "V");
        return output;
    }
}