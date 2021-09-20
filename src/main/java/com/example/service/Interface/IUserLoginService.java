package com.example.service.Interface;

import com.example.POJO.User;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/20 2:08 下午
 */
public interface IUserLoginService {
    /**
     * 注册User
     * @param user POJO
     * @return 1 success 2 fail
     */
    int addUser(User user);

    /**
     * 根据用户名查找用户
     * @param username 用户名
     * @return User POJO
     */
    User findUserByUsername(String username);
}
