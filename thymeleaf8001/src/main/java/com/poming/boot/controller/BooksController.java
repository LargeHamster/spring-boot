package com.poming.boot.controller;

import com.poming.boot.entity.vo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 没个破名怎活
 * @date 2022/6/27
 **/
@Controller
public class BooksController {

    @RequestMapping(value = "book",method = RequestMethod.GET)
    public String showBooks(Model model){
        Book book1 =new Book();
        book1.setId(1L);
        book1.setName("三国演义");
        book1.setAuthor("罗贯中");
        Book book2=new Book();
        book2.setId(2L);
        book2.setName("红楼梦");
        book2.setAuthor("曹雪芹");
        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        model.addAttribute("books",list);
        return "books";
    }

}
