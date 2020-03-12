package com.zhunongyun.toalibaba.designpatterns.adapter.battercake;

/**
 * 煎饼类
 */
public class BatterCake {
    /**
     * 煎饼信息
     */
    protected String getMsg() {
        return "煎饼";
    }

    /**
     * 煎饼价格
     */
    public int getPrice() {
        return 5;
    }
}