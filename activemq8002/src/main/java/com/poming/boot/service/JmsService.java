package com.poming.boot.service;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.poming.boot.entity.vo.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Queue;

/**
 * @author 没个破名怎活
 * @date 2022/6/27
 **/
@Slf4j
@Service
public class JmsService {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Resource
    private Queue queue;

    /**
     * 将消息发送到目标队列
     */
    public void send(Book book){
        jmsMessagingTemplate.convertAndSend(this.queue, JSON.toJSONString(book));
    }

    /**
     * 监听名为activemq的队列，对收到的消息book进行业务处理
     * @param book
     */
    @JmsListener(destination = "activemq")
    public void receive(String book){
        log.info("收到了消息:{}", JSONObject.parseObject(book,Book.class));
    }

}
