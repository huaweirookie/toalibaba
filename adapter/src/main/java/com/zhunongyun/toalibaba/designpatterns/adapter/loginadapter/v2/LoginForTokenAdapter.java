package com.zhunongyun.toalibaba.designpatterns.adapter.loginadapter.v2;

import com.zhunongyun.toalibaba.designpatterns.adapter.loginadapter.ResultMsg;

public class LoginForTokenAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}