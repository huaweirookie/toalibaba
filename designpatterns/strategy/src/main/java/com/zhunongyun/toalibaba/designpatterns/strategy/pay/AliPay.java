package com.zhunongyun.toalibaba.designpatterns.strategy.pay;

/**
 * 支付宝支付
 */
public class AliPay extends Payment {
    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }
}