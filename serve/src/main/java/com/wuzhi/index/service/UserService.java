package com.wuzhi.index.service;

public interface UserService {

    Boolean register(String user_type, String phone, String password);

    Boolean login(String user_type, String phone, String password);

    String getCode();
}
