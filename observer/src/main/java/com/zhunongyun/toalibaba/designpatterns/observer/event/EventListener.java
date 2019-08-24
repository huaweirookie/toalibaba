package com.zhunongyun.toalibaba.designpatterns.observer.event;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 监听器(观察者)
 */
public class EventListener {
    //JDK底层的listener通常也是这么设计的
    protected Map<String, Event> eventMap = new HashMap<>();

    public void addListen(String eventType, Object target) {
        try {
            this.addListen(eventType, target, target.getClass().getMethod("on" + toUpperFirstCase(eventType)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addListen(String eventType, Object target, Method callback) {
        eventMap.put(eventType, new Event(target, callback));
    }

    //触发, 只要有动作就触发
    private void trigger(Event event) {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        try {
            if (event.getCallback() != null) {
                event.getCallback().invoke(event.getTarget(), event);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String toUpperFirstCase(String name) {
        if (StringUtils.isBlank(name)){
            return name;
        }

        char[] chars = name.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }
}
