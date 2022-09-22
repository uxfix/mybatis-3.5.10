package com.demo1.model;

import lombok.Data;

import java.util.Date;

/**
 * @author Yuan
 * @description User
 * @date 2022/9/22
 */
@Data
public class User2 {
    private Long id;
    private String name;
    private Integer age;
    private String mobileNo;
    private String gender;
    private Date createTime;
}
