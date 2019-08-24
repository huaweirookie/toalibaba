package com.zhunongyun.toalibaba.designpatterns.observer.jdk;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;
import java.util.Observer;

@Data
@AllArgsConstructor
public class Teacher implements Observer {

    private String name;

    @Override
    public void update(Observable o, Object arg) {
        Blog blog = (Blog) o;
        Questtion questtion = (Questtion) arg;

        System.out.println("================================");
        System.out.println(name + "老师, 你好! \n" + "你收到一个来着\""
                + blog.getName() + "\"的提问,希望您解答,问题内容如下: \n"
                + questtion.getContext() + "\n" + "提问者:" + questtion.getUserName());
    }
}