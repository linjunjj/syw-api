package com.sywwifi.api.service.impl;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.dao.GatewayMapper;
import com.sywwifi.api.enums.ResultEnums;
import com.sywwifi.api.exception.GatewayException;
import com.sywwifi.api.pojo.Gateway;
import com.sywwifi.api.pojo.GatewayExample;
import com.sywwifi.api.service.GatewayService;
import com.sywwifi.api.util.ServerResponseUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 网关服务接口实现类
 *
 * @author 魏来 create on 2017/7/21
 * @version 1.0.0
 */
@Service
public class GatewayServiceImpl implements GatewayService {

    private GatewayMapper gatewayMapper;

    public GatewayServiceImpl(GatewayMapper gatewayMapper) {
        this.gatewayMapper = gatewayMapper;
    }

    @Override
    @Transactional
    public ResponseInfo<Gateway> create(Gateway gateway) {

        GatewayExample gatewayExample = new GatewayExample();
        gatewayExample.createCriteria().andGatewayMacEqualTo(gateway.getGatewayMac());
        int result = gatewayMapper.selectByExample(gatewayExample).size();
        // 数据库里网关已存在
        if (result > 0) {
            throw new GatewayException(ResultEnums.IS_EXIST);
        }
        // 添加网关
        return ServerResponseUtil.getResponseInfo(gateway, gatewayMapper.insertSelective(gateway));
    }

    @Override
    @Transactional
    public ResponseInfo<Gateway> update(Gateway gateway) {
        GatewayExample gatewayExample = new GatewayExample();
        gatewayExample.createCriteria().andGatewayMacEqualTo(gateway.getGatewayMac());
        int result = gatewayMapper.selectByExample(gatewayExample).size();
        // 用户数据异常
        if (result != 1) {
            throw new GatewayException(ResultEnums.DATA_NOT_UNICODE);
        }
        return ServerResponseUtil.getResponseInfo(gateway, gatewayMapper.updateByPrimaryKeySelective(gateway));
    }

    @Override
    @Transactional
    public ResponseInfo delete(Integer gatewayId) {
        GatewayExample gatewayExample = new GatewayExample();
        gatewayExample.createCriteria().andGatewayIdEqualTo(gatewayId);
        int result = gatewayMapper.selectByExample(gatewayExample).size();
        // 网关数据异常
        if (result != 1) {
            throw new GatewayException(ResultEnums.ERROR_UN_KNOW);
        }
        return ServerResponseUtil.getResponseInfo(gatewayId, gatewayMapper.deleteByPrimaryKey(gatewayId));
    }

    @Override
    @Transactional
    public ResponseInfo<List<Gateway>> getAll() {
        return ServerResponseUtil.getResponseInfo(gatewayMapper.selectByExample(new GatewayExample()));
    }

    @Override
    @Transactional
    public ResponseInfo<Gateway> getGatewayByMac(String mac) {
        GatewayExample gatewayExample = new GatewayExample();
        gatewayExample.createCriteria().andGatewayMacEqualTo(mac);
        return ServerResponseUtil.getResponseInfo(gatewayMapper.selectByExample(gatewayExample).get(0));
    }

    @Override
    @Transactional
    public ResponseInfo<Gateway> getById(Integer gatewayId) {
        GatewayExample gatewayExample = new GatewayExample();
        gatewayExample.createCriteria().andGatewayIdEqualTo(gatewayId);
        return ServerResponseUtil.getResponseInfo(gatewayMapper.selectByExample(gatewayExample).get(0));
    }

}
