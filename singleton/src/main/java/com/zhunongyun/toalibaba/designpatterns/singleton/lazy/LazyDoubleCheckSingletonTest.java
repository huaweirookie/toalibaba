package com.zhunongyun.toalibaba.designpatterns.singleton.lazy;

public class LazyDoubleCheckSingletonTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new LazyDoubleCheckExecutorThread());

        Thread thread2 = new Thread(new LazyDoubleCheckExecutorThread());

        thread1.start();
        thread2.start();

        System.out.println("执行结束");
    }
}