package com.sywwifi.api.controller;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.pojo.Area;
import com.sywwifi.api.service.AreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/area/")
@Api(value = "测试任务管理", tags = {"区域管理API"}, description = "区域 相关操作")
public class AreaController {

    private final AreaService areaService;

    @Autowired
    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @PostMapping("create")
    @ApiOperation(value = "创建区域信息", notes = "创建区域信息", produces = "application/json")
    public ResponseInfo<Area> create(Area area) {
        return areaService.create(area);
    }

    @PostMapping("update")
    @ApiOperation(value = "更新区域信息", notes = "更新区域信息", produces = "application/json")
    public ResponseInfo<Area> update(Area area) {
        return areaService.update(area);
    }

    @GetMapping("byId")
    @ApiOperation(value = "通过ID获取区域信息", notes = "通过ID获取区域信息", produces = "application/json")
    public ResponseInfo<Area> getAreaById(Integer id) {
        return areaService.getById(id);
    }

    @GetMapping("byName")
    @ApiOperation(value = "通过名称获取区域信息", notes = "通过名称获取区域信息", produces = "application/json")
    public ResponseInfo<Area> getAreaByName(String name) {
        return areaService.getByName(name);
    }

    @GetMapping("byMac")
    @ApiOperation(value = "通过MAC获取区域信息", notes = "通过MAC获取区域信息", produces = "application/json")
    public ResponseInfo<Area> getAreaByMac(String mac) {
        return areaService.getByMac(mac);
    }

    @GetMapping("list")
    @ApiOperation(value = "获取所有区域信息", notes = "获取所有区域信息", produces = "application/json")
    public ResponseInfo<List<Area>> getALLArea() {
        return areaService.getAll();
    }

}
