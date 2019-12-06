package com.zhunongyun.toalibaba.designpatterns.proxy.myproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class MyClassLoader extends ClassLoader {

    private File classPathFile;

    public MyClassLoader() {
        String classPath = MyClassLoader.class.getResource("").getPath();
        classPathFile = new File(classPath);
    }

    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException {
        String className = MyClassLoader.class.getPackage().getName() + "." +name;
        if (classPathFile != null) {
            File file = new File(classPathFile, name + ".class");

            try (FileInputStream fileInputStream = new FileInputStream(file);
                 ByteArrayOutputStream outputStream = new ByteArrayOutputStream();) {
                byte[] buff = new byte[1024];
                int len;
                while((len = fileInputStream.read(buff)) != -1){
                    outputStream.write(buff, 0, len);
                }
                return defineClass(className, outputStream.toByteArray(), 0, outputStream.size());
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
