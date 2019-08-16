package com.zhunongyun.toalibaba.designpatterns.factory.simplefactory;

import com.zhunongyun.toalibaba.designpatterns.factory.common.ICourse;
import com.zhunongyun.toalibaba.designpatterns.factory.common.JavaCourse;
import org.apache.commons.lang3.StringUtils;

public class CourseFactory {

    /**
     * 通过名称创建对象
     * @param name
     * @return
     */
    public ICourse createByName(String name) {
         if ("java".equals(name)) {
             return new JavaCourse();
         } else {
             return null;
         }
    }

    /**
     * 通过类路径创建对象
     * @param classPath
     * @return
     */
    public ICourse createByClassPath(String classPath) {
        try {
            if (StringUtils.isNotBlank(classPath)) {
                return (ICourse) Class.forName(classPath).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 通过类创建对象
     * @param className
     * @return
     */
    public ICourse createByClass(Class className) {
        try {
            if (null != className) {
                return (ICourse) className.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
