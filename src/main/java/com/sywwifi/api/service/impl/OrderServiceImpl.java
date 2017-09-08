package com.sywwifi.api.service.impl;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.dao.OrderMapper;
import com.sywwifi.api.pojo.Order;
import com.sywwifi.api.pojo.OrderExample;
import com.sywwifi.api.service.OrderService;
import com.sywwifi.api.util.IDUtil;
import com.sywwifi.api.util.ServerResponseUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderMapper orderMapper;

    public OrderServiceImpl(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public ResponseInfo<Order> create(Order order) {
        order.setId(IDUtil.getId());
        return ServerResponseUtil.getResponseInfo(order, orderMapper.insertSelective(order));
    }

    @Override
    public ResponseInfo delete(String id) {
        return null;
    }

    @Override
    public ResponseInfo<Order> update(Order order) {
        return ServerResponseUtil.getResponseInfo(order, orderMapper.updateByPrimaryKeySelective(order));
    }

    @Override
    public ResponseInfo<Order> getById(String id) {
        return ServerResponseUtil.getResponseInfo(orderMapper.selectByPrimaryKey(id));
    }

    @Override
    public ResponseInfo<List<Order>> getAll() {
        return ServerResponseUtil.getResponseInfo(orderMapper.selectByExample(new OrderExample()));
    }
}
