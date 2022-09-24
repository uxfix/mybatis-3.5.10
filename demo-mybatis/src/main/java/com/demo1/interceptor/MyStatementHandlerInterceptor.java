package com.demo1.interceptor;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;

import java.sql.Statement;

/**
 * @author Yuan
 * @description MyStatementHandlerInterceptor
 * @date 2022/9/24
 */
@Intercepts({
        @Signature(
                type= StatementHandler.class,
                method = "query",
                args = {Statement.class, ResultHandler.class})
})
public class MyStatementHandlerInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("MyStatementHandlerInterceptor");
        return invocation.proceed();
    }
}
