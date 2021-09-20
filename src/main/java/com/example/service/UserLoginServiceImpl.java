package com.example.service;

import com.example.DAO.UserLoginMapper;
import com.example.POJO.User;
import com.example.service.Interface.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/20 2:11 下午
 */
@Service
public class UserLoginServiceImpl implements IUserLoginService {

    @Autowired
    private UserLoginMapper userLoginMapper;

    @Override
    public int addUser(User user) {
        return userLoginMapper.addUser(user);
    }

    @Override
    public User findUserByUsername(String username) {
        return userLoginMapper.selectUserByUsername(username);
    }
}
