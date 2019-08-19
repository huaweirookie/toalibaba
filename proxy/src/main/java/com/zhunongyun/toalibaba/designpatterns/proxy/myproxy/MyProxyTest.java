package com.zhunongyun.toalibaba.designpatterns.proxy.myproxy;

import com.zhunongyun.toalibaba.designpatterns.proxy.Person;
import com.zhunongyun.toalibaba.designpatterns.proxy.Girl;

public class MyProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new MyMeipo().getInstance(new Girl());
        person.findLove();
    }
}