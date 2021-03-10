package com.lizhizhao.db.SpringBootMyBatis.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author lizhizhao
 * @since 2021-03-10 15:58
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}