package com.sywwifi.api.pojo;

import java.util.Date;

public class App {
    private Integer id;

    private String appName;

    private String newAppSize;

    private String newAppVersionName;

    private Integer newAppVersionCode;

    private String newAppUpdateDesc;

    private Date newAppReleaseTime;

    private String newAppUrl;

    private Integer isForceUpdate;

    private Date createTime;

    private Date updateTime;

    public App(Integer id, String appName, String newAppSize, String newAppVersionName, Integer newAppVersionCode, String newAppUpdateDesc, Date newAppReleaseTime, String newAppUrl, Integer isForceUpdate, Date createTime, Date updateTime) {
        this.id = id;
        this.appName = appName;
        this.newAppSize = newAppSize;
        this.newAppVersionName = newAppVersionName;
        this.newAppVersionCode = newAppVersionCode;
        this.newAppUpdateDesc = newAppUpdateDesc;
        this.newAppReleaseTime = newAppReleaseTime;
        this.newAppUrl = newAppUrl;
        this.isForceUpdate = isForceUpdate;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public App() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getNewAppSize() {
        return newAppSize;
    }

    public void setNewAppSize(String newAppSize) {
        this.newAppSize = newAppSize == null ? null : newAppSize.trim();
    }

    public String getNewAppVersionName() {
        return newAppVersionName;
    }

    public void setNewAppVersionName(String newAppVersionName) {
        this.newAppVersionName = newAppVersionName == null ? null : newAppVersionName.trim();
    }

    public Integer getNewAppVersionCode() {
        return newAppVersionCode;
    }

    public void setNewAppVersionCode(Integer newAppVersionCode) {
        this.newAppVersionCode = newAppVersionCode;
    }

    public String getNewAppUpdateDesc() {
        return newAppUpdateDesc;
    }

    public void setNewAppUpdateDesc(String newAppUpdateDesc) {
        this.newAppUpdateDesc = newAppUpdateDesc == null ? null : newAppUpdateDesc.trim();
    }

    public Date getNewAppReleaseTime() {
        return newAppReleaseTime;
    }

    public void setNewAppReleaseTime(Date newAppReleaseTime) {
        this.newAppReleaseTime = newAppReleaseTime;
    }

    public String getNewAppUrl() {
        return newAppUrl;
    }

    public void setNewAppUrl(String newAppUrl) {
        this.newAppUrl = newAppUrl == null ? null : newAppUrl.trim();
    }

    public Integer getIsForceUpdate() {
        return isForceUpdate;
    }

    public void setIsForceUpdate(Integer isForceUpdate) {
        this.isForceUpdate = isForceUpdate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}