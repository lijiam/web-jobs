package com.wuzhi.index.service;

import com.wuzhi.index.bean.User;

public interface UserService {

    Boolean register(String user_type, String phone, String password);

    User login(String user_type, String phone, String password);

    String getCode();
}
