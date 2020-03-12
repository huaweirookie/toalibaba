package com.zhunongyun.toalibaba.designpatterns.factory.common;

public class PythonCourse implements ICourse {
    /**
     * 录制python课程
     */
    @Override
    public void record() {
        System.out.println("正在录制python课程");
    }
}