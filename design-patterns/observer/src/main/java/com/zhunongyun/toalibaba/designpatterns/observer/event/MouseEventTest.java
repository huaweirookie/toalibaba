package com.zhunongyun.toalibaba.designpatterns.observer.event;

public class MouseEventTest {
    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();

        // 注册事件
        Mouse mouse = new Mouse();
        mouse.addListener(MouseEventType.ON_CLICK,callback);
        mouse.addListener(MouseEventType.ON_FOCUS,callback);
        // 调用方法
        mouse.click();
        // 失焦事件
        mouse.focus();
    }
}