package com.sywwifi.api.service.impl;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.dao.ComboMapper;
import com.sywwifi.api.pojo.Combo;
import com.sywwifi.api.pojo.ComboExample;
import com.sywwifi.api.service.ComboService;
import com.sywwifi.api.util.ServerResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 套餐服务实现类
 *
 * @author 魏来 create on 2017/7/29
 * @version 1.0.0
 */
@Slf4j
@Service
public class ComboServiceImpl implements ComboService {

    private final ComboMapper comboMapper;

    @Autowired
    public ComboServiceImpl(ComboMapper comboMapper) {
        this.comboMapper = comboMapper;
    }

    @Override
    @Transactional
    public ResponseInfo<Combo> create(Combo combo) {
        return ServerResponseUtil.getResponseInfo(combo, comboMapper.insertSelective(combo));
    }

    @Override
    @Transactional
    public ResponseInfo<Combo> update(Combo combo) {
        return ServerResponseUtil.getResponseInfo(combo, comboMapper.updateByPrimaryKeySelective(combo));
    }

    @Override
    @Transactional
    public ResponseInfo delete(Integer comboId) {
        return ServerResponseUtil.getResponseInfo(comboId, comboMapper.deleteByPrimaryKey(comboId));
    }

    @Override
    @Transactional
    public ResponseInfo<Combo> getById(Integer comboId) {
        return ServerResponseUtil.getResponseInfo(comboMapper.selectByPrimaryKey(comboId));
    }

    @Override
    @Transactional
    public ResponseInfo<List<Combo>> getAll() {
        return ServerResponseUtil.getResponseInfo(comboMapper.selectByExample(new ComboExample()));
    }
}
