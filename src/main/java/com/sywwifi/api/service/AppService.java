package com.sywwifi.api.service;

import com.sywwifi.api.base.BaseService;
import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.pojo.App;

public interface AppService extends BaseService<App, Integer> {

    ResponseInfo<App> getApp();

    ResponseInfo<App> createApp(App app);

    ResponseInfo<App> updateApp(App app);
}
