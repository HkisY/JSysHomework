package com.example.controller;

import com.example.POJO.User;
import com.example.service.UserLoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/20 2:16 下午
 */
@Controller
@RequestMapping("/welcome")
public class UserLoginController {
    @Autowired
    private UserLoginServiceImpl userLoginService;

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,@RequestParam("password") String password){
        User user = userLoginService.findUserByUsername(username);
        if(user == null)
        {
            return "Welcome";
        }
        if (user.getPassword().equals(password)){
            return "redirect:/course/allCourse";
        }
        return null;
    }
    @RequestMapping("registerPage")
    public String jumpRegister(){
        return "register";
    }
    @RequestMapping("cancel")
    public String jumpLogin(){
        return "Welcome";
    }
    @RequestMapping("/register")
    public String register(String username,String password,String nickname){
        User user = new User();
        user.setNickname(nickname);
        user.setUsername(username);
        user.setPassword(password);
        int flag = userLoginService.addUser(user);
        if (flag == 1){
            return "allCourse";
        }else {
            return "register";
        }
    }

    @RequestMapping("/test")
    public String cancel(){
        return "index";
    }
}
