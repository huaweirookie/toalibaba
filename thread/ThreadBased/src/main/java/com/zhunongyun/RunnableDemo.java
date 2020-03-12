package com.zhunongyun;

public class RunnableDemo implements Runnable{

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
        RunnableDemo runnableDemo = new RunnableDemo();

        new Thread(runnableDemo).start();
        System.out.println("启动线程" + runnableDemo.getClass().getSimpleName());
    }
}