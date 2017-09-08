package com.sywwifi.api.service;

import com.sywwifi.api.commons.ResponseInfo;

/**
 * 充值接口服务
 */
public interface RechargeService {
    ResponseInfo rechargeBySerialNumber(String userId, String serialNumberId, String password);
}
