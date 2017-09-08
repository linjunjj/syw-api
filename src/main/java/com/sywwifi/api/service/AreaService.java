package com.sywwifi.api.service;

import com.sywwifi.api.base.BaseService;
import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.pojo.Area;

import java.util.List;

/**
 * 区域服务接口
 */
public interface AreaService extends BaseService<Area, Integer> {

    ResponseInfo<Area> getByName(String name);

    ResponseInfo<Area> getByMac(String mac);
}
