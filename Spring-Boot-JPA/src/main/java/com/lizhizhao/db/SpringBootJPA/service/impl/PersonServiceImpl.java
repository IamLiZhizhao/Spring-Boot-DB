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
    public Person create(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person update(Person person) {
        return personRepository.saveAndFlush(person);
    }

    @Override
    public void delete(Long id) {
        personRepository.deleteById(id);
    }
}
