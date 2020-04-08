package com.zhunongyun.toalibaba.concurrent.programming.security;

public class SyncDemo {
    private VolatileDemo volatileDemo = new VolatileDemo();

    public VolatileDemo getVolatileDemo() {
        return volatileDemo;
    }


    public void demo() {
        synchronized (this) {//ThreadA / ThreadB
        }
    }
}
