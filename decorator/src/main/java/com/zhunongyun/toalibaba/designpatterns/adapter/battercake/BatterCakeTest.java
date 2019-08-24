package com.zhunongyun.toalibaba.designpatterns.adapter.battercake;

public class BatterCakeTest {
    public static void main(String[] args) {

        //在路边摊跟老板说买一个煎饼
        BatterCake batterCake = new BaseBatterCake();

        //煎饼有点小,跟老板说加一个鸡蛋
        batterCake = new EggDecorator(batterCake);

        //想要两个鸡蛋,跟老板说再加一个鸡蛋
        batterCake = new EggDecorator(batterCake);

        //肚子很饿想吃香肠, 跟老板说再加根香肠
        batterCake = new SausageDecorator(batterCake);

        //煎饼制作完成,买单
        System.out.println(batterCake.getMsg() + ", 价格:" + batterCake.getPrice());
    }
}