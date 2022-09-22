package com.demo1.model;

import lombok.Data;

import java.util.Date;

/**
 * @author Yuan
 * @description User
 * @date 2022/9/22
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String mobileNo;
    private Boolean gender;
    private Date createTime;
}
