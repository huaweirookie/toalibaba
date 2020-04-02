package com.zhunongyun.toalibaba.concurrent.programming.theory;


public class MonitorDemo {

    public static synchronized void test() {

    }

    public static void main(String[] args) {
        synchronized (MonitorDemo.class) {

        }

        test();
    }
}