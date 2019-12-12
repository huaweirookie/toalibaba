package com.zhunongyun.toalibaba.designpatterns.adapter.loginadapter.v2;

import com.zhunongyun.toalibaba.designpatterns.adapter.loginadapter.ResultMsg;

public class LoginForWeChatAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWeChatAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}