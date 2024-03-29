package com.canu.Util;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.ObjectMetadata;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.UUID;

/**
 * @Date 2022/10/26 10:25
 * @created by canu
 */
//阿里云上传的工具类
public class OSSUtil {

    public static String ENDPOINT = "oss-cn-shanghai.aliyuncs.com";
    public static String ACCESSKEYID = "LTAI4FbgffEVhVHiUrw71eu2";
    public static String ACCESSKEYSECRET = "RyWJQT7a7iH002tkSSwv58QPEfxzCH";
    public static String BUCKETNAME = "zzuoss";
    public static String KEY = "";

    public static String picOSS(MultipartFile uploadFile) throws Exception {
        // 创建OSSClient实例
        OSSClient ossClient = new OSSClient(ENDPOINT, ACCESSKEYID, ACCESSKEYSECRET);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        // 上传
        long time = System.currentTimeMillis();
//        new Date().getTime();
        String date = sf.format(time);

        //上传的文件名
        String fileName = UUID.randomUUID().toString().substring(0, 5) + uploadFile.getOriginalFilename();

        //设置请求头
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentType(getcontentType(fileName.substring(fileName.lastIndexOf("."))));
        //上传开始
        ossClient.putObject(BUCKETNAME, KEY + date + "/" + fileName, new ByteArrayInputStream(uploadFile.getBytes()),objectMetadata);

        // 关闭client
        ossClient.shutdown();
//        Date expiration = new Date(new Date().getTime() + 3600L * 1000 * 24 * 365 * 10);
//        return ossClient.generatePresignedUrl(BUCKETNAME, KEY + date + "/" + uploadFile.getOriginalFilename(), expiration).toString();
        return "https://" + BUCKETNAME + ".oss-cn-shanghai.aliyuncs.com" + "/" + KEY + date + "/" + fileName;
    }

    //根据文件的类型 设置请求头
    public static String getcontentType(String FilenameExtension) {
        if (FilenameExtension.equalsIgnoreCase(".bmp")) {
            return "image/bmp";
        }
        if (FilenameExtension.equalsIgnoreCase(".gif")) {
            return "image/gif";
        }
        if (FilenameExtension.equalsIgnoreCase(".jpeg") ||
                FilenameExtension.equalsIgnoreCase(".jpg") ||
                FilenameExtension.equalsIgnoreCase(".png")) {
            return "image/jpg";
        }
        if (FilenameExtension.equalsIgnoreCase(".html")) {
            return "text/html";
        }
        if (FilenameExtension.equalsIgnoreCase(".txt")) {
            return "text/plain";
        }
        if (FilenameExtension.equalsIgnoreCase(".vsd")) {
            return "application/vnd.visio";
        }
        if (FilenameExtension.equalsIgnoreCase(".pptx") ||
                FilenameExtension.equalsIgnoreCase(".ppt")) {
            return "application/vnd.ms-powerpoint";
        }
        if (FilenameExtension.equalsIgnoreCase(".docx") ||
                FilenameExtension.equalsIgnoreCase(".doc")) {
            return "application/msword";
        }
        if (FilenameExtension.equalsIgnoreCase(".xml")) {
            return "text/xml";
        }
        return "image/jpg";
    }
}
