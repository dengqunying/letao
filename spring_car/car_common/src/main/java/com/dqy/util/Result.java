package com.dqy.util;

/**
 * @Deacription TODO
 * @Author 慕斯
 * @Date 2021/1/16 10:52
 * @Version 1.0
 **/
public class Result<T> {
    private Integer code;
    private String message;
    private T data;
    public static Result response(DataRespon dataRespon){
        return new Result(dataRespon.getIndex(), dataRespon.getName());
    }

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }
}
