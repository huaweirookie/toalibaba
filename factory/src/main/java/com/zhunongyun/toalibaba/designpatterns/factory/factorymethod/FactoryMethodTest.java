package com.zhunongyun.toalibaba.designpatterns.factory.factorymethod;

import com.zhunongyun.toalibaba.designpatterns.factory.common.ICourse;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();

        ICourse course = courseFactory.create();

        course.record();
    }
}
