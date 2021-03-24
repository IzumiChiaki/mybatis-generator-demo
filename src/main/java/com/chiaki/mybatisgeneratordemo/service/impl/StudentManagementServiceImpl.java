package com.chiaki.mybatisgeneratordemo.service.impl;

import com.chiaki.mybatisgeneratordemo.common.api.ResultCode;
import com.chiaki.mybatisgeneratordemo.common.api.ResultResponse;
import com.chiaki.mybatisgeneratordemo.common.entity.IdName;
import com.chiaki.mybatisgeneratordemo.domain.StudentInfo;
import com.chiaki.mybatisgeneratordemo.domain.StudentInfoCriteria;
import com.chiaki.mybatisgeneratordemo.mapper.StudentInfoMapper;
import com.chiaki.mybatisgeneratordemo.service.StudentManagementService;
import com.chiaki.mybatisgeneratordemo.common.utils.Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chenliang258
 * @date 2021/3/24 15:04
 */
@Slf4j
@Service("studentManagementService")
@Transactional(rollbackFor = Exception.class)
@SuppressWarnings({"unchecked", "rawtypes"})
public class StudentManagementServiceImpl implements StudentManagementService {

    @Resource
    StudentInfoMapper studentInfoMapper;

    @Override
    public ResultResponse<List<IdName>> getBasicStudentInfoList() {
        StudentInfoCriteria studentInfoCriteria = new StudentInfoCriteria();
        studentInfoCriteria.createCriteria();
        List<IdName> idNameList = studentInfoMapper.selectByExample(studentInfoCriteria).stream()
                .map(studentInfo -> {
                    IdName idName = new IdName();
                    idName.setId(studentInfo.getId());
                    idName.setName(studentInfo.getName());
                    return idName;
                }).collect(Collectors.toList());
        return ResultResponse.buildSuccess(idNameList, idNameList.size());
    }

    @Override
    public ResultResponse<List<StudentInfo>> getDetailedStudentInfoList(Integer pageNum, Integer pageSize) {
        StudentInfoCriteria studentInfoCriteria = new StudentInfoCriteria();
        studentInfoCriteria.createCriteria();
        List<StudentInfo> studentInfos = studentInfoMapper.selectByExample(studentInfoCriteria);
        List<StudentInfo> pageData = Utils.pageRequest(pageNum, pageSize, studentInfos);
        return ResultResponse.buildSuccess(pageData, studentInfos.size());
    }

    @Override
    public ResultResponse deleteStudentById(Integer id) {
        if (id == null) {
            return ResultResponse.buildError(ResultCode.PARAM_ERROR);
        }
        StudentInfoCriteria studentInfoCriteria = new StudentInfoCriteria();
        studentInfoCriteria.createCriteria().andIdEqualTo(id);
        StudentInfo studentInfo = studentInfoMapper.selectOneByExample(studentInfoCriteria);
        if (studentInfo == null) {
            String errMsg = "当前id下不存在记录或该记录已被删除";
            log.error(errMsg);
            return ResultResponse.buildError(errMsg);
        }
        studentInfoMapper.deleteByExample(studentInfoCriteria);
        return ResultResponse.buildSuccess();
    }
}
