package com.zhunongyun.toalibaba.designpatterns.singleton.lazy;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {

    public static void main(String[] args) throws NoSuchMethodException {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;

            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);

            Object object1 = constructor.newInstance();

            Object object2 = LazyInnerClassSingleton.getInstance();

            System.out.println(object1 == object2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}