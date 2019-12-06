package com.zhunongyun.toalibaba.designpatterns.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee {

    private Map<String, IEmployee> register= new HashMap<>();

    public Leader() {
        register.put("安全测试", new EmployeeA());
        register.put("架构设计", new EmployeeB());
    }


    public void doing(String command) {
        register.get(command).doing(command);
    }
}