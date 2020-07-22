package com.lizhizhao.db.SpringBootJdbcTemplate.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author lizhizhao
 * @since 2020-07-22 18:08
 */
@Getter
@Setter
@ToString
public class PersonDO {

    private Long id;

    private Integer age;

    private String name;

}
