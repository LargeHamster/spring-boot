package com.poming.boot.controller;

import com.poming.boot.entity.vo.Book;
import com.poming.boot.service.JmsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 没个破名怎活
 * @date 2022/6/27
 **/
@RestController
public class ActivemqController {

    @Resource
    private JmsService jmsService;

    @RequestMapping(value = "book",method = RequestMethod.GET)
    public String showBook(){
        Book book =new Book();
        book.setId(1L);
        book.setName("红楼梦");
        book.setAuthor("曹雪芹");
        jmsService.send(book);
        return "消息已经发送!";
    }

}
