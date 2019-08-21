package com.zhunongyun.toalibaba.designpatterns.strategy.promotion;

/**
 * 返现活动
 */
public class CashBackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("正在执行返现活动");
    }
}