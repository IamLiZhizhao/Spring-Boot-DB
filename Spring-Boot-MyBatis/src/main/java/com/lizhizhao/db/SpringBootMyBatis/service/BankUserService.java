package com.lizhizhao.db.SpringBootMyBatis.service;

import com.lizhizhao.db.SpringBootMyBatis.bean.BankUser;
import com.lizhizhao.db.SpringBootMyBatis.mapper.BankUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BankUserService {

    @Autowired
    private BankUserMapper bankUserMapper;

    /**
     * 根据名字查找用户
     */
    public BankUser selectBankUserByName(String name) {
        return bankUserMapper.findBankUserByName(name);
    }

    /**
     * 查找所有用户
     */
    public List<BankUser> selectAllBankUser() {
        return bankUserMapper.findAllBankUser();
    }

    /**
     * 插入两个用户
     */
    public void insertService() {
        bankUserMapper.insertBankUser("SnailClimb", 22, new BigDecimal("3000.0"));
        bankUserMapper.insertBankUser("Daisy", 19, new BigDecimal("3000.0"));
    }

    /**
     * 根据id 删除用户
     */

    public void deleteService(int id) {
        bankUserMapper.deleteBankUser(id);
    }

    /**
     * 模拟事务。由于加上了 @Transactional注解，如果转账中途出了意外 SnailClimb 和 Daisy 的钱都不会改变。
     */
    @Transactional
    public void changemoney() {
        bankUserMapper.updateBankUser("SnailClimb", 22, new BigDecimal("2000.0"), 3);
        // 模拟转账过程中可能遇到的意外状况
        int temp = 1 / 0;
        bankUserMapper.updateBankUser("Daisy", 19, new BigDecimal("4000.0"), 4);
    }
}