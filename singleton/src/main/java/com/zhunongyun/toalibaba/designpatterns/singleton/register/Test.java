package com.zhunongyun.toalibaba.designpatterns.singleton.register;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        String data = "test_abcd123*ab%@d";

        String regEx = "[`~!@#$%^&*()+|}{':;\\/<>,.]";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(data);
        String variableData = matcher.replaceAll("").toString();

        System.out.println(variableData);
    }
}
