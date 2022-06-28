package com.poming.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

/**
 * @author 没个破名怎活
 * @date 2022/6/28
 **/
@RestController
public class UploadController {

    @RequestMapping(value = "upload",method = RequestMethod.GET)
    public String upload(){
            throw new MaxUploadSizeExceededException(1L);
    }

}
