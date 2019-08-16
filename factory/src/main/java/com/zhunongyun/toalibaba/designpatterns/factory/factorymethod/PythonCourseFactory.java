package com.zhunongyun.toalibaba.designpatterns.factory.factorymethod;

import com.zhunongyun.toalibaba.designpatterns.factory.common.ICourse;
import com.zhunongyun.toalibaba.designpatterns.factory.common.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    /**
     * 创建python课程实体类
     * @return
     */
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
