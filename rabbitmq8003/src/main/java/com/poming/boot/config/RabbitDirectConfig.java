package com.poming.boot.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 没个破名怎活
 * @date 2022/6/27
 * 交换机有四种 Direct Fanout Topic Header
 **/
@Configuration
public class RabbitDirectConfig {

    /**
     * rabbitmq是队列名字
     * @return
     */
    @Bean
    public Queue queue(){
        return new Queue("rabbitmq");
    }

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("directExchange",true,false,null);
    }

    @Bean
    public Binding binding(){
        return BindingBuilder.bind(queue()).to(directExchange()).with("directRoutingKey");
    }

}
