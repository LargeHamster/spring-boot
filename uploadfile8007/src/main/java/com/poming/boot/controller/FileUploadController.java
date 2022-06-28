package com.poming.boot.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author 没个破名怎活
 * @date 2022/6/28
 **/
@RestController
public class FileUploadController {

    SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(@RequestBody MultipartFile uploadFile, HttpServletRequest req){
        String realPath="E:\\Git\\file\\";
        String format=sdf.format(new Date());
        File folder=new File(realPath+format);
        if (!folder.isDirectory()){
            folder.mkdir();
        }
        String oldName=uploadFile.getOriginalFilename();
        String newName= UUID.randomUUID().toString()+oldName.substring(oldName.lastIndexOf("."));
        try {
            uploadFile.transferTo(new File(folder,newName));
            String filePath=realPath+format+"\\"+newName;
            return filePath;
        }catch (IOException e){
            e.printStackTrace();
        }
        return "上传失败!";
    }

}
