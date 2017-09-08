package com.sywwifi.api.pojo;

import java.util.Date;

public class Gateway {
    private Integer gatewayId;

    private String gatewayName;

    private String gatewayMac;

    private Integer gatewayPage;

    private Date updateTime;

    private Date createTime;

    private String gatewayType;

    public Gateway(Integer gatewayId, String gatewayName, String gatewayMac, Integer gatewayPage, Date updateTime, Date createTime, String gatewayType) {
        this.gatewayId = gatewayId;
        this.gatewayName = gatewayName;
        this.gatewayMac = gatewayMac;
        this.gatewayPage = gatewayPage;
        this.updateTime = updateTime;
        this.createTime = createTime;
        this.gatewayType = gatewayType;
    }

    public Gateway() {
        super();
    }

    public Integer getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(Integer gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName == null ? null : gatewayName.trim();
    }

    public String getGatewayMac() {
        return gatewayMac;
    }

    public void setGatewayMac(String gatewayMac) {
        this.gatewayMac = gatewayMac == null ? null : gatewayMac.trim();
    }

    public Integer getGatewayPage() {
        return gatewayPage;
    }

    public void setGatewayPage(Integer gatewayPage) {
        this.gatewayPage = gatewayPage;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getGatewayType() {
        return gatewayType;
    }

    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType == null ? null : gatewayType.trim();
    }
}