package com.sywwifi.api.service;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.pojo.Combo;
import com.sywwifi.api.pojo.User;

/**
 * 用户服务接口
 *
 * @author 魏来 create on 2017/7/21
 * @version 1.0.0
 */
public interface UserService {

    /**
     * 用户动态密码登录方法
     *
     * @param user 用户对象
     * @return 返回值
     */
    ResponseInfo loginByPhone(User user);

    /**
     * 用户静态密码登录
     *
     * @param user 用户对象
     * @return 结果
     */
    ResponseInfo loginByUsername(User user);

    /**
     * 用户静态密码注册
     *
     * @param user 用户对象
     * @return 结果
     */
    ResponseInfo registerByPhone(User user);

    /**
     * 用户静态密码注册
     *
     * @param user 用户对象
     * @return 结果
     */
    ResponseInfo registerByUsername(User user);

    /**
     * 通过用户手机号码获得用户对象
     *
     * @param phone 用户手机号码
     * @return 用户对象
     */
    User getUserByPhone(String phone);

    /**
     * 通过用户手机号码获得用户对象
     *
     * @param username 用户手机号码
     * @return 用户对象
     */
    User getUserByUserName(String username);

    /**
     * 通过用户手机号码获得用户对象
     *
     * @param userID 用户手机号码
     * @return 用户对象
     */
    User getUserByUserId(String userID);

    /**
     * 列出所有的用户对象
     *
     * @return 结果
     */
    ResponseInfo listUser();

    /**
     * 更新用户数据
     *
     * @param user 用户对象
     * @return 更新后的用户对象
     */
    ResponseInfo updateUser(User user);

    /**
     * 添加用户数据
     *
     * @param user 用户对象
     * @return 更新后的用户对象
     */
    ResponseInfo addUser(User user);

    /**
     * 用户充值
     *
     * @param user  用户对象
     * @param combo 套餐对象
     * @return 结果
     */
    ResponseInfo recharge(User user, Combo combo);

    /**
     * 用户充值
     *
     * @param user  用户对象
     * @param money 套餐对象
     * @return 结果
     */
    ResponseInfo recharge(User user, Integer money);

    /**
     * 用户充值
     *
     * @param user 用户对象
     * @param day  天数
     * @return 结果
     */
    ResponseInfo rechargeToWhenLogin(User user, Integer day);

    /**
     * 修改截止时间
     *
     * @param user      用户
     * @param whenLogin 时间戳
     * @return 结果
     */
    ResponseInfo changeWhenLogin(User user, long whenLogin);

    ResponseInfo countAllUser();

    /**
     * 获取工地总人数
     *
     * @param area 工地
     * @return 结果
     */
    ResponseInfo<Integer> countAllUserByArea(String area);
}
