package com.zhunongyun.toalibaba.designpatterns.singleton.lazy;

/**
 * 静态内部类懒汉式单例
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if (null != LazyHolder.LAZY) {
            throw new RuntimeException("禁止反射创建实例");
        }
    }

    // LazyHolder里面的逻辑需要等到外部方法调用时才执行
    // 全程没有用到synchronized
    // 巧妙利用了内部类的特性
    // JVM底层执行逻辑,完美的避免了线程安全问题
    public static LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
