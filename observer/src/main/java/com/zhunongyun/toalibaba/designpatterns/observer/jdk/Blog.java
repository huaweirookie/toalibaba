package com.zhunongyun.toalibaba.designpatterns.observer.jdk;


import lombok.Data;

import java.util.Observable;

@Data
public class Blog extends Observable {

    private String name = "问题回答博客";

    private static Blog blog = new Blog();

    private Blog() {}

    public static Blog getInstance() {
        return blog;
    }

    public void publishQuestion (Questtion question) {
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题");
        super.setChanged();
        super.notifyObservers(question);
    }
}