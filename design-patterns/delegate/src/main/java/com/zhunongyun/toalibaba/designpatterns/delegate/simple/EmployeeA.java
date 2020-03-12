package com.zhunongyun.toalibaba.designpatterns.delegate.simple;

public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我擅长项目安全测试, 开始对项目进行" + command);
    }
}