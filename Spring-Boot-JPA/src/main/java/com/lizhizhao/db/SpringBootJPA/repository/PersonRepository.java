package com.lizhizhao.db.SpringBootJPA.repository;

import com.lizhizhao.db.SpringBootJPA.bean.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author lizhizhao
 * @since 2020-06-02 11:31
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
