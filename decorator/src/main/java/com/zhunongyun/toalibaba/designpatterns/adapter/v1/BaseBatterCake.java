package com.zhunongyun.toalibaba.designpatterns.adapter.v1;

public class BaseBatterCake extends BatterCake {

    protected String getMsg() {
        return "煎饼";
    }

    public int getPrice() {
        return 5;
    }
}