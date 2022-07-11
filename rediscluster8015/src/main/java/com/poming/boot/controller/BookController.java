package com.poming.boot.controller;

import com.poming.boot.entity.vo.Book;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 没个破名怎活
 * @date 2022/7/1
 **/
@RestController
public class BookController {

    @Resource
    private RedisTemplate<Object,Object> redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public void test(){
        ValueOperations<Object, Object> ops = redisTemplate.opsForValue();
        Book book=new Book();
        book.setName("水浒传");
        book.setAuthor("施耐庵");
        ops.set("b1",book);
        System.out.println("b1:"+ops.get("b1"));
        ValueOperations<Object, Object> ops2 = redisTemplate.opsForValue();
        ops2.set("k1","v1");
        System.out.println("k1:"+ops2.get("k1"));
    }

}
