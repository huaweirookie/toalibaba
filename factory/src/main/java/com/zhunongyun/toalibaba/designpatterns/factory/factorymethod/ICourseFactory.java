package com.zhunongyun.toalibaba.designpatterns.factory.factorymethod;

import com.zhunongyun.toalibaba.designpatterns.factory.common.ICourse;

public interface ICourseFactory {
    /**
     * 创建实体类
     * @return
     */
    ICourse create();
}
