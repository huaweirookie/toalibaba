package com.zhunongyun.toalibaba.designpatterns.template.jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private String username;
    private String password;
    private String nickName;
    private int age;
    private String addr;
}