package com.poming.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author 没个破名怎活
 * @date 2022/6/27
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ThymeleafApp {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafApp.class,args);
    }

}
