package com.chiaki.mybatisgeneratordemo.controller;

import com.chiaki.mybatisgeneratordemo.common.api.ResultResponse;
import com.chiaki.mybatisgeneratordemo.common.entity.IdName;
import com.chiaki.mybatisgeneratordemo.domain.StudentInfo;
import com.chiaki.mybatisgeneratordemo.service.StudentManagementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenliang258
 * @date 2021/3/24 15:27
 */
@Api(tags = "学生管理")
@RestController
@Slf4j
@SuppressWarnings("rawtypes")
@RequestMapping("api/studentManage")
public class StudentManagementController {

    @Resource
    StudentManagementService studentManagementService;

    @ApiOperation("获取学生基本信息列表")
    @GetMapping("/getBasicStudentInfoList")
    public ResultResponse<List<IdName>> getBasicStudentInfoList() {
        return studentManagementService.getBasicStudentInfoList();
    }

    @ApiOperation("获取学生详细信息列表")
    @GetMapping("/getDetailedStudentInfoList")
    public ResultResponse<List<StudentInfo>> getDetailedStudentInfoList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                        @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        return studentManagementService.getDetailedStudentInfoList(pageNum, pageSize);
    }

    @ApiOperation("根据ID删除学生记录")
    @GetMapping("/deleteStudentById")
    public ResultResponse deleteStudentById(@RequestParam("id") Integer id) {
        return studentManagementService.deleteStudentById(id);
    }
}
