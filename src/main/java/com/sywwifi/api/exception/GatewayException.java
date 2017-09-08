package com.sywwifi.api.exception;

import com.sywwifi.api.enums.ResultEnums;

/**
 * 网关异常
 *
 * @author 魏来 create on 2017/7/22
 * @version 1.0.0
 */
public class GatewayException extends RuntimeException {

    private Integer code;

    public GatewayException(ResultEnums resultEnums) {
        super(resultEnums.getMsg());
        this.code = resultEnums.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
