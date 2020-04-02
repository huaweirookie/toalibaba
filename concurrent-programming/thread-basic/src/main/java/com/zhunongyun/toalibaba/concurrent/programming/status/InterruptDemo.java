package com.zhunongyun.toalibaba.concurrent.programming.status;

import java.util.concurrent.TimeUnit;


public class InterruptDemo {

    private static int i;

//    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread(() -> {
//            //默认是false  _interrupted state
//            while (!Thread.currentThread().isInterrupted()) {
//                i++;
//            }
//            System.out.println("i:" + i);
//        });
//        thread.start();
//
//        TimeUnit.SECONDS.sleep(1);
//        //把isInterrupted设置成true
//        thread.interrupt();
//    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (true) {
                if (Thread.currentThread().isInterrupted()){
                    System.out.println("before:" + Thread.currentThread().isInterrupted());

                    //对线程进行复位，由 true 变成 false
                    Thread.interrupted();

                    System.out.println("after:" + Thread.currentThread().isInterrupted());
                }
            }
        }, "interruptDemo");

        thread.start();
        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();
    }
}