package com.chiaki.mybatisgeneratordemo;

import com.chiaki.mybatisgeneratordemo.domain.ClassInfo;
import com.chiaki.mybatisgeneratordemo.domain.ClassInfoCriteria;
import com.chiaki.mybatisgeneratordemo.domain.StudentInfo;
import com.chiaki.mybatisgeneratordemo.domain.StudentInfoCriteria;
import com.chiaki.mybatisgeneratordemo.mapper.ClassInfoMapper;
import com.chiaki.mybatisgeneratordemo.mapper.StudentInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class testQuery {

    // mapper注入
    @Resource
    StudentInfoMapper studentInfoMapper;
    @Resource
    ClassInfoMapper classInfoMapper;

    @Test
    public void testQueryStudentInfo() {
        // 测试根据主键查找学生信息
        StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(2);
        System.out.println(studentInfo);
    }

    @Test
    public void testQueryStudentInfoByConditions() {
        // 增强查询
        StudentInfoCriteria studentInfoCriteria = new StudentInfoCriteria();
        // 条件组合
        studentInfoCriteria.createCriteria()
                // id字段在{1, 3, 4}当中
                .andIdIn(Arrays.asList(1, 3, 4))
                // sex = "男"
                .andSexEqualTo("男");
        // 得到查询结果列表
        List<StudentInfo> studentInfos = studentInfoMapper.selectByExample(studentInfoCriteria);
        System.out.println(studentInfos);
        ClassInfoCriteria classInfoCriteria = new ClassInfoCriteria();
        // 查询条件：class_id = 202101
        classInfoCriteria.createCriteria().andClassIdEqualTo(202101);
        // 得到查询结果
        List<ClassInfo> classInfos = classInfoMapper.selectByExample(classInfoCriteria);
        System.out.println(classInfos);
    }
}
