package com.zhunongyun.toalibaba.designpatterns.strategy.pay;

/**
 * 微信支付
 */
public class WechatPay extends Payment {
    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 256;
    }
}