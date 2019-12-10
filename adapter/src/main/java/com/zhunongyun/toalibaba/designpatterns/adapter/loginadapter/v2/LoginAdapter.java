package com.zhunongyun.toalibaba.designpatterns.adapter.loginadapter.v2;

import com.zhunongyun.toalibaba.designpatterns.adapter.loginadapter.ResultMsg;

public interface LoginAdapter {
    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}