package com.demo1.reflector;

import org.apache.ibatis.reflection.Reflector;
import org.apache.ibatis.reflection.ReflectorFactory;

/**
 * @author Yuan
 * @description ExampleReflectorFactory
 * @date 2022/9/22
 */
public class ExampleReflectorFactory implements ReflectorFactory {
    @Override
    public boolean isClassCacheEnabled() {
        return false;
    }

    @Override
    public void setClassCacheEnabled(boolean classCacheEnabled) {

    }

    @Override
    public Reflector findForClass(Class<?> type) {
        return null;
    }
}
