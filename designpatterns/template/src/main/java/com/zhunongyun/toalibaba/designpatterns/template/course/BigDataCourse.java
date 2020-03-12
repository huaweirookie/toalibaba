package com.zhunongyun.toalibaba.designpatterns.template.course;

public class BigDataCourse extends NetworkCourse {

    @Override
    protected boolean needHomeWork() {
        return true;
    }

    @Override
    void checkHomeWork() {
        System.out.println("检查大数据课程的作业");
    }
}