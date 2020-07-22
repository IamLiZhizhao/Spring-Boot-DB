package com.lizhizhao.db.SpringBootJdbcTemplate.dao.impl;

import com.lizhizhao.db.SpringBootJdbcTemplate.dao.PersonDao;
import com.lizhizhao.db.SpringBootJdbcTemplate.entity.PersonDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lizhizhao
 * @since 2020-07-22 18:12
 */
@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int add(PersonDO personDO) {
        return jdbcTemplate.update("insert into person(NAME, AGE) values(?, ?)", personDO.getName(), personDO.getAge());
    }

    @Override
    public int update(PersonDO personDO) {
        return jdbcTemplate.update("UPDATE person SET NAME=? ,AGE=? WHERE id=?", personDO.getName(), personDO.getAge(), personDO.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE person where id = ?", id);
    }

    @Override
    public PersonDO findPersonById(int id) {
        List<PersonDO> list =  jdbcTemplate.query("SELECT * FROM person where id = ?", new Object[]{id}, new BeanPropertyRowMapper(PersonDO.class));

        if (list != null && list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }

    }

    @Override
    public List<PersonDO> findPersonList() {
        List<PersonDO> list =  jdbcTemplate.query("SELECT * FROM person", new Object[]{}, new BeanPropertyRowMapper(PersonDO.class));
        if (list != null && list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
}
