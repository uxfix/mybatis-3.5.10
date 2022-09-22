package com.demo1;

import com.demo1.mapper.UserMapper;
import com.demo1.model.User;
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

    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            Properties demoProperties = Resources.getResourceAsProperties("demo.properties");
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder()
                    .build(inputStream,"sit",demoProperties);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException {
        selectAll();

    }

    public static void selectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.selectAllXml(new User()));
        sqlSession.close();
    }
}
