package com.zhunongyun.toalibaba.designpatterns.singleton.threadlocal;

public class ThreadLocalExectorThread implements Runnable {

    @Override
    public void run() {
        ThreadLocalSingleton threadLocalSingleton = ThreadLocalSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + ":" + threadLocalSingleton);
    }
}