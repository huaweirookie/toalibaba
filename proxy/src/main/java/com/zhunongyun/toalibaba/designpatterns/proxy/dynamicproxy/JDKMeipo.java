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
        before();
        Object object = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
        after();
        return object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.person, args);
    }

    /**
     * 增强目标对象
     * 执行之前
     */
    private void before(){
        System.out.println("我是媒婆,已经收到你的诉求");
        System.out.println("正在物色对象");
    }

    /**
     * 增强目标对象
     * 执行之后
     */
    private void after(){
        System.out.println("相亲完成,确认双方意见");
    }
}