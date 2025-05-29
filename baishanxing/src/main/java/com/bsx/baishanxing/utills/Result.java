package com.bsx.baishanxing.utills;

public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // 成功，仅返回消息
    public static Result success(String msg) {
        return new Result(200, msg, null);
    }

    // 成功，返回数据 + 消息
    public static Result success(String msg, Object data) {
        return new Result(200, msg, data);
    }

    // 成功，只返回数据
    public static Result success(Object data) {
        return new Result(200, "操作成功", data);
    }

    // 失败，返回状态码
    public static Result fail(Integer code) {
        return new Result(code, "fail!", null);
    }

    // 失败，返回状态码和消息
    public static Result fail(Integer code, String msg) {
        return new Result(code, msg, null);
    }

    // Getter 和 Setter 方法
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}