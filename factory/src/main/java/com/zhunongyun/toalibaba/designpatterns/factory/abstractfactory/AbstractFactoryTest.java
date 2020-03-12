package com.zhunongyun.toalibaba.designpatterns.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();
        // 录制java课程
        courseFactory.createCourse().record();
        // 编写java课程笔记
        courseFactory.creatNode().write();
        // 处理java课程视频
        courseFactory.createVideo().handle();
    }
}