package com.zhunongyun.toalibaba.designpatterns.adapter.loginadapter.v2;

import com.zhunongyun.toalibaba.designpatterns.adapter.loginadapter.ResultMsg;

public interface IPassportForThird {
    /**
     * QQ登录
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     */
    ResultMsg loginForWeChat(String id);

    /**
     * 记住登录状态后自动登录
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机号登录
     */
    ResultMsg loginForTelephone(String telephone, String code);

    /**
     * 注册后自动登录
     */
    ResultMsg loginForRegister(String username, String passport);
}