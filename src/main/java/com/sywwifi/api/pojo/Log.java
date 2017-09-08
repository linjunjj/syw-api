package com.sywwifi.api.pojo;

import java.util.Date;

public class Log {
    private String loginLogId;

    private String userId;

    private String area;

    private String action;

    private Date createTime;

    private Date updateTime;

    public Log(String loginLogId, String userId, String area, String action, Date createTime, Date updateTime) {
        this.loginLogId = loginLogId;
        this.userId = userId;
        this.area = area;
        this.action = action;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Log() {
        super();
    }

    public String getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(String loginLogId) {
        this.loginLogId = loginLogId == null ? null : loginLogId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
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