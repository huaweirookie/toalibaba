package com.zhunongyun.toalibaba.designpatterns.strategy.promotion;

/**
 * 优惠券活动
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券,正在执行优惠券活动");
    }
}