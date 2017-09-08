package com.sywwifi.api.service.impl;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.dao.SerialNumberMapper;
import com.sywwifi.api.dao.SerialRecordMapper;
import com.sywwifi.api.dao.UserMapper;
import com.sywwifi.api.enums.ResultEnums;
import com.sywwifi.api.pojo.SerialNumber;
import com.sywwifi.api.pojo.SerialRecord;
import com.sywwifi.api.pojo.User;
import com.sywwifi.api.service.RechargeService;
import com.sywwifi.api.util.MyDateUtil;
import com.sywwifi.api.util.ServerResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RechargeServiceImpl implements RechargeService {


    private final SerialNumberMapper serialNumberMapper;
    private final SerialRecordMapper serialRecordMapper;
    private final UserMapper userMapper;

    @Autowired
    public RechargeServiceImpl(SerialNumberMapper serialNumberMapper, SerialRecordMapper serialRecordMapper, UserMapper userMapper) {
        this.serialNumberMapper = serialNumberMapper;
        this.serialRecordMapper = serialRecordMapper;
        this.userMapper = userMapper;
    }

    /**
     * 充值使用序列号
     *
     * @param userId         用户id
     * @param serialNumberId 序列号id
     * @param password       密码
     * @return 充值结果
     */
    @Override
    public ResponseInfo rechargeBySerialNumber(String userId, String serialNumberId, String password) {

        int result = 0;
        long serialNumberIdTemp = Long.valueOf(serialNumberId);
        User user = userMapper.selectByPrimaryKey(userId);
        SerialNumber serialNumber = serialNumberMapper.selectByPrimaryKey(serialNumberIdTemp);
        if (user == null) {
            return ServerResponseUtil.error(-1, "用户不存在");
        }

        if (serialNumber == null || serialNumber.getStatus() == 1) {
            return ServerResponseUtil.error(-1, "无效序列号");
        }

        Long now = new Date().getTime();
        Long whenLogin = user.getUserWhenLogin().getTime();
        Date newWhenLogin;
        if (now > whenLogin) {// 如果用户没有时长，则从此刻添加时长
            newWhenLogin = new Date(now + MyDateUtil.getTimeStampByDay(serialNumber.getDay()));
        } else {// 如果用户已有时长，则从原有时长添加
            newWhenLogin = new Date(whenLogin + MyDateUtil.getTimeStampByDay(serialNumber.getDay()));
        }


        user.setUserWhenLogin(newWhenLogin);
        serialNumber.setStatus(1);

        SerialRecord serialRecord = new SerialRecord();
        serialRecord.setUserId(userId);
        serialRecord.setSerialId(serialNumberIdTemp);

        result += userMapper.updateByPrimaryKeySelective(user);
        result += serialNumberMapper.updateByPrimaryKeySelective(serialNumber);
        result += serialRecordMapper.insertSelective(serialRecord);


        if (result == 3) {
            return ServerResponseUtil.success(serialNumber);
        }

        return ServerResponseUtil.error(ResultEnums.ERROR);
    }


}
