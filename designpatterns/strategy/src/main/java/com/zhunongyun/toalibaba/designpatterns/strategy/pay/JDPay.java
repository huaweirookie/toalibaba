package com.zhunongyun.toalibaba.designpatterns.strategy.pay;

/**
 * 京东白条
 */
public class JDPay extends Payment {
    public String getName() {
        return "京东白条";
    }

    protected double queryBalance(String uid) {
        return 500;
    }
}