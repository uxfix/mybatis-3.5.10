package com.demo1.interceptor;

import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;

import java.sql.Statement;

/**
 * @author Yuan
 * @description MyResultSetHandlerInterceptor
 * @date 2022/9/24
 */
@Intercepts({
        @Signature(
                type= ResultSetHandler.class,
                method = "handleResultSets",
                args = {Statement.class})
})
public class MyResultSetHandlerInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("MyResultSetHandlerInterceptor");
        return invocation.proceed();
    }
}
