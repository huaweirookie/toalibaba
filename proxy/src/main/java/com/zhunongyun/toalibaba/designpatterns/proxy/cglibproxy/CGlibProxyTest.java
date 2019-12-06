package com.zhunongyun.toalibaba.designpatterns.proxy.cglibproxy;

import org.springframework.cglib.core.DebuggingClassWriter;

public class CGlibProxyTest {
    public static void main(String[] args) {
        // 把CGlib生成的代码输出到文件中
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "./proxy/target/classes/");

        try {
            NewGirl newGirl = (NewGirl) new CGlibMeipo().getInstance(NewGirl.class);
            newGirl.findLove();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}