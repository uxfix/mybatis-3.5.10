package com.demo2;

import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaClass;

/**
 * @author Yuan
 * @description ReflectorFactoryDemo
 * @date 2022/9/23
 */
public class ReflectorFactoryDemo {
    public static void main(String[] args) {
        MetaClass metaConfig = MetaClass.forClass(Person.class, new DefaultReflectorFactory());
        if (!metaConfig.hasSetter("name22")) {
            System.out.println("不存在该属性");
        }else {
            System.out.println("存在该属性");
        }
    }
}
