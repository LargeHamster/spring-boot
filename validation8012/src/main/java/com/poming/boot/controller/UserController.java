package com.poming.boot.controller;

import com.poming.boot.entity.bo.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 没个破名怎活
 * @date 2022/6/30
 **/
@RestController
public class UserController {

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public List<String> addUser(@Validated @RequestBody User user){
        List<String> list=new ArrayList<>();
        list.add("返回成功!");
        return list;
    }

}
