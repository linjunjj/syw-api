package com.sywwifi.api.controller;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.service.GatewayService;
import com.sywwifi.api.util.ServerResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 网关控制器
 * <p>
 * 本控制器的功能需求如下
 * <p>
 * 1 添加网关与工地的绑定记录
 * 2 修改网关与工地的绑定记录
 * 3 删除网关与工地的绑定记录
 * 4 列表网关与工地的绑定记录
 *
 * @author 魏来 create on 2017/7/21
 * @version 1.0.0
 */
@Slf4j
@RestController
@Api(value = "测试任务管理", tags = {"网关管理API"}, description = "网关 相关操作")
public class GateWayController {

    private final GatewayService gatewayService;

    public GateWayController(GatewayService gatewayService) {
        this.gatewayService = gatewayService;
    }

    /**
     * 通过mac 地址获取网关对象
     *
     * @param mac mac地址
     * @return 结果
     */
    @PostMapping("/gatewayByMac")
    @ApiOperation(value = "获取网关信息通过MAC地址", notes = "获取网关信息通过MAC地址", produces = "application/json")
    public ResponseInfo getGateway(String mac) {
        return gatewayService.getGatewayByMac(mac);
    }

}
