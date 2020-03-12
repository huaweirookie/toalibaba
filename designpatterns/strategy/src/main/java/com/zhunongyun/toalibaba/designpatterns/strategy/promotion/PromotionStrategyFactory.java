package com.zhunongyun.toalibaba.designpatterns.strategy.promotion;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

/**
 * 工厂模式 + 单例模式
 */
public class PromotionStrategyFactory {

    private static Map<Enum, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionEnum.CASHBACK, new CashBackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionEnum.COUPON, new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionEnum.EMPTY, new EmptyStrategy());
    }

    private PromotionStrategyFactory() {}

    public static PromotionStrategy getPromotionStrategy (PromotionEnum promotionEnum) {
        return PROMOTION_STRATEGY_MAP.get(promotionEnum);
    }
}