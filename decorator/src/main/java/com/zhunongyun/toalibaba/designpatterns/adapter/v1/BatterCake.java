package com.zhunongyun.toalibaba.designpatterns.adapter.v1;

/**
 * 煎饼抽象类
 */
public abstract class BatterCake {
    /**
     * 煎饼信息
     */
    protected abstract String getMsg();

    /**
     * 煎饼价格
     */
    protected abstract int getPrice();
}