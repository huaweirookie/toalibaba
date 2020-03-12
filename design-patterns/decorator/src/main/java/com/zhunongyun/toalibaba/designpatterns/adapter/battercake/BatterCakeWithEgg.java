package com.zhunongyun.toalibaba.designpatterns.adapter.battercake;

public class BatterCakeWithEgg extends BatterCake {
    /**
     * 煎饼信息
     * 加一个鸡蛋
     */
    @Override
    protected String getMsg() {
        return super.getMsg() + " +1个鸡蛋";
    }

    /**
     * 煎饼价格
     * 加一个鸡蛋加1块钱
     */
    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}