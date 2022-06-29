package com.poming.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author 没个破名怎活
 * @date 2022/6/29
 **/
@EnableCaching
@SpringBootApplication
public class RedisApp {

    public static void main(String[] args) {
        SpringApplication.run(RedisApp.class,args);
    }

}
