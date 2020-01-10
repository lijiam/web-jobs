package com.wuzhi.index.service.impl;

import com.wuzhi.index.bean.BackUser;
import com.wuzhi.index.bean.Tag;
import com.wuzhi.index.bean.User;
import com.wuzhi.index.mapper.UserMapper;
import com.wuzhi.index.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


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
    public User login(String user_type, String phone, String password) {
        List<User> count = userMapper.login(user_type, phone, password);
        if (count.size() > 0) return count.get(0);
        return null;
    }

    @Override
    public List<User> getAllRc(Map<String, String> params) {
        return userMapper.getAllRc(params);
    }

    @Override
    public Boolean updateUserById(Map<String, String> params) {
        return userMapper.updateUserById(params) > 0;
    }

    @Override
    public Boolean updateIsuse(String is_use, String id) {
        return userMapper.updateIsuse(is_use, id) > 0;
    }

    @Override
    public Boolean deleteUserById(String id) {
        return userMapper.deleteUserById(id) > 0;
    }

    @Override
    public List<Tag> getAllRcTag(String type) {
        return userMapper.getAllRcTag(type);
    }

    @Override
    public Boolean updateTag(Map<String, String> params) {
        return userMapper.updateTag(params) > 0;
    }

    @Override
    public Boolean deleteTagById(String id) {
        return userMapper.deleteTagById(id) > 0;
    }

    @Override
    public BackUser backLogin(String username, String password) {
        BackUser backUser = userMapper.backLogin(username, password);
        if (backUser != null) {
            userMapper.updateBackLoginTime(backUser.getId());
            return backUser;
        }
        return null;
    }

    @Override
    public List<BackUser> getAllBackuser(Map<String, String> params) {
        return userMapper.getAllBackuser(params);
    }

    @Override
    public Boolean updateBackuserById(Map<String, String> params) {
        return userMapper.updateBackuserById(params) > 0;
    }

    @Override
    public Boolean updateBackIsuse(String is_use, String id) {
        return userMapper.updateBackIsuse(is_use, id) > 0;
    }

    @Override
    public Boolean deleteBackuserById(String id) {
        return userMapper.deleteBackuserById(id) > 0;
    }

    @Override
    public Boolean addBackuser(Map<String, String> params) {
        List<BackUser> list = userMapper.checkBackuser(params.get("username"));
        if (list.size() > 0) return false;
        return userMapper.addBackuser(params) > 0;
    }

}
