package com.lizhizhao.db.SpringBootJPA.service;

import com.lizhizhao.db.SpringBootJPA.bean.Person;

/**
 * @author lizhizhao
 * @since 2020-06-02 11:36
 */
public interface PersonService {
    String create(Person person);

    Boolean update(Person person);

    Boolean delete(Long id);
}
