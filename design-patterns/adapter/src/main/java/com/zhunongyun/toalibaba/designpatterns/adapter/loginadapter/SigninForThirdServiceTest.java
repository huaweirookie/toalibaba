package com.zhunongyun.toalibaba.designpatterns.adapter.loginadapter;

public class SigninForThirdServiceTest {
    public static void main(String[] args) {
        SignInForThirdService service = new SignInForThirdService();
        // 不改变原来的代码，也要能够兼容新的需求
        // 还可以再加一层策略模式
        service.loginForQQ("sdfgdgfwresdf9123sdf");
    }
}