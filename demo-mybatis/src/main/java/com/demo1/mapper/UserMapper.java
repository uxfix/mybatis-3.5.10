package com.demo1.mapper;

import com.demo1.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Yuan
 * @description UserMapper
 * @date 2022/9/22
 */
public interface UserMapper {

    @Insert("insert into user (name) values (#{name})")
    void insert(@Param("name") String name);

    @Select("select * from user")
    List<User> getAll();

    List<User> selectAllXml(User user);
}
