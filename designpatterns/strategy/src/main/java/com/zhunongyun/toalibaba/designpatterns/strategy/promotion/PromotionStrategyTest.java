package com.zhunongyun.toalibaba.designpatterns.strategy.promotion;

public class PromotionStrategyTest {
    public static void main(String[] args) {
        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(PromotionEnum.CASHBACK);
        promotionStrategy.doPromotion();
    }
}