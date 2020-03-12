package com.zhunongyun.toalibaba.designpatterns.singleton.lazy;

public class LazySimpleExecutorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + ":" + lazySimpleSingleton);
    }
}