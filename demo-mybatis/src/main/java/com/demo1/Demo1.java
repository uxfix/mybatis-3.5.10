package com.demo1;

import com.demo1.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Yuan
 * @description Demo1
 * @date 2022/9/22
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        Properties demoProperties = Resources.getResourceAsProperties("demo.properties");
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(inputStream,"sit",demoProperties);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.insert("Mybatis");
        System.out.println(userMapper.getAll());
        sqlSession.commit();
        sqlSession.close();
    }
}
