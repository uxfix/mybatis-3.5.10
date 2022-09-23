/*
 *    Copyright 2009-2021 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.reflection.wrapper;

import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.property.PropertyTokenizer;

import java.util.List;

/**
 * @author Clinton Begin
 */
public interface ObjectWrapper {

  /**
   * 获取指定的属性
   * 如果封装的是普通的 Bean  对象，则调用对应的 get 方法
   * 如果封装的是集合对象，则返回对应下标的 value
   * 如果封装的是 Map 对象，则返回 key 对应的 value
   * @param prop
   * @return
   */
  Object get(PropertyTokenizer prop);

  /**
   * 设置指定的属性值
   * 如果封装的是普通的 Bean  对象，则调用对应的 set 方法
   * 如果封装的是集合对象，则设置对应下标的 value
   * 如果封装的是 Map 对象，则设置 key 对应的 value
   * @param prop
   * @param value
   */
  void set(PropertyTokenizer prop, Object value);

  /**
   * 查找属性表达式指定的属性
   * useCamelCaseMapping 表示是否忽略表达式中的下划线
   * @param name
   * @param useCamelCaseMapping
   * @return
   */
  String findProperty(String name, boolean useCamelCaseMapping);

  /**
   * 获取可读属性的名称集合
   * @return
   */
  String[] getGetterNames();

  /**
   * 获取可写属性的名称集合
   * @return
   */
  String[] getSetterNames();

  /**
   * 解析属性表达式指定的属性对应的 set 方法的参数类型
   * @param name
   * @return
   */
  Class<?> getSetterType(String name);

  /**
   * 解析属性表达式指定的属性对应的 get 方法的返回值
   * @param name
   * @return
   */
  Class<?> getGetterType(String name);

  /**
   * 判断属性表达式指定属性是否有set方法
   * @param name
   * @return
   */
  boolean hasSetter(String name);

  /**
   * 判断属性表达式指定属性是否有get方法
   * @param name
   * @return
   */
  boolean hasGetter(String name);

  /**
   * 为属性表达式指定的属性创建相应的 MetaObject 对象
   * @param name
   * @param prop
   * @param objectFactory
   * @return
   */
  MetaObject instantiatePropertyValue(String name, PropertyTokenizer prop, ObjectFactory objectFactory);

  /**
   * 判断封装对象是否是集合
   * @return
   */
  boolean isCollection();

  /**
   * 向集合中添加元素，调用 Collection.add 方法
   * @param element
   */
  void add(Object element);

  /**
   * 向集合中添加一批元素，调用 Collection.addAll 方法
   * @param element
   * @param <E>
   */
  <E> void addAll(List<E> element);

}
