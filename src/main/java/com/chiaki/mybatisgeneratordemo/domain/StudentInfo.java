package com.chiaki.mybatisgeneratordemo.domain;

import lombok.Data;

@Data
public class StudentInfo {
    /**  学生ID  **/
    private Integer id;

    /**  姓名  **/
    private String name;

    /**  性别  **/
    private String sex;
}