package com.sywwifi.api.commons;

import lombok.Data;

/**
 * HTTP请求返回的最外层对象
 *
 * @author 魏来 create on 2017/7/21
 * @version 1.0.0
 */
@Data
public class ErrorInfo<T> {

    public static final int OK = 0;
    public static final int ERROR = 100;

    /**
     * 返回结果值
     */
    private int code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回信息
     */
    private String url;

    /**
     * 返回对象
     */
    private T data;

}
