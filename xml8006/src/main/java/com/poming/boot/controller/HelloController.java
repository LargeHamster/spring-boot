package com.poming.boot.controller;

import com.poming.boot.bean.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 没个破名怎活
 * @date 2022/6/28
 **/
@RestController
public class HelloController {

    @Resource
    private Hello hello;

    @RequestMapping(value = "/hello")
    public String hello(){
        return hello.sayHello("大仓鼠");
    }

}
