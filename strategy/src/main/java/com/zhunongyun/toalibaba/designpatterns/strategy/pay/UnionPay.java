package com.zhunongyun.toalibaba.designpatterns.strategy.pay;

/**
 * 银联支付
 */
public class UnionPay extends Payment {
    public String getName() {
        return "银联支付";
    }

    protected double queryBalance(String uid) {
        return 120;
    }
}