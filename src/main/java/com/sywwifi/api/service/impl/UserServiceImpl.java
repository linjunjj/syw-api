package com.sywwifi.api.service.impl;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.dao.LogMapper;
import com.sywwifi.api.dao.RechargeRecordMapper;
import com.sywwifi.api.dao.UserMapper;
import com.sywwifi.api.enums.ResultEnums;
import com.sywwifi.api.exception.UserException;
import com.sywwifi.api.pojo.*;
import com.sywwifi.api.service.UserService;
import com.sywwifi.api.util.IDUtil;
import com.sywwifi.api.util.MyDateUtil;
import com.sywwifi.api.util.ServerResponseUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 用户服务接口实现
 *
 * @author 魏来 create on 2017/7/21
 * @version 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;
    private RechargeRecordMapper rechargeRecordMapper;
    private LogMapper logMapper;

    public UserServiceImpl(UserMapper userMapper, RechargeRecordMapper rechargeRecordMapper, LogMapper logMapper) {
        this.userMapper = userMapper;
        this.rechargeRecordMapper = rechargeRecordMapper;
        this.logMapper = logMapper;
    }

    @Override
    @Transactional
    public ResponseInfo loginByPhone(User user) {

        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserPhoneEqualTo(user.getUserPhone());
        List<User> userList = userMapper.selectByExample(userExample);

        // 存在就登录用户
        if (userList != null && userList.size() == 1) {
            user = userList.get(0);
            user.setUserLoginTime(user.getUserLoginTime() + 1);

            Log log = new Log();
            log.setUserId(user.getUserId());
            log.setArea(user.getUserRegArea());
            log.setLoginLogId(IDUtil.getId());
            log.setAction("login");


            if (logMapper.insertSelective(log) > 0) {
                return updateUser(user);
            }

            return ServerResponseUtil.error(ResultEnums.ERROR);
        }

        // 如果不存在则注册用户
        return registerByPhone(user);
    }

    @Override
    @Transactional
    public ResponseInfo loginByUsername(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(user.getUserName());
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size() == 0) {// 如果用户不存在，返回空
            throw new UserException(ResultEnums.USER_IS_NOT_EXIST);
        }// 若用户存在，则更新用户登录次数，返回完整用户对象
        user.setUserLoginTime(user.getUserLoginTime() + 1);
        return updateUser(user);
    }

    @Override
    @Transactional
    public ResponseInfo registerByPhone(User user) {
        // 判断用户名是否存在
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserPhoneEqualTo(user.getUserPhone());
        if (userMapper.selectByExample(userExample).size() > 0) {// 如果用户存在
            throw new UserException(ResultEnums.USER_IS_EXIST);// 用户已存在
        }
        return addUser(user);
    }

    @Override
    @Transactional
    public ResponseInfo registerByUsername(User user) {
        // 判断用户名是否存在
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(user.getUserName());
        if (userMapper.selectByExample(userExample).size() > 0) {// 如果用户存在
            throw new UserException(ResultEnums.USER_IS_EXIST);// 用户存在
        }
        return addUser(user);
    }

    @Override
    @Transactional
    public User getUserByPhone(String phone) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserPhoneEqualTo(phone);
        userMapper.selectByExample(userExample);
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size() == 1) {
            return userList.get(0);
        } else {
            throw new UserException(ResultEnums.USER_IS_NOT_EXIST);
        }
    }

    @Override
    @Transactional
    public User getUserByUserName(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(username);
        userMapper.selectByExample(userExample);
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size() == 1) {
            return userList.get(0);
        } else {
            throw new UserException(ResultEnums.USER_IS_NOT_EXIST);
        }
    }

    @Override
    @Transactional
    public User getUserByUserId(String userId) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdEqualTo(userId);
        userMapper.selectByExample(userExample);
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size() == 1) {
            return userList.get(0);
        } else {
            throw new UserException(ResultEnums.USER_IS_NOT_EXIST);
        }
    }

    @Override
    @Transactional
    public ResponseInfo listUser() {
        List<User> userList = userMapper.selectByExample(new UserExample());
        if (userList != null && userList.size() > 0) {
            return ServerResponseUtil.success(userList);
        }
        return ServerResponseUtil.error(ResultEnums.ERROR);
    }

    @Override
    @Transactional
    public ResponseInfo updateUser(User user) {
        int result = userMapper.updateByPrimaryKeySelective(user);
        if (result > 0) {
            return ServerResponseUtil.success(user);
        }
        return ServerResponseUtil.error(ResultEnums.USER_UPDATE_FAULT);
    }

    @Override
    @Transactional
    public ResponseInfo addUser(User user) {
        user.setUserId(IDUtil.getId());
        user.setUserWhenLogin(new Date());
        int result = userMapper.insertSelective(user);
        if (result > 0) {
            return ServerResponseUtil.success(userMapper.selectByPrimaryKey(user.getUserId()));
        }
        return ServerResponseUtil.error(ResultEnums.INSERT_FAULT);
    }

    @Override
    @Transactional
    public ResponseInfo recharge(User user, Combo combo) {
        // 判断用户是否余额不足
        // 用户扣款
        // 用户加时长
        int temp = user.getUserBalance() - combo.getComboAmount();
        if (temp >= 0) {
            user.setUserBalance(temp);
        } else {
            throw new UserException(ResultEnums.NOT_SUFFICIENT_FUNDS);
        }

        Long comboData = MyDateUtil.getTimeStampByDay(combo.getComboLong());
        Long now = new Date().getTime();
        if (user.getUserWhenLogin().getTime() < now) {// 时间在今天以前
            user.setUserWhenLogin(new Date(now + comboData));
        } else {// 时间在今天以后
            user.setUserWhenLogin(new Date(user.getUserWhenLogin().getTime() + comboData));
        }
        return updateUser(user);
    }

    @Override
    @Transactional
    public ResponseInfo rechargeToWhenLogin(User user, Integer day) {
        // 判断用户是否余额不足
        // 用户扣款
        // 用户加时长

        Long comboData = MyDateUtil.getTimeStampByDay(day);
        Long now = new Date().getTime();
        if (user.getUserWhenLogin().getTime() < now) {// 时间在今天以前
            user.setUserWhenLogin(new Date(now + comboData));
        } else {// 时间在今天以后
            user.setUserWhenLogin(new Date(user.getUserWhenLogin().getTime() + comboData));
        }

        User tempUser = (User) updateUser(user).getData();

        if (tempUser != null) {

            RechargeRecord rechargeRecord = new RechargeRecord();
            rechargeRecord.setRechargeRecordId(IDUtil.getId());
            rechargeRecord.setDay(day);
            rechargeRecord.setUserId(user.getUserId());
            int result = rechargeRecordMapper.insertSelective(rechargeRecord);
            if (result > 0) {
                return ServerResponseUtil.success(tempUser);
            }
        }
        return ServerResponseUtil.error(ResultEnums.ERROR);
    }

    @Override
    @Transactional
    public ResponseInfo changeWhenLogin(User user, long whenLogin) {
        user.setUserWhenLogin(new Date(whenLogin));
        int result = userMapper.updateByPrimaryKeySelective(user);
        if (result == 1) {
            return ServerResponseUtil.success(user);
        }
        return ServerResponseUtil.error(ResultEnums.ERROR);
    }

    @Override
    public ResponseInfo countAllUser() {

        int result = userMapper.countAllUser();

        if (result > 0) {
            return ServerResponseUtil.success(result);
        }

        return ServerResponseUtil.error(ResultEnums.ERROR);
    }

    @Override
    public ResponseInfo<Integer> countAllUserByArea(String area) {
        return ServerResponseUtil.getResponseInfo(userMapper.countAllUserByArea(area));
    }

    @Override
    @Transactional
    public ResponseInfo recharge(User user, Integer money) {
        user.setUserBalance(user.getUserBalance() + money);
        return updateUser(user);
    }

}
