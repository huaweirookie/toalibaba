package com.zhunongyun.toalibaba.designpatterns.adapter.battercake;

/**
 * 普通煎饼装饰器
 */
public abstract class BatterCakeDecorator extends BatterCake{

    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    /**
     * 煎饼信息
     * @return
     */
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    /**
     * 煎饼价格
     * @return
     */
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}