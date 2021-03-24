package com.chiaki.mybatisgeneratordemo.common.api;

import lombok.*;

import java.io.Serializable;

/**
 * @author chenliang258
 * @date 2021/3/24 14:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@SuppressWarnings({"unchecked","rawtypes"})
public class ResultResponse<T> implements Serializable {

    private static final long serialVersionUID = 6767924484386859346L;

    private Boolean success;

    private String code;

    private String message;

    private T data;

    private Integer total;

    public static ResultResponse buildSuccess() {
        return buildSuccess(null, null);
    }

    public static ResultResponse buildSuccess(Object data){
        return buildSuccess(data,null);
    }

    public static ResultResponse buildSuccess(Object data, Integer total){
        ResultResponse resultResponse = new ResultResponse<>();
        resultResponse.setSuccess(true);
        resultResponse.setCode(ResultCode.SUCCESS.getCode());
        resultResponse.setMessage(ResultCode.SUCCESS.getMsg());
        resultResponse.setData(data);
        resultResponse.setTotal(total);
        return resultResponse;
    }

    public static ResultResponse buildError(String message){
        return buildError(ResultCode.BUSINESS_ERROR.getCode(), message);
    }

    public static ResultResponse buildError(ResultCode resultCode){
        return buildError(resultCode.getCode(), resultCode.getMsg());
    }

    public static ResultResponse buildError(String code,String message){
        ResultResponse dataResponse = new ResultResponse();
        dataResponse.setSuccess(false);
        dataResponse.setCode(code);
        dataResponse.setMessage(message);
        return dataResponse;
    }
}
