package com.sywwifi.api.controller;

import com.sywwifi.api.enums.ResultEnums;
import com.sywwifi.api.pojo.Combo;
import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.pojo.User;
import com.sywwifi.api.service.ComboService;
import com.sywwifi.api.service.RechargeService;
import com.sywwifi.api.service.UserService;
import com.sywwifi.api.util.ServerResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 充值时长服务
 * 用户充值 传入用户ID 传入套餐ID
 */
@Slf4j
@RestController
@RequestMapping("/recharge/")
@Api(value = "测试任务管理", tags = {"充值管理API"}, description = "充值 相关操作")
public class RechargeController {

    private final UserService userService;
    private final ComboService comboService;
    private final RechargeService rechargeService;

    @Autowired
    public RechargeController(UserService userService, ComboService comboService, RechargeService rechargeService) {
        this.userService = userService;
        this.comboService = comboService;
        this.rechargeService = rechargeService;
    }

    /**
     * 执行充值行为
     *
     * @param userId  用户Id
     * @param comboId 套餐Id
     * @return 结果
     */
    @PostMapping("recharge")
    @ApiOperation(value = "套餐充值", notes = "套餐充值", produces = "application/json")
    public ResponseInfo recharge(String userId, Integer comboId) {
        User user = userService.getUserByUserId(userId);
        Combo combo = comboService.getById(comboId).getData();
        return ServerResponseUtil.success(userService.recharge(user, combo));
    }

    /**
     * 执行充值行为
     *
     * @param userPhone 用户
     * @param day       天数
     * @return 结果
     */
    @PostMapping("rechargeToWhenLogin")
    @ApiOperation(value = "充值时长", notes = "充值时长", produces = "application/json")
    public ResponseInfo rechargeToLogin(String userPhone, Integer day) {
        User user = userService.getUserByPhone(userPhone);

        if (user == null) {
            return ServerResponseUtil.error(ResultEnums.USER_IS_NOT_EXIST);
        }

        return ServerResponseUtil.success(userService.rechargeToWhenLogin(user, day));
    }

    /**
     * 执行充值行为
     *
     * @param userPhone 用户手机号码
     * @param money     钱
     * @return 结果
     */
    @PostMapping("recharge2")
    @ApiOperation(value = "充值金额", notes = "充值金额", produces = "application/json")
    public ResponseInfo recharge2(String userPhone, Integer money) {
        User user = userService.getUserByPhone(userPhone);
        return ServerResponseUtil.success(userService.recharge(user, money));
    }

    /**
     * 充值
     *
     * @param userId       用户
     * @param serialNumber 序列号
     * @param password     密码
     * @return 结果
     */
    @PostMapping("BySerialNumber")
    @ApiOperation(value = "序列号充值", notes = "序列号充值", produces = "application/json")
    public ResponseInfo rechargeBySerialNumber(String userId, String serialNumber, String password) {
        return rechargeService.rechargeBySerialNumber(userId, serialNumber, password);
    }

}
