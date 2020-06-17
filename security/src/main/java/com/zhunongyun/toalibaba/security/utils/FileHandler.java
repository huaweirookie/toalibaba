package com.zhunongyun.toalibaba.security.utils;

import java.io.*;
import java.util.regex.Pattern;

/**
 * markdown字符替换
 */
public class FileHandler {

    private final static String FILE_PATH = "./../security/src/main/resources/";

    private final static Pattern pattern = Pattern.compile("[a-zA-z]");

    public void file() throws IOException {

        StringBuffer stringBuffer = new StringBuffer();

        try (FileReader reader = new FileReader(new File(FILE_PATH + "old_file"));
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            boolean no_handler = false;
            while ((line = br.readLine()) != null) {
                // 处理替换字符
                if (!no_handler && line.indexOf("```") > -1) {
                    no_handler = true;
                } else if (no_handler && line.indexOf("```") > -1) {
                    no_handler = false;
                }

                if (!no_handler) {
                    line = line.replaceAll("：", ":")
                            .replaceAll("（", "(")
                            .replaceAll("）", ")")
                            .replaceAll("。", ".")
                            .replaceAll("，", ",")
                            .replaceAll("、", ",");
                    if (line.matches("^#+.*$")) {
                        if (line.matches("^#+ {1}[0-9]+\\.{1}.* {1}.*$")) {
                            line = line.substring(0, line.indexOf(" ", line.lastIndexOf(".")) + 1) + line.substring(line.indexOf(" ", line.lastIndexOf(".")) + 1).replaceAll(" ", "");
                        }
                    } else if (line.indexOf(" | ") > -1) {
                        String[] temp = line.split("\\|");

                        StringBuffer sb = new StringBuffer("|");
                        for (int i = 1; i < temp.length; i++) {
                            sb.append(" " + temp[i].replaceAll(" | ", "") + " |");
                        }
                        line = sb.toString();
                    } else if (line.matches("^\\*{1} {1}.*$")) {
                        line = line.substring(0, 2) + line.substring(2).replaceAll(" | ", "");
                    } else {
                        line = line.replaceAll(" | ", "");
                    }

                    line = line.replaceAll(">\\*", ">\\* ");
                }

                // 将英文单词两边加上空格
                if (pattern.matcher(line).find()) {
                    line = this.handlerEnglish(line);
                }

                stringBuffer.append(line).append("\r\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 写文件
        File outFile = new File(FILE_PATH + "new_file");
        outFile.createNewFile();

        try (FileWriter writer = new FileWriter(outFile);
             BufferedWriter out = new BufferedWriter(writer)) {

            out.write(stringBuffer.toString());
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String handlerEnglish(String line) {
        char[] charList = line.toCharArray();

        if (null != charList && charList.length > 0) {
            StringBuilder sb = new StringBuilder();

            boolean englishFlag = false;
            boolean chineseFlag = false;
            boolean numberFlag = false;

            for (int i = 0; i < charList.length; i++) {
                if ((charList[i] >= 65 && charList[i] <= 90) || (charList[i] >= 97 && charList[i] <= 122)) {
                    englishFlag = true;
                } else if (charList[i] >= 0x4e00 && charList[i] <= 0x9fbb) {
                    chineseFlag = true;
                } else if (Character.isDigit(charList[i])) {
                    numberFlag = true;
                } else {
                    englishFlag = false;
                    chineseFlag = false;
                    numberFlag = false;
                }

                if ((englishFlag && chineseFlag) || (englishFlag && numberFlag) || (chineseFlag && numberFlag)) {
                    if (i > 0 && charList[i - 1] != 32) {
                        sb.append(" ");
                    }

                    if ((charList[i] >= 65 && charList[i] <= 90) || (charList[i] >= 97 && charList[i] <= 122)) {
                        englishFlag = true;
                        chineseFlag = false;
                        numberFlag = false;
                    } else if (charList[i] >= 0x4e00 && charList[i] <= 0x9fbb) {
                        englishFlag = false;
                        chineseFlag = true;
                        numberFlag = false;
                    } else if (Character.isDigit(charList[i])) {
                        englishFlag = false;
                        chineseFlag = false;
                        numberFlag = true;
                    }
                }

                sb.append(charList[i]);
            }
            return sb.toString();
        }

        return line;
    }

    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler();
        fileHandler.file();
        System.out.println("执行成功");
    }
}