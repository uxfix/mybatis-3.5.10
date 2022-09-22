package com.demo1.type;


import com.demo1.model.User2;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Yuan
 * @description ExampleTypeHandler
 * @date 2022/9/22
 */
public class ExampleTypeHandler extends BaseTypeHandler<User2> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, User2 parameter, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public User2 getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return null;
    }

    @Override
    public User2 getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public User2 getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
