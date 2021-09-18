package com.example.DAO;

import com.example.POJO.MybatisTest;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 9:48 上午
 */
@Mapper
public interface TestMapper {
    MybatisTest selectTest (Integer id);
}
