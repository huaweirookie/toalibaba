package com.zhunongyun.toalibaba.designpatterns.singleton.serializable;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private static final SerializableSingleton serializableSingleton = new SerializableSingleton();

    private SerializableSingleton() {}

    public static SerializableSingleton getInstance() {
        return serializableSingleton;
    }

    // 重写readResolve方法只不过是覆盖了反序列化出来的对象
    // 还是创建了两次,只不过是发生在JVM层面,相对来说说比较安全
    // 之前反序列化出来的对象会被GC回收
    private Object readResolve() {
        return serializableSingleton;
    }
}