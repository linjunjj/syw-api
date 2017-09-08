package com.sywwifi.api.controller;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.pojo.User;
import com.sywwifi.api.service.UserService;
import com.sywwifi.api.util.ServerResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户控制器
 * 定义用户 登录 注册 充值
 *
 * 获取总人数
 * 获取工地人数
 *
 * @author 魏来 create on 2017/7/21
 * @version 1.0.0
 */
@Slf4j
@RestController
@Api(value = "测试任务管理", tags = {"用户管理API"}, description = "用户 相关操作")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 通过手机号码登录
     *
     * @param phone 手机号码
     * @param area  区域
     * @return 结果
     */
    @PostMapping(value = "/user/loginByPhone")
    @ApiOperation(value = "通过手机号码登录", notes = "通过手机号码登录", produces = "application/json")
    public ResponseInfo loginByPhone(String phone, String area) {
        log.info(phone + ":" + area);
        User user = new User();
        user.setUserPhone(phone);
        user.setUserRegArea(area);
        return userService.loginByPhone(user);
    }

    /**
     * 通过手机号码注册用户
     *
     * @param phone 手机号码
     * @param area  区域
     * @return 结果
     */
    @PostMapping(value = "/user/registryByPhone")
    @ApiOperation(value = "通过手机号码注册用户", notes = "通过手机号码注册用户", produces = "application/json")
    public ResponseInfo registryByPhone(String phone, String area) {
        User user = new User();
        user.setUserPhone(phone);
        user.setUserRegArea(area);
        log.info(user.toString());
        return ServerResponseUtil.success(userService.registerByPhone(user));
    }

    /**
     * 通过用户名和密码登录
     *
     * @param username 用户名
     * @param password 密码
     * @param area     区域
     * @return 结果
     */
    @PostMapping(value = "/user/loginByUsername")
    @ApiOperation(value = "通过用户名和密码登录", notes = "通过用户名和密码登录", produces = "application/json")
    public ResponseInfo loginByUsername(String username, String password, String area) {
        log.info(username + ":" + area);
        User user = new User();
        user.setUserName(username);
        user.setUserPassword(password);
        user.setUserRegArea(area);
        return userService.loginByUsername(user);
    }

    /**
     * 通过用户名密码注册用户
     *
     * @param username 用户名
     * @param password 密码
     * @param area     区域
     * @return 结果
     */
    @PostMapping(value = "/user/registryByUsername")
    @ApiOperation(value = "通过用户名密码注册用户", notes = "通过用户名密码注册用户", produces = "application/json")
    public ResponseInfo registryByUsername(String username, String password, String area) {
        User user = new User();
        user.setUserName(username);
        user.setUserPassword(password);
        user.setUserRegArea(area);
        log.info(user.toString());
        return ServerResponseUtil.success(userService.registerByUsername(user));
    }

    /**
     * 获取用户列表
     *
     * @return 结果
     */
    @GetMapping(value = "/user_list")
    @ApiOperation(value = "获取网关信息通过MAC地址", notes = "获取网关信息通过MAC地址", produces = "application/json")
    public ResponseInfo userList() {
        return ServerResponseUtil.success(userService.listUser());
    }

    /**
     * 刷新用户
     *
     * @param userPhone 用户手机号码
     * @return 结果
     */
    @GetMapping(value = "user/refresh/{userPhone}")
    @ApiOperation(value = "获取网关信息通过MAC地址", notes = "获取网关信息通过MAC地址", produces = "application/json")
    public ResponseInfo refresh(@PathVariable String userPhone) {
        User user = userService.getUserByPhone(userPhone);
        return ServerResponseUtil.success(user);
    }

    /**
     * 更改用户截止时间
     *
     * @param userPhone 用户手机号码
     * @param whenLogin 用户截止时间
     * @return 结果
     */
    @PostMapping("/user/changeWhenLogin")
    @ApiOperation(value = "获取网关信息通过MAC地址", notes = "获取网关信息通过MAC地址", produces = "application/json")
    public ResponseInfo changeWhenLogin(String userPhone, long whenLogin) {
        User user = userService.getUserByPhone(userPhone);
        return userService.changeWhenLogin(user, whenLogin);

    }

    /**
     * 获取所有用户数量
     *
     * @return 结果
     */
    @GetMapping("/user/countAllUser")
    @ApiOperation(value = "获取网关信息通过MAC地址", notes = "获取网关信息通过MAC地址", produces = "application/json")
    public ResponseInfo countAllUser() {
        return userService.countAllUser();
    }
    /**
     * 获取所有用户数量
     *
     * @return 结果
     */
    @GetMapping("countAllUserByArea")
    @ApiOperation(value = "获取网关信息通过MAC地址", notes = "获取网关信息通过MAC地址", produces = "application/json")
    public ResponseInfo<Integer> countAllUserByArea(String area){
        return userService.countAllUserByArea(area);
    }


}
