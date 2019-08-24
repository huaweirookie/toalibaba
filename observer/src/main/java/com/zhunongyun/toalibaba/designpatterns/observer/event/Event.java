package com.zhunongyun.toalibaba.designpatterns.observer.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Method;

/**
 * 监听器包装
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    //事件源,事件是由谁发起的
    private Object source;
    //事件触发,要通知谁
    private Object target;
    //事件触发,要做什么动作(回调)
    private Method callback;
    //事件的名称,触发的是什么事件
    private String trigger;
    //触发的时间
    private Long time;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }
}