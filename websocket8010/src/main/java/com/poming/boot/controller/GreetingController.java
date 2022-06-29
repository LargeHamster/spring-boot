package com.poming.boot.controller;

import com.poming.boot.entity.bo.Chat;
import com.poming.boot.entity.bo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.security.Principal;

/**
 * @author 没个破名怎活
 * @date 2022/6/29
 **/
@Controller
public class GreetingController {

    @Resource(name = "brokerMessagingTemplate")
    private SimpMessagingTemplate messagingTemplate;

    //群发
    @MessageMapping(value = "/hello")
    @SendTo(value = "/topic/greetings")
    public Message greeting(Message message) throws Exception{
        return message;
    }

    //点对点
    @MessageMapping(value = "/chat")
    public void chat(Principal principal, Chat chat){
        String from=principal.getName();
        chat.setFrom(from);
        messagingTemplate.convertAndSendToUser(chat.getTo(),"/queue/chat",chat);
    }

}
