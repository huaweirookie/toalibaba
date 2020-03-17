package com.zhunongyun.toalibaba.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@RestController
@RequestMapping("/file")
public class FileController {

    /**
     * 下载任意文件,固定目录+文件名形式
     * @param response
     * @param fileName
     * @throws IOException
     */
    @GetMapping(value = "/download")
    public void downloadFile(HttpServletResponse response, @RequestParam("fileName") String fileName) throws IOException {
        // 在/Users/oscar/Downloads/test/download/file/ 目录下存在一个文件 test_file.txt
        String filePath = "/Users/oscar/Downloads/test/download/file/" + fileName;

        this.handlerDownloadFile(response, filePath);
    }

    /**
     * 下载任意文件,固定目录+文件名形式
     * @param response
     * @param fileName
     * @throws IOException
     */
    @GetMapping(value = "/upload")
    public void uploadFile(HttpServletResponse response, @RequestParam("fileName") String fileName) throws IOException {
        // 在/Users/oscar/Downloads/test/download/file/ 目录下存在一个文件 test_file.txt
        String filePath = "/Users/oscar/Downloads/test/download/file/" + fileName;

        this.handlerDownloadFile(response, filePath);
    }

    /**
     * 下载文件公共方法
     * @param response
     * @param filePath
     */
    private void handlerDownloadFile(HttpServletResponse response, String filePath) {
        try (InputStream f = new FileInputStream(new File(filePath))) {

            response.setContentType("application/text;charset=utf-8");
            // 下载文件的名称
            response.setHeader("Content-Disposition", "attachment;filename="
                    + new String(("测试下载文件").getBytes("gbk"), "iso-8859-1"));

            try (BufferedInputStream bis = new BufferedInputStream(f);
                 BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream())) {

                byte[] buff = new byte[2048];
                int bytesRead;
                while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                    bos.write(buff, 0, bytesRead);
                }
                bos.flush();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }
}
