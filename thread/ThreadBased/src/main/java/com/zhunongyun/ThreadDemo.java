package com.zhunongyun;

public class ThreadDemo extends Thread {

    @Override
    public void run() {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("计算结果为" + sum);
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();

        threadDemo.start();
        System.out.println("启动线程" + threadDemo.getClass().getSimpleName());
    }
}