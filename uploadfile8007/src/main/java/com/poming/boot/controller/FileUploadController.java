package com.poming.boot.controller;

import com.poming.boot.service.UploadFileService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 没个破名怎活
 * @date 2022/6/28
 **/
@RestController
public class FileUploadController {

    @Resource
    private UploadFileService uploadFileService;

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(@RequestBody MultipartFile uploadFile){
        return uploadFileService.uploadFile(uploadFile);
    }

    @RequestMapping(value = "/uploads",method = RequestMethod.POST)
    public List<String> uploads(@RequestBody MultipartFile[] uploadFiles){
        List<String> fileUrls=new ArrayList<>();
        for (MultipartFile multipartFile : uploadFiles) {
            String fileUrl = uploadFileService.uploadFile(multipartFile);
            fileUrls.add(fileUrl);
        }
        return fileUrls;
    }

}
