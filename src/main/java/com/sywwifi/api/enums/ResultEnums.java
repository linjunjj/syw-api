package com.sywwifi.api.enums;

/**
 * 返回结果枚举
 *
 * @author 魏来 create on 2017/7/22
 * @version 1.0.0
 */
public enum ResultEnums {

    SUCCESS(0, "成功"),
    ERROR(-1, "错误"),
    ERROR_UN_KNOW(-1, "未知错误"),
    DATA_NOT_UNICODE(11, "数据不唯一"),
    IS_EXIST(12, "已存在"),
    USERNAME_OR_PASSWORD_ERROR(13, "用户名或密码错误"),
    USER_UPDATE_FAULT(-21, "用户更新失败"),
    USER_IS_NOT_EXIST(22, "用户不存在"),
    USER_IS_EXIST(23, "用户已存在"),
    NOT_SUFFICIENT_FUNDS(16, "用户余额不足"),
    SQL_QUERY_ERROR(-2, "查询失败"), INSERT_FAULT(-3, "插入失败");

    private Integer code;
    private String msg;

    ResultEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
