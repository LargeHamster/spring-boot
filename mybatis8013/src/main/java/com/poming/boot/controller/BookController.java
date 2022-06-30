package com.poming.boot.controller;

import com.poming.boot.entity.vo.Book;
import com.poming.boot.mapper.BookMapper;
import com.poming.boot.mapper2.BookMapper2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 没个破名怎活
 * @date 2022/6/30
 **/
@RestController
public class BookController {

    @Resource
    private BookMapper bookMapper;

    @Resource
    private BookMapper2 bookMapper2;

    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    public void test1(){
        List<Book> books1 =bookMapper.getAllBooks();
        List<Book> books2 = bookMapper2.getAllBooks();
        System.out.println("books1:"+books1);
        System.out.println("books2:"+books2);
    }

}
