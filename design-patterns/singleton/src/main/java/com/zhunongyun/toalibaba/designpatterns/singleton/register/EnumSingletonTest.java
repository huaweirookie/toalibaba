package com.zhunongyun.toalibaba.designpatterns.singleton.register;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();

        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileOutputStream = new FileOutputStream("./singleton/EnumSingleton.obj");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s2);
            objectOutputStream.flush();
            objectOutputStream.close();

            fileInputStream = new FileInputStream("./singleton/EnumSingleton.obj");
            objectInputStream = new ObjectInputStream(fileInputStream);
            s1 = (EnumSingleton) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(s1 == s2);

            /**
             * 反射测试
             */
            System.out.println("------------------反射测试--------------------");

            try {
                Class clazz = EnumSingleton.class;
                Constructor c = clazz.getDeclaredConstructor();
                c.newInstance();
            }catch (Exception e){
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(objectInputStream);
            IOUtils.closeQuietly(objectOutputStream);
            IOUtils.closeQuietly(fileInputStream);
            IOUtils.closeQuietly(fileOutputStream);
        }
    }
}