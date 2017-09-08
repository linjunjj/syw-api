package com.sywwifi.api.handle;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.exception.GatewayException;
import com.sywwifi.api.exception.UserException;
import com.sywwifi.api.util.ServerResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 魏来 create on 2017/7/22
 * @version 1.0.0
 */
@Slf4j
@ControllerAdvice
public class ExceptionHandle {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResponseInfo handle(Exception e) {
        if (e instanceof GatewayException) {
            GatewayException gatewayException = (GatewayException) e;
            return ServerResponseUtil.error(gatewayException.getCode(), gatewayException.getMessage());
        } else if (e instanceof UserException) {
            UserException userException = (UserException) e;
            return ServerResponseUtil.error(userException.getCode(), userException.getMessage());
        } else {
            log.error("【系统异常】{}", e);
            return ServerResponseUtil.error(-1, "未知异常");
        }
    }

}
