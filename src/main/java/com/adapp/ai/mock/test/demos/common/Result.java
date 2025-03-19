package com.adapp.ai.mock.test.demos.common;

import com.dbapp.ai.mock.annotation.AIMock;
import com.dbapp.ai.mock.enums.ErrorEnum;
import lombok.Data;

@Data
public class Result<T> {
    @AIMock(description = "状态码，失败时返回-1，成功时返回200")
    private Integer code;
    @AIMock(description = "错误信息，失败时返回错误信息，成功时返回success")
    private String message;
    @AIMock(description = "业务数据")
    private T data;

    public Result() {

    }

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Result SUCCESS(T data) {
        return new Result(200, "success", data);
    }

    public static Result SUCCESS() {
        return new Result(200, "success", null);
    }

    public static Result FAILURE(ErrorEnum errorEnum) {
        return new Result(errorEnum.getErrCode(), errorEnum.getErrMsg(), null);
    }

    public static Result FAILURE(Integer code, String message) {
        return new Result(code, message, null);
    }

    public static Result FAILURE(String message) {
        return new Result(-1, message, null);
    }
}