package com.zhunongyun.toalibaba.designpatterns.delegate.simple;

public class Boss {

    public static void main(String[] args) {
        Leader leader = new Leader();
        leader.doing("安全测试");
        leader.doing("架构设计");
    }
}