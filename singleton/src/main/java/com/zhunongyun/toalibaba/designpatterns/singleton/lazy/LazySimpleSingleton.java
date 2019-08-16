package com.zhunongyun.toalibaba.designpatterns.singleton.lazy;

/**
 * 普通懒汉式单例
 */
public class LazySimpleSingleton {

        private static LazySimpleSingleton lazySimpleSingleton = null;

        private LazySimpleSingleton(){}

        public static LazySimpleSingleton getInstance() {
            if (null == lazySimpleSingleton) {
                lazySimpleSingleton = new LazySimpleSingleton();
            }
            return lazySimpleSingleton;
        }
}