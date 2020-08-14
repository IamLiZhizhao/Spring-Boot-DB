package com.lizhizhao.db.SpringBootMyBatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhizhao
 * @since 2020-08-14 17:50
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("print")
    public String printHello() {
        String hello = "Hello";
        System.out.println(hello);
        return hello;
    }

}
