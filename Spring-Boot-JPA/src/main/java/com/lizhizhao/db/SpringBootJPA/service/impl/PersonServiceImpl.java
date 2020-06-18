package com.lizhizhao.db.SpringBootJPA.service.impl;

import com.lizhizhao.db.SpringBootJPA.bean.Person;
import com.lizhizhao.db.SpringBootJPA.repository.PersonRepository;
import com.lizhizhao.db.SpringBootJPA.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lizhizhao
 * @since 2020-06-02 11:37
 */
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public String create(Person person) {
        return null;
    }

    @Override
    public Boolean update(Person person) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
