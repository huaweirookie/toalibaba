package com.zhunongyun.toalibaba.designpatterns.prototype.deep;

public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();

        System.out.println("深克隆,对象中的引用类型字段JinGuBang,内存地址是否相同:"
                + (qiTianDaSheng.getJinGuBang() == clone.getJinGuBang()));
    }
}