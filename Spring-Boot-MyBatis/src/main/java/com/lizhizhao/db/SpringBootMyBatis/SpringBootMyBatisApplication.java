package com.lizhizhao.db.SpringBootMyBatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

// PS:这里的@MapperScan不是org.mybatis.spring.annotation.MapperScan而是 tk.mybatis.spring.annotation.MapperScan
@MapperScan("com.lizhizhao.db.SpringBootMyBatis.mapper")
@SpringBootApplication
public class SpringBootMyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMyBatisApplication.class, args);
    }

}
