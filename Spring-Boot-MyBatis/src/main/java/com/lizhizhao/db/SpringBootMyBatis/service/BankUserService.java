package com.lizhizhao.db.SpringBootMyBatis.service;

import com.lizhizhao.db.SpringBootMyBatis.bean.BankUser;
import com.lizhizhao.db.SpringBootMyBatis.mapper.BankUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

public interface BankUserService {

    /**
     * 根据名字查找用户
     */
    BankUser selectBankUserByName(String name);

    /**
     * 查找所有用户
     */
    List<BankUser> selectAllBankUser();

    /**
     * 插入两个用户
     */
    void insertService();

    /**
     * 根据id 删除用户
     */

    void deleteService(int id);

    void changemoney();

}