package com.zhunongyun.toalibaba.designpatterns.delegate.simple;

public class EmployeeB implements IEmployee {
    @Override
    public void doing() {
        System.out.println("我擅长架构设计, 开始进行项目架构设计工作");
    }
}