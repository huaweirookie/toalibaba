package com.zhunongyun.toalibaba.leetcode.code;

public class Test {

    public static int sum(Integer data) {
        if (null == data || data == 0) {
            return 1;
        }

        if (data == 1) {
            return 1;
        } else {
            return data * sum(data - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Test.sum(5));
    }
}
