package com.zhunongyun.toalibaba.designpatterns.singleton.lazy;

/**
 * 双重检测懒汉式单例
 */
public class LazyDoubleCheckSingleton {

        private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

        private LazyDoubleCheckSingleton(){}

        public static LazyDoubleCheckSingleton getInstance() {
            if (null == lazyDoubleCheckSingleton) {
                synchronized (LazyDoubleCheckSingleton.class) {
                    if (null == lazyDoubleCheckSingleton) {
                        lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    }
                }
            }
            return lazyDoubleCheckSingleton;
        }
}