package com.sywwifi.api.service;

import com.sywwifi.api.base.BaseService;
import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.pojo.SerialNumber;

import java.util.List;

/**
 * 序列号服务接口
 */
public interface SerialNumberService extends BaseService<SerialNumber, Integer> {

    ResponseInfo create(int number, int day, int balance, String type);

    ResponseInfo<List<String>> getListByStatus(int status);
}
