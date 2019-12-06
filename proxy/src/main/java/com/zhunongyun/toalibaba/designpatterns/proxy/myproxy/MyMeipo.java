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
            before();
            object = method.invoke(this.person, args);
            after();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
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