package com.lizhizhao.db.SpringBootMyBatis.service;

import com.lizhizhao.db.SpringBootMyBatis.bean.BankUser;
import com.lizhizhao.db.SpringBootMyBatis.dao.BankUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BankUserService {

    @Autowired
    private BankUserDao bankUserDao;

    /**
     * 根据名字查找用户
     */
    public BankUser selectBankUserByName(String name) {
        return bankUserDao.findBankUserByName(name);
    }

    /**
     * 查找所有用户
     */
    public List<BankUser> selectAllBankUser() {
        return bankUserDao.findAllBankUser();
    }

    /**
     * 插入两个用户
     */
    public void insertService() {
        bankUserDao.insertBankUser("SnailClimb", 22, new BigDecimal("3000.0"));
        bankUserDao.insertBankUser("Daisy", 19, new BigDecimal("3000.0"));
    }

    /**
     * 根据id 删除用户
     */

    public void deleteService(int id) {
        bankUserDao.deleteBankUser(id);
    }

    /**
     * 模拟事务。由于加上了 @Transactional注解，如果转账中途出了意外 SnailClimb 和 Daisy 的钱都不会改变。
     */
    @Transactional
    public void changemoney() {
        bankUserDao.updateBankUser("SnailClimb", 22, new BigDecimal("2000.0"), 3);
        // 模拟转账过程中可能遇到的意外状况
        int temp = 1 / 0;
        bankUserDao.updateBankUser("Daisy", 19, new BigDecimal("4000.0"), 4);
    }
}