package com.zhunongyun.toalibaba.designpatterns.adapter.battercake;

/**
 * 煎饼抽象类
 */
public abstract class BatterCake {
    /**
     * 煎饼信息
     * @return
     */
    protected abstract String getMsg();

    /**
     * 煎饼价格
     * @return
     */
    protected abstract int getPrice();
}