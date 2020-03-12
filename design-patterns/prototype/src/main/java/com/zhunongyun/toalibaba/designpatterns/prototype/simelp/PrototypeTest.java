package com.zhunongyun.toalibaba.designpatterns.prototype.simelp;

import java.util.ArrayList;

public class PrototypeTest {

    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA(18, "test_name", new ArrayList());

        ConcretePrototypeA copy = (ConcretePrototypeA) concretePrototypeA.clone();

        System.out.println("原对象与克隆对象内存地址对比, 地址是否相同:"
                + (concretePrototypeA == copy));

        System.out.println("原对象与克隆对象中引用类型内存地址对比, 地址是否相同:"
                + (concretePrototypeA.getHobbies() == copy.getHobbies()));
    }
}