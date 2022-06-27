package com.poming.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * JMS包括两种消息模型：
 *  点对点 和   发布者/订阅者模式
 *  本例子主要是发布者/订阅者模式(也可以理解为生产者/消费者)
 */
@SpringBootApplication
public class ActivemqApp {

    public static void main(String[] args) {
        SpringApplication.run(ActivemqApp.class,args);
    }

}