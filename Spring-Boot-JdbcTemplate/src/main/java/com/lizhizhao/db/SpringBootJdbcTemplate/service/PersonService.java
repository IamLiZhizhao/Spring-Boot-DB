package com.lizhizhao.db.SpringBootJdbcTemplate.service;

import com.lizhizhao.db.SpringBootJdbcTemplate.entity.PersonDO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lizhizhao
 * @since 2020-07-22 18:27
 */
public interface PersonService {
    int add(PersonDO personDO);

    int update(PersonDO personDO);

    int delete(int id);

    PersonDO findPersonById(int id);

    List<PersonDO> findPersonList();
}
