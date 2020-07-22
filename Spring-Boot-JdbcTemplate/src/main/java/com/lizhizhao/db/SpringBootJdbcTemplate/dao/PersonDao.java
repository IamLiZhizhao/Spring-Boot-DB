package com.lizhizhao.db.SpringBootJdbcTemplate.dao;

import com.lizhizhao.db.SpringBootJdbcTemplate.entity.PersonDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lizhizhao
 * @since 2020-07-22 18:10
 */
public interface PersonDao {
    int add(PersonDO personDO);

    int update(PersonDO personDO);

    int delete(int id);

    PersonDO findPersonById(int id);

    List<PersonDO> findPersonList();
}
