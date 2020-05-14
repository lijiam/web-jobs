package com.wuzhi.index.mapper;

import com.wuzhi.index.bean.BackUser;
import com.wuzhi.index.bean.Tag;
import com.wuzhi.index.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    int register(@Param("user_type") String user_type, @Param("phone") String phone, @Param("password") String password);

    List<User> login(@Param("user_type") String user_type, @Param("phone") String phone, @Param("password") String password);

    List<User> getAllRc(Map<String, String> params);

    int updateUserById(Map<String, String> params);

    int updateIsuse(@Param("is_use") String is_use, @Param("id") String id);

    int deleteUserById(@Param("id") String id);

    List<Tag> getAllRcTag(@Param("type") String type);

    int updateTag(Map<String, String> params);

    int deleteTagById(@Param("id") String id);

    BackUser backLogin(@Param("username") String username, @Param("password") String password);

    int updateBackLoginTime(@Param("id") String id);

    List<BackUser> getAllBackuser(Map<String, String> params);

    int updateBackuserById(Map<String, String> params);

    int updateBackIsuse(@Param("is_use") String is_use, @Param("id") String id);

    int deleteBackuserById(@Param("id") String id);

    List<BackUser> checkBackuser(@Param("username") String username);

    int addBackuser(Map<String, String> params);

    int updatePassword(Map<String, String> params);

    int updateUsernameById(@Param("id") String id, @Param("name") String name);
}
