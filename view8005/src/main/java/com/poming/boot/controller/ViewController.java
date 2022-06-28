package com.poming.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 没个破名怎活
 * @date 2022/6/28
 **/
@Controller
public class ViewController {

    @RequestMapping(value = "/book",method = RequestMethod.GET)
    public String view(){
        return "book";
    }

}
