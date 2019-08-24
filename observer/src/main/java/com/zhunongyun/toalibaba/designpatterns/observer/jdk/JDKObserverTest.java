package com.zhunongyun.toalibaba.designpatterns.observer.jdk;

public class JDKObserverTest {
    public static void main(String[] args) {
        Blog blog = Blog.getInstance();
        Teacher teacher1 = new Teacher("李四");
        Teacher teacher2 = new Teacher("王五");
        Questtion questtion = new Questtion("小明", "观察者模式的原理是什么?");

        blog.addObserver(teacher1);
        blog.addObserver(teacher2);
        blog.publishQuestion(questtion);
    }
}