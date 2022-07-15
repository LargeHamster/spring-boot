package com.poming.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 没个破名怎活
 * @date 2022/7/15
 **/
@Controller
public class IndexController {

    @RequestMapping(value = "content",method = RequestMethod.GET)
    public String contet(){
        return "content";
    }

}
