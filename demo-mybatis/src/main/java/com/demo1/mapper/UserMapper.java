package com.demo1.mapper;

import com.demo1.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Yuan
 * @description UserMapper
 * @date 2022/9/22
 */
public interface UserMapper {

    List<User> select1(@Param("myName") String name, Integer age, @Param("myMileNo") String mobileNo);

    List<User> select2(User user);

    List<User> select3(User user);

    List<User> select4(User user);

    List<User> update1(User user);

    @Select(value = "select * from user")
    @Select(databaseId = "mysql", value = "select * from user")
    List<User> get1(User user);
}
