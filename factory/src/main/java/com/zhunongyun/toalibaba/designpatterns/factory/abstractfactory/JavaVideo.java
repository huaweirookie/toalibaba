package com.zhunongyun.toalibaba.designpatterns.factory.abstractfactory;

public class JavaVideo implements IVideo {
    @Override
    public void handle() {
        System.out.println("正在处理java课程视频");
    }
}
