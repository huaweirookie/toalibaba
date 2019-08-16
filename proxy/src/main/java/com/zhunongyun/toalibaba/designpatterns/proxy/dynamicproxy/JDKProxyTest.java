package com.zhunongyun.toalibaba.designpatterns.proxy.dynamicproxy;

import com.zhunongyun.toalibaba.designpatterns.proxy.Person;

public class JDKProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new JDKMeipo().getInstance(new Girl());
        person.findLove();
    }
}
