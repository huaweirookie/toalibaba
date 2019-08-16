package com.zhunongyun.toalibaba.designpatterns.singleton.lazy;

public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExecutorThread());

        Thread thread2 = new Thread(new ExecutorThread());

        thread1.start();
        thread2.start();

        System.out.println("执行结束");
    }
}
