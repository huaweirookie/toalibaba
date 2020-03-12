package com.zhunongyun.toalibaba.designpatterns.template.course;

public class JavaCourse extends NetworkCourse {
    @Override
    void checkHomeWork() {
        System.out.println("检查java源码编写作业");
    }
}