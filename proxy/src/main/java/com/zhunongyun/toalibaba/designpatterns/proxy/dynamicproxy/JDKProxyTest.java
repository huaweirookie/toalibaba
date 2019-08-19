package com.zhunongyun.toalibaba.designpatterns.proxy.dynamicproxy;

import com.zhunongyun.toalibaba.designpatterns.proxy.Girl;
import com.zhunongyun.toalibaba.designpatterns.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class JDKProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new JDKMeipo().getInstance(new Girl());
        person.findLove();

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});

        try (FileOutputStream fileOutputStream = new FileOutputStream("$Proxy0.class")) {
            fileOutputStream.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}