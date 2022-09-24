package com.demo1.interceptor;

import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;

import java.sql.PreparedStatement;

/**
 * @author Yuan
 * @description MyParameterHandlerInterceptor
 * @date 2022/9/24
 */
@Intercepts({
        @Signature(
                type= ParameterHandler.class,
                method = "setParameters",
                args = {PreparedStatement.class})
})
public class MyParameterHandlerInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("MyParameterHandlerInterceptor");
        return invocation.proceed();
    }
}
