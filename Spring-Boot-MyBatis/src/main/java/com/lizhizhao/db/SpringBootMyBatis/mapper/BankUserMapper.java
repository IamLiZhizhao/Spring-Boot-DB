package com.lizhizhao.db.SpringBootMyBatis.mapper;

import com.lizhizhao.db.SpringBootMyBatis.bean.BankUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@Mapper
public interface BankUserMapper {

    /**
     * 通过名字查询用户信息
     */
    BankUser findBankUserByName(@Param("name") String name);

    /**
     * 查询所有用户信息
     */
    @Select("SELECT * FROM bank_user")
    List<BankUser> findAllBankUser();

    /**
     * 插入用户信息
     */
    @Insert("INSERT INTO bank_user(name, age,money) VALUES(#{name}, #{age}, #{money})")
    void insertBankUser(@Param("name") String name, @Param("age") Integer age, @Param("money") BigDecimal money);

    /**
     * 根据 id 更新用户信息
     */
    @Update("UPDATE  bank_user SET name = #{name},age = #{age},money= #{money} WHERE id = #{id}")
    void updateBankUser(@Param("name") String name, @Param("age") Integer age, @Param("money") BigDecimal money,
                    @Param("id") int id);

    /**
     * 根据 id 删除用户信息
     */
    @Delete("DELETE from bank_user WHERE id = #{id}")
    void deleteBankUser(@Param("id") int id);
}