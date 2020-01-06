package com.wuzhi.index.controller;

import com.wuzhi.index.bean.User;
import com.wuzhi.index.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/register")
    public Boolean register(String user_type, String phone, String password) {
        return userService.register(user_type, phone, password);
    }

    @RequestMapping("/getCode")
    public String getCode() {
        return userService.getCode();
    }

    @RequestMapping("/login")
    public User login(String user_type, String phone, String password) {
        return userService.login(user_type, phone, password);
    }
}
