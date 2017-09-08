package com.sywwifi.api.controller;

import com.sywwifi.api.pojo.Combo;
import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.pojo.User;
import com.sywwifi.api.service.ComboService;
import com.sywwifi.api.service.UserService;
import com.sywwifi.api.util.ServerResponseUtil;
import com.sywwifi.api.vo.RechargeView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 套餐控制器
 * <p>
 * <p>
 * 列出所有套餐
 * 获得套餐
 * 更新套餐
 * 删除套餐
 *
 * @author 魏来 create on 2017/7/29
 * @version 1.0.0
 */
@RestController
@RequestMapping("/combo/")
@Api(value = "测试任务管理", tags = {"套餐管理API"}, description = "套餐 相关操作")
public class ComboController {

    private final ComboService comboService;

    @Autowired
    public ComboController(ComboService comboService) {
        this.comboService = comboService;
    }

    /**
     * 获取套餐对象
     *
     * @param comboId 套餐ID
     * @return 结果
     */
    @GetMapping
    @ApiOperation(value = "获取区域信息", notes = "获取区域信息", produces = "application/json")
    public ResponseInfo getCombo(Integer comboId) {
        return comboService.getById(comboId);
    }

    /**
     * 更新套餐对象
     *
     * @param combo 套餐对象
     * @return 结果
     */
    @PutMapping
    @ApiOperation(value = "更新套餐信息", notes = "更新套餐信息", produces = "application/json")
    public ResponseInfo updateCombo(Combo combo) {
        return comboService.update(combo);
    }

    /**
     * 创建套餐对象
     *
     * @param combo 套餐对象
     * @return 结果
     */
    @PostMapping
    @ApiOperation(value = "创建套餐信息", notes = "创建套餐信息", produces = "application/json")
    public ResponseInfo addCombo(Combo combo) {
        return comboService.create(combo);
    }

    /**
     * 获取所有套餐对象
     *
     * @return 结果
     */
    @GetMapping("list")
    @ApiOperation(value = "获取所有套餐信息", notes = "获取所有套餐信息", produces = "application/json")
    public ResponseInfo listCombo() {
        return comboService.getAll();
    }

    /**
     * 删除套餐对象
     *
     * @param comboId 套餐ID
     * @return 结果
     */
    @DeleteMapping
    @ApiOperation(value = "删除套餐信息", notes = "删除套餐信息", produces = "application/json")
    public ResponseInfo deleteCombo(Integer comboId) {
        return comboService.delete(comboId);
    }

}
