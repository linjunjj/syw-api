package com.sywwifi.api.service.impl;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.dao.SerialNumberMapper;
import com.sywwifi.api.enums.ResultEnums;
import com.sywwifi.api.pojo.SerialNumber;
import com.sywwifi.api.pojo.SerialNumberExample;
import com.sywwifi.api.service.SerialNumberService;
import com.sywwifi.api.util.IDUtil;
import com.sywwifi.api.util.ServerResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 序列号接口实现类
 */
@Service
public class SerialNumberServiceImpl implements SerialNumberService {

    private final SerialNumberMapper serialNumberMapper;

    @Autowired
    public SerialNumberServiceImpl(SerialNumberMapper serialNumberMapper) {
        this.serialNumberMapper = serialNumberMapper;
    }

    @Override
    public ResponseInfo create(int number, int day, int balance, String type) {
        int result = 0;
        for (int i = 0; i < number; i++) {
            SerialNumber tempSerialNumber = createSerialNumber(day, balance, type);
            result = serialNumberMapper.insertSelective(tempSerialNumber);
            if (result == 0) {
                return ServerResponseUtil.error(ResultEnums.ERROR);
            }
        }

        return ServerResponseUtil.success(result);
    }

    @Override
    public ResponseInfo<List<String>> getListByStatus(int status) {

        SerialNumberExample serialNumberExample = new SerialNumberExample();
        serialNumberExample.createCriteria().andStatusEqualTo(status);

        List<SerialNumber> serialNumberList = serialNumberMapper.selectByExample(serialNumberExample);

        List<String> stringList = new ArrayList<>();

        for (SerialNumber serialNumber : serialNumberList) {
            String statusStr = serialNumber.getStatus() == 1 ? "已使用" : "未使用";
            String tempSerialNumber = serialNumber.getId() + "" + serialNumber.getPassword() + " " + serialNumber.getDay() + "天 " + statusStr + " 类型 " + serialNumber.getType();
            stringList.add(tempSerialNumber);
        }


        return ServerResponseUtil.getResponseInfo(stringList, stringList.size());
    }

    @Override
    public ResponseInfo<SerialNumber> create(SerialNumber serialNumber) {
        return null;
    }

    @Override
    public ResponseInfo delete(Integer integer) {
        return null;
    }

    @Override
    public ResponseInfo<SerialNumber> update(SerialNumber serialNumber) {
        return null;
    }

    @Override
    public ResponseInfo<SerialNumber> getById(Integer integer) {
        return null;
    }

    @Override
    public ResponseInfo<List<SerialNumber>> getAll() {
        return null;
    }

    /**
     * 创建序列号
     *
     * @param day     天数
     * @param balance 金额
     * @param type    类型
     * @return 结果
     */
    private SerialNumber createSerialNumber(int day, int balance, String type) {
        SerialNumber serialNumber = new SerialNumber();
        serialNumber.setPassword(IDUtil.getSixBitRandom());
        serialNumber.setDay(day);
        serialNumber.setMoney(balance);
        serialNumber.setType(type);
        return serialNumber;
    }

}
