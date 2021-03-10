package com.lizhizhao.db.SpringBootMyBatis.service.impl;

import com.lizhizhao.db.SpringBootMyBatis.bean.Student;
import com.lizhizhao.db.SpringBootMyBatis.service.BaseService;
import com.lizhizhao.db.SpringBootMyBatis.service.StudentService;
import org.springframework.stereotype.Repository;

@Repository("student")
public class StudentServiceImpl extends BaseService<Student> implements StudentService {
	
}