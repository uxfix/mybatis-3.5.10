package com.demo1.mapper;

import com.demo1.model.User;

import java.util.List;

/**
 * @author Yuan
 * @description UserMapper
 * @date 2022/9/22
 */
public interface UserMapper {

    List<User> select1(User user);

    List<User> select2(User user);

    List<User> select3(User user);

    List<User> select4(User user);

    List<User> update1(User user);
}
