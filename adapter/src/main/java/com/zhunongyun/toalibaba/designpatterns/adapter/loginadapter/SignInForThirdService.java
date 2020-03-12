package com.zhunongyun.toalibaba.designpatterns.adapter.loginadapter;

public class SignInForThirdService extends SignService {

    /**
     * QQ登录
     */
    public ResultMsg loginForQQ(String openId) {
        // 1、openId 是全局唯一，我们可以把它当做是一个用户名(加长)
        // 2、密码默认为 QQ_EMPTY
        // 3、注册(在原有系统里面创建一个用户)
        // 4、调用原来的登录方法
        return loginForRegister(openId, null);
    }

    /**
     * WetChat登录
     */
    public ResultMsg loginForWeChat(String openId) {
        return null;
    }

    /**
     * Token登录
     */
    public ResultMsg loginForToken(String token) {
        // 通过token拿到用户信息，然后再重新登陆了一次
        return null;
    }

    /**
     * 手机号码登录
     */
    public ResultMsg loginForTelephone(String telephone, String code) {
        return null;
    }

    public ResultMsg loginForRegister(String username, String password) {
        super.register(username, password);
        return super.login(username, password);
    }
}