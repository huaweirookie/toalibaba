package com.zhunongyun.toalibaba.concurrent.programming.security;

public class VolatileDemo {

    public /*volatile*/ static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            int i = 0;

            //condition 不满足
            while (!stop) {
                i++;
            }
        });
        t1.start();

        Thread.sleep(1000);

        stop = true;
    }
}