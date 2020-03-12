package com.zhunongyun.toalibaba.designpatterns.adapter.loginadapter.v2;

import com.zhunongyun.toalibaba.designpatterns.adapter.loginadapter.ResultMsg;
import com.zhunongyun.toalibaba.designpatterns.adapter.loginadapter.SignService;

public class PassportForThirdAdapter extends SignService implements IPassportForThird {
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    public ResultMsg loginForWeChat(String id) {
        return processLogin(id, LoginForWeChatAdapter.class);
    }

    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    public ResultMsg loginForTelephone(String telephone, String code) {
        return processLogin(telephone, LoginForTelAdapter.class);
    }

    public ResultMsg loginForRegister(String username, String password) {
        super.register(username, password);
        return super.login(username, password);
    }

    //这里用到了简单工厂模式及策略模式
    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz) {
        try {
            LoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(key, adapter);
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}