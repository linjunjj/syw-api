package com.sywwifi.api.commons;

import com.sywwifi.api.pojo.App;
import lombok.Data;

/**
 * HTTP请求返回的最外层对象
 *
 * @author 魏来 create on 2017/7/21
 * @version 1.0.0
 */
@Data
public class ResponseInfo<T> extends App {

    /**
     * 返回结果值
     */
    private int code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回对象
     */
    private T data;

}
