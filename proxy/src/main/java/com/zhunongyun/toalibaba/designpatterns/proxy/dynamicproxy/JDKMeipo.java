package com.zhunongyun.toalibaba.designpatterns.proxy.dynamicproxy;

import com.zhunongyun.toalibaba.designpatterns.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeipo implements InvocationHandler {

    private Person person;

    public Object getInstance(Person person) {
        this.person = person;
        Class<?> clazz = this.person.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.person, args);
    }
}