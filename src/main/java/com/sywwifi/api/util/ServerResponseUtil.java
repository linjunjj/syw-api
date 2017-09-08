package com.sywwifi.api.util;

import com.sywwifi.api.enums.ResultEnums;
import com.sywwifi.api.commons.ResponseInfo;

/**
 * 结果工具类
 *
 * @author 魏来 create on 2017/7/22
 * @version 1.0.0
 */
public final class ServerResponseUtil {

    public static <T> ResponseInfo<T> success(T object) {
        ResponseInfo<T> responseInfo = new ResponseInfo<>();
        responseInfo.setCode(0);
        responseInfo.setMsg("成功");
        responseInfo.setData(object);
        return responseInfo;
    }

    public static <T> ResponseInfo<T> success() {
        return success(null);
    }

    public static <T> ResponseInfo<T> error(Integer code, String msg) {
        ResponseInfo responseInfo = new ResponseInfo();
        responseInfo.setCode(code);
        responseInfo.setMsg(msg);
        return responseInfo;
    }

    public static <T> ResponseInfo<T> error(ResultEnums resultEnums) {
        ResponseInfo responseInfo = new ResponseInfo();
        responseInfo.setCode(resultEnums.getCode());
        responseInfo.setMsg(resultEnums.getMsg());
        return responseInfo;
    }

    public static <T> ResponseInfo<T> getResponseInfo(T o) {
        return getResponseInfo(o, 1);
    }

    public static <T> ResponseInfo<T> getResponseInfo(T o, int result) {
        if (result > 0) {
            return ServerResponseUtil.success(o);
        }
        return ServerResponseUtil.error(ResultEnums.ERROR);
    }

}
