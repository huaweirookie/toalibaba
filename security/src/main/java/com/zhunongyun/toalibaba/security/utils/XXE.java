package com.zhunongyun.toalibaba.security.utils;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class XXE {

    public static void main(String[] args) throws Exception {

        SAXReader reader = SAXReader.createDefault();

        // 防止外部实体POC
//        reader.setFeature("http://xml.org/sax/features/external-general-entities", false);
        // 防止参数实体POC
//        reader.setFeature("http://xml.org/sax/features/external-parameter-entities", false);

        File file = new File("src/main/resources/xxe.xml");

        Document document = reader.read(file);

        Element root = document.getRootElement();

        List<Element> childElements = root.elements();

        for (Element child : childElements) {
            System.out.printf(child.getStringValue());
        }
    }
}