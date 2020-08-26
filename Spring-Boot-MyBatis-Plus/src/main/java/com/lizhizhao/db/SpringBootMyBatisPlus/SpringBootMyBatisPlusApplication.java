package com.lizhizhao.db.SpringBootMyBatisPlus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lizhizhao.db.SpringBootMyBatisPlus.mapper")
public class SpringBootMyBatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMyBatisPlusApplication.class, args);
    }

}
