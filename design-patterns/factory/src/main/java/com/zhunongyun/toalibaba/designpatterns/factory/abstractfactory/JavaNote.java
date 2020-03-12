package com.zhunongyun.toalibaba.designpatterns.factory.abstractfactory;

public class JavaNote implements INote {
    @Override
    public void write() {
        System.out.println("正在编写java课程笔记");
    }
}