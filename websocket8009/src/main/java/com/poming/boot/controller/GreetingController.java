package com.poming.boot.controller;

import com.poming.boot.entity.bo.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author 没个破名怎活
 * @date 2022/6/29
 **/
@Controller
public class GreetingController {

    @MessageMapping(value = "/hello")
    @SendTo(value = "/topic/greetings")
    public Message greeting(Message message) throws Exception{
        return message;
    }

}
