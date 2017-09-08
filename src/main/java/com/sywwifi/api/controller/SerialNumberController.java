package com.sywwifi.api.controller;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.pojo.SerialNumber;
import com.sywwifi.api.service.SerialNumberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 序列号控制器
 * <p>
 * 创建序列号
 */
@RestController
@RequestMapping("/serial-number/")
@Api(value = "测试任务管理", tags = {"序列号管理API"}, description = "序列号 相关操作")
public class SerialNumberController {

    private final SerialNumberService serialNumberService;

    @Autowired
    public SerialNumberController(SerialNumberService serialNumberService) {
        this.serialNumberService = serialNumberService;
    }

    /**
     * 创建序列号
     *
     * @param number  数量
     * @param balance 金额
     * @return 结果
     */
    @PostMapping("create")
    public ResponseInfo createSerialNumber(int number, int day, int balance, String type) {
        return serialNumberService.create(number, day, balance, type);
    }

    @GetMapping("getList")
    @ApiOperation(value = "获取所有序列号", notes = "获取所有序列号", produces = "application/json")
    public ResponseInfo<List<String>> getSerialNumberList(int status) {
        return serialNumberService.getListByStatus(status);
    }


}
