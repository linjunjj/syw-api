package com.sywwifi.api.controller;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.pojo.App;
import com.sywwifi.api.service.AppService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * APP管理控制器
 *
 * @author weilai
 */
@RestController
@RequestMapping("/app")
@Api(value = "测试任务管理", tags = {"APP管理API"}, description = "APP 相关操作")
public class AppController {

    private final AppService appService;

    @Autowired
    public AppController(AppService appService) {
        this.appService = appService;
    }

    /**
     * 获取APP对象
     *
     * @return 结果
     */
    @GetMapping
    @ApiOperation(value = "获取APP信息", notes = "获取APP信息", produces = "application/json")
    public App getApp() {
        return appService.getApp();
    }

    /**
     * 创建APP对象
     *
     * @param app APP对象
     * @return 结果
     */
    @PostMapping
    @ApiOperation(value = "创建APP信息", notes = "创建APP信息", produces = "application/json")
    public ResponseInfo<App> createApp(App app) {
        return appService.createApp(app);
    }

    /**
     * 更新APP对象
     *
     * @param app APP对象
     * @return 结果
     */
    @PostMapping("/update")
    @ApiOperation(value = "更新APP信息", notes = "更新APP信息", produces = "application/json")
    public ResponseInfo<App> updateApp(App app) {
        return appService.updateApp(app);
    }

}
