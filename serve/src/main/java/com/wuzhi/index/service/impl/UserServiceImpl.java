package com.wuzhi.index.service.impl;

import com.wuzhi.index.bean.User;
import com.wuzhi.index.mapper.UserMapper;
import com.wuzhi.index.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean register(String user_type, String phone, String password) {
        int count = userMapper.register(user_type, phone, password);
        return count > 0;
    }

    @Override
    public String getCode() {
        String verifyCode = String.valueOf((int) (Math.random() * 900000 + 100000));
        System.out.println(verifyCode);
        return verifyCode;
    }

    @Override
    public Boolean login(String user_type, String phone, String password) {
        List<User> count = userMapper.login(user_type, phone, password);
        return count.size() > 0;
    }

}
