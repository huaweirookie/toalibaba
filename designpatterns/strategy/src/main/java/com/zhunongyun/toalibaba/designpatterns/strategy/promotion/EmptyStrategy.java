package com.zhunongyun.toalibaba.designpatterns.strategy.promotion;

/**
 * 无促销活动
 */
public class EmptyStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}