package com.lizhizhao.db.SpringBootMyBatis.bean;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BankUser {

    private Integer id;

    private String name;

    private Integer age;

    private BigDecimal money;

}