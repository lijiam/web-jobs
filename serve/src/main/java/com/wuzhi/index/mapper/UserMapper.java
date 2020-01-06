package com.wuzhi.index.mapper;

import com.wuzhi.index.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    int register(@Param("user_type") String user_type, @Param("phone") String phone, @Param("password") String password);

    List<User> login(@Param("user_type") String user_type, @Param("phone") String phone, @Param("password") String password);
}
