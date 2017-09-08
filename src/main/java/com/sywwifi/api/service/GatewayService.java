package com.sywwifi.api.service;

import com.sywwifi.api.base.BaseService;
import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.pojo.Gateway;

import java.util.List;

/**
 * 网关服务接口
 *
 * @author 魏来 create on 2017/7/21
 * @version 1.0.0
 */
public interface GatewayService extends BaseService<Gateway, Integer> {

    /**
     * 通过mac地址获得网关对象
     *
     * @param mac mac地址
     * @return 结果
     */
    ResponseInfo<Gateway> getGatewayByMac(String mac);

}
