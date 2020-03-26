package com.zhunongyun.toalibaba.security.utils;

import java.util.Base64;

public class Base64Demo {

    public static void main(String[] args) {
        try {
            // 编码
            String encode = Base64.getEncoder().encodeToString("Son".getBytes("UTF-8"));
            System.out.println("Son Base64编码后：" + encode);

            // 解码
            byte[] decode = Base64.getDecoder().decode(encode);
            System.out.println("Son经Base64编码后的再通过Base64解码结果：" + new String(decode, "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}