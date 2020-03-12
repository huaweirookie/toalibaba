package com.zhunongyun.toalibaba.designpatterns.singleton.hungry;

public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    private HungryStaticSingleton() {}

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
