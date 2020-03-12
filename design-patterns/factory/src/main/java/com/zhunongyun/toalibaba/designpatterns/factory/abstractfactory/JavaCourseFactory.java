package com.zhunongyun.toalibaba.designpatterns.factory.abstractfactory;

import com.zhunongyun.toalibaba.designpatterns.factory.common.ICourse;
import com.zhunongyun.toalibaba.designpatterns.factory.common.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote creatNode() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}