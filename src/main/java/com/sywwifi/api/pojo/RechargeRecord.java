package com.sywwifi.api.pojo;

import java.util.Date;

public class RechargeRecord {
    private String rechargeRecordId;

    private String userId;

    private Integer day;

    private Date createTime;

    private Date updateTime;

    public RechargeRecord(String rechargeRecordId, String userId, Integer day, Date createTime, Date updateTime) {
        this.rechargeRecordId = rechargeRecordId;
        this.userId = userId;
        this.day = day;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public RechargeRecord() {
        super();
    }

    public String getRechargeRecordId() {
        return rechargeRecordId;
    }

    public void setRechargeRecordId(String rechargeRecordId) {
        this.rechargeRecordId = rechargeRecordId == null ? null : rechargeRecordId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
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