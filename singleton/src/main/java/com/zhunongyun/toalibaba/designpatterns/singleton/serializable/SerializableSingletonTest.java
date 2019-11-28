package com.zhunongyun.toalibaba.designpatterns.singleton.serializable;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableSingletonTest {
    public static void main(String[] args) {
        SerializableSingleton s1 = null;
        SerializableSingleton s2 = SerializableSingleton.getInstance();

        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileOutputStream = new FileOutputStream("./singleton/SerializableSingleton.obj");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s2);
            objectOutputStream.flush();
            objectOutputStream.close();

            fileInputStream = new FileInputStream("./singleton/SerializableSingleton.obj");
            objectInputStream = new ObjectInputStream(fileInputStream);
            s1 = (SerializableSingleton) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(s1 == s2);
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