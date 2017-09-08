package com.sywwifi.api.service.impl;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.dao.GoodsMapper;
import com.sywwifi.api.pojo.Goods;
import com.sywwifi.api.pojo.GoodsExample;
import com.sywwifi.api.service.GoodsService;
import com.sywwifi.api.util.ServerResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    private final GoodsMapper goodsMapper;

    @Autowired
    public GoodsServiceImpl(GoodsMapper goodsMapper) {
        this.goodsMapper = goodsMapper;
    }

    @Override
    public ResponseInfo<Goods> create(Goods goods) {
        int result = goodsMapper.insertSelective(goods);
        return ServerResponseUtil.getResponseInfo(goods, result);
    }

    @Override
    public ResponseInfo<Integer> delete(Integer goodsId) {
        return null;
    }

    @Override
    public ResponseInfo<Goods> update(Goods goods) {
        return null;
    }

    @Override
    public ResponseInfo<Goods> getById(Integer id) {
        return null;
    }

    @Override
    public ResponseInfo<List<Goods>> getAll() {
        return ServerResponseUtil.getResponseInfo(goodsMapper.selectByExample(new GoodsExample()));
    }

}
