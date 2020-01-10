package com.wuzhi.index.controller;

import com.wuzhi.index.bean.BackUser;
import com.wuzhi.index.bean.Tag;
import com.wuzhi.index.bean.User;
import com.wuzhi.index.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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

    @RequestMapping("/getAllRc")
    public List<User> getAllRc(@RequestBody Map<String, String> params) {
        return userService.getAllRc(params);
    }

    @RequestMapping("/updateIsuse")
    public Boolean updateIsuse(String is_use, String id) {
        return userService.updateIsuse(is_use, id);
    }

    @RequestMapping("/updateUserById")
    public Boolean updateUserById(@RequestBody Map<String, String> params) {
        return userService.updateUserById(params);
    }

    @RequestMapping("/deleteUserById")
    public Boolean deleteUserById(String id) {
        return userService.deleteUserById(id);
    }

    @RequestMapping("/getAllRcTag")
    public List<Tag> getAllRcTag(String type) {
        return userService.getAllRcTag(type);
    }

    @RequestMapping("/updateTag")
    public Boolean updateTag(@RequestBody Map<String, String> params) {
        return userService.updateTag(params);
    }

    @RequestMapping("/deleteTagById")
    public Boolean deleteTagById(String id) {
        return userService.deleteTagById(id);
    }

    @RequestMapping("/backLogin")
    public BackUser backLogin(String username, String password) {
        return userService.backLogin(username, password);
    }

    @RequestMapping("/getAllBackuser")
    public List<BackUser> getAllBackuser(@RequestBody Map<String, String> params) {
        return userService.getAllBackuser(params);
    }
}
