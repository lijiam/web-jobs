package com.wuzhi.index.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user/new")
    public String addUser(){
        return "获取成功！";
    }
}
