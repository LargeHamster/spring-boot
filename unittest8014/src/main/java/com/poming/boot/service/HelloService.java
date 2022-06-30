package com.poming.boot.service;

import org.springframework.stereotype.Service;

/**
 * @author 没个破名怎活
 * @date 2022/6/30
 **/
@Service
public class HelloService {

    public String sayHello(String name){
        return "Hello "+name+" !";
    }

}
