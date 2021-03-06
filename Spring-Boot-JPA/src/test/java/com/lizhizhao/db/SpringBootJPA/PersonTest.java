package com.lizhizhao.db.SpringBootJPA;

import com.lizhizhao.db.SpringBootJPA.bean.Person;
import com.lizhizhao.db.SpringBootJPA.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author lizhizhao
 * @since 2020-07-22 17:42
 */
@SpringBootTest
public class PersonTest {
    @Autowired
    private PersonRepository personRepository;
    private Long id;

    /**
     * 保存person到数据库
     */
    @Test
    public void setUp() {
        assertNotNull(personRepository);
        Person person = new Person("lizhizhao", 21);
        Person savedPerson = personRepository.saveAndFlush(person);// 更新 person 对象的姓名
        savedPerson.setName("lzz");
        personRepository.save(savedPerson);
        id = savedPerson.getId();
    }

    /**
     * 使用 JPA 自带的方法查找 person
     */
    @Test
    public void should_get_person() {
        Optional<Person> lzzPerson = personRepository.findByName("lzz");
        System.out.println(lzzPerson.get());
        Optional<Person> personOptional = personRepository.findById(id);
        assertTrue(personOptional.isPresent());
        assertEquals("SnailClimb", personOptional.get().getName());
        assertEquals(Integer.valueOf(23), personOptional.get().getAge());

        List<Person> personList = personRepository.findByAgeGreaterThan(18);
        assertEquals(1, personList.size());
        // 清空数据库
        personRepository.deleteAll();
    }

    /**
     * 自定义 query sql 查询语句查找 person
     */

    @Test
    public void should_get_person_use_custom_query() {
            // 查找所有字段
            Optional<Person> personOptional = personRepository.findByNameCustomeQuery("SnailClimb");
            assertTrue(personOptional.isPresent());
            assertEquals(Integer.valueOf(23), personOptional.get().getAge());
            // 查找部分字段
            String personName = personRepository.findPersonNameById(id);
            assertEquals("SnailClimb", personName);
            System.out.println(id);
            // 更新
            personRepository.updatePersonNameById("UpdatedName", id);
            Optional<Person> updatedName = personRepository.findByNameCustomeQuery("UpdatedName");
            assertTrue(updatedName.isPresent());
            // 清空数据库
            personRepository.deleteAll();
    }

}