package com.zhunongyun.toalibaba.designpatterns.decorator.battercake;

/**
 * 普通煎饼
 */
public class BaseBatterCake extends BatterCake{
    /**
     * 煎饼信息
     * @return
     */
    protected String getMsg() {
        return "煎饼";
    }

    /**
     * 煎饼价格
     * @return
     */
    protected int getPrice() {
        return 5;
    }
}