package com.sywwifi.api.service.impl;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.dao.AppMapper;
import com.sywwifi.api.enums.ResultEnums;
import com.sywwifi.api.pojo.App;
import com.sywwifi.api.pojo.AppExample;
import com.sywwifi.api.service.AppService;
import com.sywwifi.api.util.ServerResponseUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppServiceImpl implements AppService {


    private AppMapper appMapper;

    public AppServiceImpl(AppMapper appMapper) {
        this.appMapper = appMapper;
    }

    @Override
    public ResponseInfo<App> getApp() {
        AppExample appExample = new AppExample();

        List<App> appList = appMapper.selectByExample(appExample);

        if (appList != null) {
            App app = appList.get(0);
            return ServerResponseUtil.success(app);
        }
        return ServerResponseUtil.error(ResultEnums.ERROR);
    }

    @Override
    public ResponseInfo<App> createApp(App app) {
        int result = appMapper.insertSelective(app);
        if (result > 0) {
            return ServerResponseUtil.success();
        }
        return ServerResponseUtil.error(ResultEnums.ERROR);
    }

    @Override
    public ResponseInfo<App> updateApp(App app) {
        int result = appMapper.updateByPrimaryKey(app);

        if (result > 0) {
            return ServerResponseUtil.success(app);
        }
        return ServerResponseUtil.error(ResultEnums.ERROR);
    }

    @Override
    public ResponseInfo<App> create(App app) {
        return null;
    }

    @Override
    public ResponseInfo delete(Integer integer) {
        return null;
    }

    @Override
    public ResponseInfo<App> update(App app) {
        return null;
    }

    @Override
    public ResponseInfo<App> getById(Integer integer) {
        return null;
    }

    @Override
    public ResponseInfo<List<App>> getAll() {
        return null;
    }
}
