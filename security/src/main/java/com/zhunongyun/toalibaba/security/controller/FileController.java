package com.zhunongyun.toalibaba.security.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/file")
public class FileController {

    /**
     * 下载任意文件,固定目录+文件名形式
     *
     * @param response
     * @param fileName
     * @throws IOException
     */
    @GetMapping(value = "/download")
    public void downloadFile(HttpServletResponse response, @RequestParam("fileName") String fileName) throws IOException {
        /**
         * 在/Users/oscar/Downloads/test/download/file/ 目录下存在多个 txt 文件
         * 正常的业务场景是，前端传入fileName文件名（例如 test.txt），下载/Users/oscar/Downloads/test/download/file/下对应的文件
         * 黑客在攻击时会可能会传入一个文件路径， 例如 ../../../../etc/passwd等路径，这样就能轻松下载服务器的 passwd 文件
         */
        String filePath = "/Users/oscar/Downloads/test/download/file/" + fileName;

        this.handlerDownloadFile(response, filePath);
    }

    /**
     * 上传任意文件
     * @param file 上传文件
     * @return
     */
    @PostMapping("/upload")
    public JSONObject upload(@RequestParam("file") MultipartFile file) {
        /**
         * 此处文件上传存在四处安全问题
         * 1. 未校验文件格式（包含校验文件后缀 和 校验文件内容中的文件格式）
         * 2. 将上传的文件上传至容器能解析位置
         * 3. 文件未重命名，重命名后增加黑客攻击难度
         * 4. 将文件上传地址信息返回前端
         */
        try {
            FileCopyUtils.copy(file.getBytes(), new File("static/" + file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JSONObject.parseObject("{\"code\":\"200\", \"msg\":\"文件上传成功\"，\"data\"：{\"filePath\":\"static/xx.xx\"}}");
    }

    /**
     * 下载文件公共方法
     *
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
