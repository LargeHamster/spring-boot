package com.poming.boot.controller;

import com.poming.boot.param.Content;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 没个破名怎活
 * @date 2022/7/15
 **/
@RestController
public class ContentController {

    @RequestMapping(value = "/content",method = RequestMethod.POST)
    public Content content(@RequestBody Content content){
        content.setSuccess(true);
        return content;
    }

}
