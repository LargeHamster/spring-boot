package com.poming.boot.controller;

import com.alibaba.fastjson2.JSON;
import com.poming.boot.entity.vo.Book;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 没个破名怎活
 * @date 2022/6/27
 **/
@RestController
public class RabbitmqController {

    @Resource
    private RabbitTemplate rabbitTemplate;

    @RequestMapping(value = "book",method = RequestMethod.GET)
    public String sendBook(){
        Book book=new Book();
        book.setId(2L);
        book.setName("三国演义");
        book.setAuthor("罗贯中");
        rabbitTemplate.convertAndSend("directExchange","directRoutingKey", JSON.toJSONString(book),
                new CorrelationData());
        return "发送消息到Rabbitmq的队列了!";
    }

}
