package com.zhunongyun.toalibaba.designpatterns.adapter.v1;

public class BatterCakeTest {
    public static void main(String[] args) {
        BatterCake batterCake;
        // 路边摊买一个煎饼
        batterCake = new BaseBatterCake();
        // 煎饼有点小，想再加一个鸡蛋
        batterCake = new EggDecorator(batterCake);
        // 再加一个鸡蛋
        batterCake = new EggDecorator(batterCake);
        // 很饿，再加根香肠
        batterCake = new SausageDecorator(batterCake);

        // 跟静态代理最大区别就是职责不同
        // 静态代理不一定要满足 is-a 的关系
        // 静态代理会做功能增强，同一个职责变得不一样

        // 装饰器更多考虑是扩展
        System.out.println(batterCake.getMsg() + ",总价:" + batterCake.getPrice());
    }
}