package com.zhunongyun.toalibaba.designpatterns.factory.factorymethod;

import com.zhunongyun.toalibaba.designpatterns.factory.common.ICourse;
import com.zhunongyun.toalibaba.designpatterns.factory.common.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    /**
     * 创建java课程实体类
     * @return
     */
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}