package com.lizhizhao.db.SpringBootJdbcTemplate.service.impl;

import com.lizhizhao.db.SpringBootJdbcTemplate.dao.PersonDao;
import com.lizhizhao.db.SpringBootJdbcTemplate.entity.PersonDO;
import com.lizhizhao.db.SpringBootJdbcTemplate.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lizhizhao
 * @since 2020-07-22 18:28
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;

    @Override
    public int add(PersonDO personDO) {
        return personDao.add(personDO);
    }

    @Override
    public int update(PersonDO personDO) {
        return personDao.update(personDO);
    }

    @Override
    public int delete(int id) {
        return personDao.delete(id);
    }

    @Override
    public PersonDO findPersonById(int id) {
        return personDao.findPersonById(id);
    }

    @Override
    public List<PersonDO> findPersonList() {
        return personDao.findPersonList();
    }
}
