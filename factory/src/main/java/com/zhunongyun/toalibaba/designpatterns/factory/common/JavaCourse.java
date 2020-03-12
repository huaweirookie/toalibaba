package com.zhunongyun.toalibaba.designpatterns.factory.common;

public class JavaCourse implements ICourse {
    /**
     * 录制java课程
     */
    @Override
    public void record() {
        System.out.println("正在录制java课程");
    }
}