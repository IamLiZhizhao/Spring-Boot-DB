package com.lizhizhao.db.SpringBootJPA.service;

import com.lizhizhao.db.SpringBootJPA.bean.Person;

/**
 * @author lizhizhao
 * @since 2020-06-02 11:36
 */
public interface PersonService {
    Person create(Person person);

    Person update(Person person);

    void delete(Long id);
}
