package com.sywwifi.api.pojo;

import java.util.Date;

public class SerialRecord {
    private Long id;

    private Long serialId;

    private String userId;

    private Integer gatewayId;

    private Date createTime;

    private Date updateTime;

    public SerialRecord(Long id, Long serialId, String userId, Integer gatewayId, Date createTime, Date updateTime) {
        this.id = id;
        this.serialId = serialId;
        this.userId = userId;
        this.gatewayId = gatewayId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public SerialRecord() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSerialId() {
        return serialId;
    }

    public void setSerialId(Long serialId) {
        this.serialId = serialId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(Integer gatewayId) {
        this.gatewayId = gatewayId;
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