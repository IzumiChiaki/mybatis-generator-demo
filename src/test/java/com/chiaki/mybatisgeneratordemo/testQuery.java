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

    @Resource
    StudentInfoMapper studentInfoMapper;
    @Resource
    ClassInfoMapper classInfoMapper;

    @Test
    public void testQueryStudentInfo() {
        StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(2);
        System.out.println(studentInfo);
    }

    @Test
    public void testQueryStudentInfoByConditions() {
        StudentInfoCriteria studentInfoCriteria = new StudentInfoCriteria();
        studentInfoCriteria.createCriteria().andIdIn(Arrays.asList(1, 2, 4));
        List<StudentInfo> studentInfos = studentInfoMapper.selectByExample(studentInfoCriteria);
        System.out.println(studentInfos);
        ClassInfoCriteria classInfoCriteria = new ClassInfoCriteria();
        classInfoCriteria.createCriteria().andClassIdEqualTo(202101);
        List<ClassInfo> classInfos = classInfoMapper.selectByExample(classInfoCriteria);
        System.out.println(classInfos);
    }
}
