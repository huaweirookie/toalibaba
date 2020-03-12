package com.zhunongyun.toalibaba.designpatterns.factory.simplefactory;

import com.zhunongyun.toalibaba.designpatterns.factory.common.ICourse;
import com.zhunongyun.toalibaba.designpatterns.factory.common.JavaCourse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

public class SimelpFactoryTest {

    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();

        // 通过类名创建对象
        ICourse nameCourse = courseFactory.createByName("java");
        nameCourse.record();

        // 通过类路径创建对象
        ICourse classNameCourse = courseFactory.createByClassPath("com.zhunongyun.toalibaba.designpatterns.factory.common.JavaCourse");
        classNameCourse.record();

        // 通过类创建对象
        ICourse classCourse = courseFactory.createByClass(JavaCourse.class);
        classCourse.record();

        ICourse pythonCourse = courseFactory.createByName("python");
        pythonCourse.record();
    }
}