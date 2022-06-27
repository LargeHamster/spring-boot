package com.poming.boot.service;

import com.alibaba.fastjson2.JSONObject;
import com.poming.boot.entity.vo.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author 没个破名怎活
 * @date 2022/6/27
 **/
@Slf4j
@Service
public class DirectReceiver {

    @RabbitListener(queues = "rabbitmq")
    public void process(String book){
        log.info("接收到的消息:{}", JSONObject.parseObject(book, Book.class));
    }

}
