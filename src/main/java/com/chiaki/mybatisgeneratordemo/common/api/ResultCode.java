package com.chiaki.mybatisgeneratordemo.common.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author chenliang258
 * @date 2021/3/24 14:35
 */
@Getter
@AllArgsConstructor
public enum ResultCode {
    /**
     * 未知错误
     */
    UNKNOWN_ERROR("-4", "未知错误"),
    /**
     * 系统错误
     */
    SYSTEM_ERROR("-3", "系统错误"),
    /**
     * 处理警告，针对允许成功失败同时存在的处理（如批处理）
     */
    WARNING("-2", "警告"),
    /**
     * 处理失败
     */
    FAILURE("-1", "失败"),
    /**
     * 处理成功
     */
    SUCCESS("0", "成功"),
    /**
     * 参数错误
     */
    PARAM_ERROR("1", "参数错误"),
    /**
     * 无此操作权限
     */
    NO_PERMISSION("2", "无操作权限"),
    /**
     * 数据为空
     */
    DATA_NULL("3", "数据为空"),
    /**
     * 服务端异常
     */
    SERVICE_ERROR("4", "服务异常"),
    /**
     * 自定义异常
     */
    BUSINESS_ERROR("5", "业务异常");

    private final String code;

    private final String msg;
}
