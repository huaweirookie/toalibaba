package com.zhunongyun.toalibaba.designpatterns.factory.factorymethod;

import com.zhunongyun.toalibaba.designpatterns.factory.common.ICourse;

public class FactoryMethodTest {
    public static void main(String[] args) {
        /**
         * 创建java课程
         */
        ICourseFactory courseFactory = new JavaCourseFactory();

        ICourse course = courseFactory.create();

        course.record();

        /**
         * 创建python课程
         */
        courseFactory = new PythonCourseFactory();

        course = courseFactory.create();

        course.record();
    }
}