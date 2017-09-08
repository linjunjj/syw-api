package com.sywwifi.api.service.impl;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.dao.AreaMapper;
import com.sywwifi.api.pojo.Area;
import com.sywwifi.api.pojo.AreaExample;
import com.sywwifi.api.service.AreaService;
import com.sywwifi.api.service.GatewayService;
import com.sywwifi.api.util.ServerResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {


    private final AreaMapper areaMapper;
    private final GatewayService gatewayService;

    @Autowired
    public AreaServiceImpl(AreaMapper areaMapper, GatewayService gatewayService) {
        this.areaMapper = areaMapper;
        this.gatewayService = gatewayService;
    }

    @Override
    public ResponseInfo<Area> create(Area area) {
        return ServerResponseUtil.getResponseInfo(area, areaMapper.insertSelective(area));
    }

    @Override
    public ResponseInfo<Integer> delete(Integer areaId) {
        return ServerResponseUtil.getResponseInfo(areaMapper.deleteByPrimaryKey(areaId));
    }

    @Override
    public ResponseInfo<Area> update(Area area) {
        return ServerResponseUtil.getResponseInfo(area, areaMapper.updateByPrimaryKeySelective(area));
    }

    @Override
    public ResponseInfo<Area> getByName(String name) {
        AreaExample areaExample = new AreaExample();
        areaExample.createCriteria().andNameEqualTo(name);
        return ServerResponseUtil.getResponseInfo(areaMapper.selectByExample(areaExample).get(0));
    }

    @Override
    public ResponseInfo<Area> getById(Integer areaId) {
        return ServerResponseUtil.getResponseInfo(areaMapper.selectByPrimaryKey(areaId));
    }

    @Override
    public ResponseInfo<Area> getByMac(String mac) {

        return null;
    }

    @Override
    public ResponseInfo<List<Area>> getAll() {
        return ServerResponseUtil.getResponseInfo(areaMapper.selectByExample(new AreaExample()));
    }

}
