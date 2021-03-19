package com.chiaki.mybatisgeneratordemo.mapper;

import com.chiaki.mybatisgeneratordemo.domain.ClassInfo;
import com.chiaki.mybatisgeneratordemo.domain.ClassInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassInfoMapper {
    long countByExample(ClassInfoCriteria example);

    int deleteByExample(ClassInfoCriteria example);

    int deleteByPrimaryKey(Integer classId);

    int insert(ClassInfo record);

    int insertSelective(ClassInfo record);

    ClassInfo selectOneByExample(ClassInfoCriteria example);

    List<ClassInfo> selectByExample(ClassInfoCriteria example);

    ClassInfo selectByPrimaryKey(Integer classId);

    int updateByExampleSelective(@Param("record") ClassInfo record, @Param("example") ClassInfoCriteria example);

    int updateByExample(@Param("record") ClassInfo record, @Param("example") ClassInfoCriteria example);

    int updateByPrimaryKeySelective(ClassInfo record);

    int updateByPrimaryKey(ClassInfo record);
}