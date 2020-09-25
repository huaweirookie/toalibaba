package com.zhunongyun.toalibaba.security.utils;

public class TestClassLoader {

    public static void main(String[] args) {

        ClassLoader loader = TestClassLoader.class.getClassLoader();

        System.out.println(loader.toString());

        System.out.println(loader.getParent().toString());

        System.out.println(loader.getParent().getParent());

    }
}
