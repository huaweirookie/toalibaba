package com.zhunongyun.toalibaba.designpatterns.proxy.cglibproxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGlibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) throws Exception {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object object = methodProxy.invokeSuper(o, objects);
        after();
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