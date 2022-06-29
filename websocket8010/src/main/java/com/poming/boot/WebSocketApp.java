package com.poming.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

/**
 * @author 没个破名怎活
 * @date 2022/6/29
 **/
@EnableWebSocketMessageBroker
@SpringBootApplication
public class WebSocketApp {

    public static void main(String[] args) {
        SpringApplication.run(WebSocketApp.class,args);
    }

}
