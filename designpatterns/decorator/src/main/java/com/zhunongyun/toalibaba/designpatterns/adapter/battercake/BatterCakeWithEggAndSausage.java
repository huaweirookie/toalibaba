package com.zhunongyun.toalibaba.designpatterns.adapter.battercake;

public class BatterCakeWithEggAndSausage extends BatterCakeWithEgg {
    /**
     * 煎饼信息
     * 加一根香肠
     */
    @Override
    protected String getMsg() {
        return super.getMsg() + " +1根香肠";
    }

    /**
     * 煎饼价格
     * 加一根香肠加2块钱
     */
    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}