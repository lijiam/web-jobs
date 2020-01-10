package com.wuzhi.index.service;

import com.wuzhi.index.bean.BackUser;
import com.wuzhi.index.bean.Tag;
import com.wuzhi.index.bean.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    Boolean register(String user_type, String phone, String password);

    User login(String user_type, String phone, String password);

    String getCode();

    List<User> getAllRc(Map<String, String> params);

    Boolean updateUserById(Map<String, String> params);

    Boolean updateIsuse(String is_use, String id);

    Boolean deleteUserById(String id);

    List<Tag> getAllRcTag(String type);

    Boolean updateTag(Map<String, String> params);

    Boolean deleteTagById(String id);

    BackUser backLogin(String username, String password);

    List<BackUser> getAllBackuser(Map<String, String> params);
}
