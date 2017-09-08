package com.sywwifi.api.controller;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.pojo.Order;
import com.sywwifi.api.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order/")
@Api(value = "测试任务管理", tags = {"订单管理API"}, description = "订单 相关操作")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("create")
    @ApiOperation(value = "创建订单", notes = "创建订单", produces = "application/json")
    public ResponseInfo<Order> create(Order order) {
        return orderService.create(order);
    }

    @GetMapping("list")
    @ApiOperation(value = "获取所有订单", notes = "获取所有订单", produces = "application/json")
    public ResponseInfo<List<Order>> getAll() {
        return orderService.getAll();
    }

}
