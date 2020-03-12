package com.zhunongyun.toalibaba.designpatterns.proxy.myproxy;

import javafx.scene.chart.Chart;
import org.apache.commons.lang3.StringUtils;

import javax.tools.*;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyProxy {

    public static final String LN = "\r\n";

    public static Object newProxyInstance(MyClassLoader myClassLoader, Class<?>[] interfaces, MyInvocationHandler h) {
        try{
            // 1 动态生成java源码
            String src = generateSrc(interfaces);

            // 2 将源码输出到java文件中
            String filePath = MyProxy.class.getResource("").getPath();
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            //3、将java文件编译成class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manage = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manage.getJavaFileObjects(f);

            JavaCompiler.CompilationTask task = compiler.getTask(null,manage,null,null,null,iterable);
            task.call();
            manage.close();

            //4、将class加载进jvm
            Class proxyClass=myClassLoader.findClass("$Proxy0");
            f.delete();

            //5、返回代理类对象
            Constructor constructor = proxyClass.getConstructor(MyInvocationHandler.class);
            return constructor.newInstance(h);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        // TODO Auto-generated method stub
        StringBuffer sb = new StringBuffer();
        sb.append("package com.zhunongyun.toalibaba.designpatterns.proxy.myproxy;").append(LN);
        sb.append("import java.lang.reflect.Method;").append(LN);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{").append(LN);
        sb.append("private MyInvocationHandler h;").append(LN);
        sb.append("public $Proxy0(MyInvocationHandler h) { ").append(LN);
        sb.append("this.h = h;").append(LN);
        sb.append("}").append(LN);
        for (Method m : interfaces[0].getMethods()) {

            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {").append(LN);
            sb.append("try{").append(LN);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});").append(LN);
            sb.append("this.h.invoke(this,m,null);").append(LN);
            sb.append("}catch(Throwable e){").append(LN);
            sb.append("e.printStackTrace();").append(LN);
            sb.append("}").append(LN);
            sb.append("}").append(LN);
        }
        sb.append("}").append(LN);
        return sb.toString();
    }

    private static String toLowerFirstCase(String name) {
        if (StringUtils.isBlank(name)){
            return name;
        }

        char[] chars = name.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }
}