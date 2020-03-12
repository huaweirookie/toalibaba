package com.zhunongyun.toalibaba.designpatterns.singleton.lazy;

public class LazyDoubleCheckExecutorThread implements Runnable {
    @Override
    public void run() {
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + ":" + lazyDoubleCheckSingleton);
    }
}