package com.chiaki.mybatisgeneratordemo.domain;

import lombok.Data;

@Data
public class ClassInfo {
    /**  班级ID  **/
    private Integer classId;

    /**  班级名称  **/
    private String className;
}