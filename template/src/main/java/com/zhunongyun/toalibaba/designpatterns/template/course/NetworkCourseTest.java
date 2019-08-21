package com.zhunongyun.toalibaba.designpatterns.template.course;

public class NetworkCourseTest {
    public static void main(String[] args) {
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("--------------------------------------");

        NetworkCourse bigDataCourse = new BigDataCourse();
        bigDataCourse.createCourse();
    }
}