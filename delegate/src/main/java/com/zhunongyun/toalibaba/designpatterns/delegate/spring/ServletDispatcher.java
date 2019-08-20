package com.zhunongyun.toalibaba.designpatterns.delegate.spring;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ServletDispatcher {
    // 维护了所有的Controller与uri的映射信息
    List<Handler> handlers = new ArrayList<Handler>();

    public ServletDispatcher(List<Handler> handlers) {
        Class<UserController> userControllerClass = UserController.class;
        try {
            handlers.add(new Handler(userControllerClass.newInstance(),
                    userControllerClass.getMethod("findUserInfoById",new Class[]{Long.class}),
                    "/system/user")
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doServlet(HttpServletRequest request, HttpServletResponse response){
        doDispatcher(request,response);
    }

    private void doDispatcher(HttpServletRequest request, HttpServletResponse response){
        //  获取用户请求的URL
        String requestURI = request.getRequestURI();
        // 选择需要分发给哪个控制器
        Handler handler = null;
        for (Handler h : handlers) {
            if(handler.url.equals(requestURI)){
                handler = h;
                break;
            }
        }

        try {
            // 执行控制器  让控制器干活
            Object aa = handler.method.invoke(handler.controller, request.getParameter("1000"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }




    class Handler {
        private Object controller;

        private Method method;

        private String url;

        public Handler() {}

        public Handler(Object controller, Method method, String url) {
            this.controller = controller;
            this.method = method;
            this.url = url;
        }

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}