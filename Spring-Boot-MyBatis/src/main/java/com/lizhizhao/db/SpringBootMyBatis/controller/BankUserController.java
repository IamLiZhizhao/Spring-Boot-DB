package com.lizhizhao.db.SpringBootMyBatis.controller;

import com.lizhizhao.db.SpringBootMyBatis.bean.BankUser;
import com.lizhizhao.db.SpringBootMyBatis.service.BankUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bankUser")
public class BankUserController {

    @Autowired
    private BankUserService bankUserService;

    @RequestMapping("/query")
    public BankUser testQuery() {
        return bankUserService.selectBankUserByName("Daisy");
    }

    @RequestMapping("/insert")
    public List<BankUser> testInsert() {
        bankUserService.insertService();
        return bankUserService.selectAllBankUser();
    }


    @RequestMapping("/changemoney")
    public List<BankUser> testchangemoney() {
        bankUserService.changemoney();
        return bankUserService.selectAllBankUser();
    }

    @RequestMapping("/delete")
    public String testDelete() {
        bankUserService.deleteService(3);
        return "OK";
    }

}