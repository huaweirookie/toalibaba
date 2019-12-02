package com.zhunongyun.toalibaba.designpatterns.singleton.accessible;

import com.zhunongyun.toalibaba.designpatterns.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.*;

/**
 * setAccessible方法在Field/Method/Constructor三种场景下使用
 */
public class SetAccessibleTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = User.class;

            Constructor constructor = clazz.getDeclaredConstructor(null);
            // 私有构造方法设置不检查权限
            constructor.setAccessible(true);
            User user = (User) constructor.newInstance();

            // 所有私有属性的方法设置不检查权限
            Method[] methods =  clazz.getDeclaredMethods();
            AccessibleObject.setAccessible(methods, true);

            // 所有私有属性的字段设置不检查权限
            Field[] fields = clazz.getDeclaredFields();
            AccessibleObject.setAccessible(fields, true);
            fields[0].setLong(user,1L);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}