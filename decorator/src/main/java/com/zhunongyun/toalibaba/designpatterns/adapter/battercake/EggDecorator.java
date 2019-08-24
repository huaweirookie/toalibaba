package com.zhunongyun.toalibaba.designpatterns.adapter.battercake;

/**
 * 加鸡蛋装饰器
 */
public class EggDecorator extends BatterCakeDecorator{

    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+一个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}