package com.sywwifi.api.controller;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.pojo.Goods;
import com.sywwifi.api.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods/")
@Api(value = "测试任务管理", tags = {"商品管理API"}, description = "商品 相关操作")
public class GoodsController {

    private final GoodsService goodsService;

    @Autowired
    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    /**
     * 创建商品对象
     *
     * @param goods 商品
     * @return 结果
     */
    @PostMapping("create")
    @ApiOperation(value = "创建商品信息", notes = "创建商品信息", produces = "application/json")
    public ResponseInfo<Goods> create(Goods goods) {
        return goodsService.create(goods);
    }

    /**
     * 更新商品对象
     *
     * @param goods 商品对象
     * @return 结果
     */
    @PostMapping("update")
    @ApiOperation(value = "更新所有的商品信息", notes = "更新所有的商品信息", produces = "application/json")
    public ResponseInfo<Goods> update(Goods goods) {
        return goodsService.update(goods);
    }

    /**
     * 获取所有商品对象
     *
     * @return 结果
     */
    @GetMapping("list")
    @ApiOperation(value = "获取所有的商品信息", notes = "获取所有的商品信息", produces = "application/json")
    public ResponseInfo<List<Goods>> getAllGoods() {
        return goodsService.getAll();
    }


}
