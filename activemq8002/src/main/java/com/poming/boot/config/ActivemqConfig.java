package com.poming.boot.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/**
 * @author 没个破名怎活
 * @date 2022/6/27
 **/
@Configuration
public class ActivemqConfig {

    @Bean
    public Queue queue(){
        //队列名字activemq
        return new ActiveMQQueue("activemq");
    }

}
