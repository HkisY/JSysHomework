package com.example.DAO;

import com.example.POJO.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/20 1:39 下午
 */
@Component
public interface UserLoginMapper {
    /**
     * 根据用户名搜索用户
     * @param username 用户名
     * @return User POJO
     */
    User selectUserByUsername(String username);

    /**
     * 注册新用户
     * @param user 用户
     * @return 1 success 2 fail
     */
    int addUser(User user);
}
