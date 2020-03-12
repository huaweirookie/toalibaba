package com.zhunongyun.toalibaba.designpatterns.factory.abstractfactory;

import com.zhunongyun.toalibaba.designpatterns.factory.common.ICourse;

public interface ICourseFactory {
    /**
     * 录制课程
     * @return
     */
    ICourse createCourse();

    /**
     * 编写课程笔记
     * @return
     */
    INote creatNode();

    /**
     * 处理课程视频
     * @return
     */
    IVideo createVideo();
}