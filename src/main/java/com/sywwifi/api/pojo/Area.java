package com.sywwifi.api.pojo;

import java.util.Date;

public class Area {
    private Integer id;

    private Integer gatewayId;

    private String name;

    private Date createTime;

    private Date updateTime;

    public Area(Integer id, Integer gatewayId, String name, Date createTime, Date updateTime) {
        this.id = id;
        this.gatewayId = gatewayId;
        this.name = name;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Area() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(Integer gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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