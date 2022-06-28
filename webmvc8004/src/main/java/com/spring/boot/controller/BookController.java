package com.spring.boot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 没个破名怎活
 * @date 2022/6/28
 **/
@RestController
public class BookController {

    @CrossOrigin(value = "http://localhost:8005")
    @RequestMapping(value = "/book",method = RequestMethod.GET)
    public String addBook(String name){
        return "receive:"+name;
    }

    @RequestMapping(value = "/getbook",method = RequestMethod.GET)
    public String getBook(String name){
        return "全局跨域配置:"+name;
    }

}
