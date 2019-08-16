package com.zhunongyun.toalibaba.designpatterns.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private ContainerSingleton() {}

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className) {
        if (!ioc.containsKey(className)) {
            Object object = null;
            try {
                object = Class.forName(className).newInstance();
                ioc.put(className, object);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return object;
        }
        return ioc.get(className);
    }
}
