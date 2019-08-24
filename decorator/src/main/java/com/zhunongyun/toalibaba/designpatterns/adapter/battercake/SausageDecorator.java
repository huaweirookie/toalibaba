package com.zhunongyun.toalibaba.designpatterns.adapter.battercake;

/**
 * 加香肠装饰器
 */
public class SausageDecorator extends BatterCakeDecorator{

    public SausageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+一根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}