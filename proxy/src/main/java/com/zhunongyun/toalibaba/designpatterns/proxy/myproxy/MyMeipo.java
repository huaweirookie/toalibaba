package com.zhunongyun.toalibaba.designpatterns.proxy.myproxy;

import com.zhunongyun.toalibaba.designpatterns.proxy.Person;

import java.lang.reflect.Method;

public class MyMeipo implements MyInvocationHandler {

    private Person person;

    public Object getInstance(Person person) {
        this.person = person;
        Class<?> clazz = this.person.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object object = null;
        try {
            object = method.invoke(this.person, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}