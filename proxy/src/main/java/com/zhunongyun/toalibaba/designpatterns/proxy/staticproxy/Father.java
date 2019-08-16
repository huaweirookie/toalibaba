package com.zhunongyun.toalibaba.designpatterns.proxy.staticproxy;

import com.zhunongyun.toalibaba.designpatterns.proxy.Person;

public class Father implements Person {

    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    @Override
    public void findLove() {
        this.before();
        this.son.findLove();
        this.after();
    }

    /**
     * 增强目标对象
     * 执行之前
     */
    private void before(){
        System.out.println("父亲正在帮儿子物色对象");
    }

    /**
     * 增强目标对象
     * 执行之后
     */
    private void after(){
        System.out.println("双方父母同意,确定关系");
    }
}