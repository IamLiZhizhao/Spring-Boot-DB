package com.lizhizhao.db.SpringBootMyBatis;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lizhizhao.db.SpringBootMyBatis.bean.Student;
import com.lizhizhao.db.SpringBootMyBatis.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMyBatisApplicationTests {

    @Autowired
    private StudentService studentService;

    @Test
    public void test() throws Exception {
        Random r = new Random(1);
        Student student = new Student();
        student.setSsex("W");
        student.setSname("Daisy");
        student.setSno(r.nextInt(100));
        student.setScore(new BigDecimal(68));
        this.studentService.save(student);
    }

    @Test
    public void testExample() {
        Example example = new Example(Student.class);
        example.createCriteria().andCondition("sname like '%i%'");
        example.setOrderByClause("sno desc");
        List<Student> userList = this.studentService.selectByExample(example);
        System.out.println("Student sname 包含 i：");
        for (Student student : userList) {
            System.out.println(student.getSname());
        }

        System.out.println("Student List列表：");
        List<Student> all = this.studentService.selectAll();
        for (Student u : all) {
            System.out.println(u.getSname());
        }

        Student student = new Student();
        student.setSno(66);
        student = this.studentService.selectByKey(student);
        if (student.getSname() != null) {
            System.out.println(student.getSname());
        }

    }

    @Test
    public void testDelete() {
        Student student = new Student();
        student.setSno(66);
        this.studentService.delete(student);
    }

    @Test
    public void testPage() {
        PageHelper.startPage(2, 2);
        List<Student> list = studentService.selectAll();
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        List<Student> result = pageInfo.getList();
        for (Student u : result) {
            System.out.println(u.getSname());
        }
    }

    @Test
    public void contextLoads() {
        System.out.println("hello");
    }



}
