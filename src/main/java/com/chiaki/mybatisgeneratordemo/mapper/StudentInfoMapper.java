package com.chiaki.mybatisgeneratordemo.mapper;

import com.chiaki.mybatisgeneratordemo.domain.StudentInfo;
import com.chiaki.mybatisgeneratordemo.domain.StudentInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentInfoMapper {
    long countByExample(StudentInfoCriteria example);

    int deleteByExample(StudentInfoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectOneByExample(StudentInfoCriteria example);

    List<StudentInfo> selectByExample(StudentInfoCriteria example);

    StudentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentInfo record, @Param("example") StudentInfoCriteria example);

    int updateByExample(@Param("record") StudentInfo record, @Param("example") StudentInfoCriteria example);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}