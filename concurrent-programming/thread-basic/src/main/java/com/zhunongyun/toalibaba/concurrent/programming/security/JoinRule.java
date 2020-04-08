package com.zhunongyun.toalibaba.concurrent.programming.security;

public class JoinRule {

    static int x = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("t1");
            //执行的结果对于主线程可见
        });
        Thread t2 = new Thread(() -> {
            System.out.println("t2");
        });
        Thread t3 = new Thread(() -> {
            System.out.println("t3");
        });

        t1.start();
        //阻塞主线程 wait/notify
        t1.join();

        //等到阻塞释放
        //获取到t1线程的执行结果.
        t2.start();
        // 建立一个happens-bebefore规则
        t2.join();

        t3.start();
    }
}