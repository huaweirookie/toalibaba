package com.zhunongyun.toalibaba.concurrent.programming.theory;

public class IncreaseDemo {
    private static int count = 0;

    private static int total = 0;

    public static void increase() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    public static void increaseBySynchronized() {
        synchronized (IncreaseDemo.class) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            total++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                IncreaseDemo.increase();
                IncreaseDemo.increaseBySynchronized();
            }).start();
        }

        Thread.sleep(5000);
        System.out.println("运行结果：count = " + count);
        System.out.println("synchronized运行结果：total = " + total);
    }
}