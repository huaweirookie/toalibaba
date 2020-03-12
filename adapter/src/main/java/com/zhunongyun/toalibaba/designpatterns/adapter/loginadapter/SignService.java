package com.zhunongyun.toalibaba.designpatterns.adapter.loginadapter;

public class SignService {
    /**
     * 注册方法
     */
    public ResultMsg register(String username, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    /**
     * 登录的方法
     */
    public ResultMsg login(String username, String password) {
        return null;
    }
}