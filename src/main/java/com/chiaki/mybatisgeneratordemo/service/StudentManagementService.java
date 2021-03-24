package com.chiaki.mybatisgeneratordemo.service;

import com.chiaki.mybatisgeneratordemo.common.api.ResultResponse;
import com.chiaki.mybatisgeneratordemo.common.entity.IdName;
import com.chiaki.mybatisgeneratordemo.domain.StudentInfo;

import java.util.List;

/**
 * @author chenliang258
 * @date 2021/3/24 14:29
 */
@SuppressWarnings("rawtypes")
public interface StudentManagementService {

    /**
     * 获取学生基本信息列表
     * @return ResultResponse<List<IdName>>
     */
    ResultResponse<List<IdName>> getBasicStudentInfoList();

    /**
     * 分页查询学生详细信息列表
     * @param pageNum 页码
     * @param pageSize 每页记录数
     * @return ResultResponse<List<StudentInfo>>
     */
    ResultResponse<List<StudentInfo>> getDetailedStudentInfoList(Integer pageNum, Integer pageSize);

    /**
     * 根据id删除学生信息
     * @param id 学生id
     * @return ResultResponse
     */
    ResultResponse deleteStudentById(Integer id);
}
