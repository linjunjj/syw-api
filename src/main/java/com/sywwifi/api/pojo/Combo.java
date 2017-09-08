package com.sywwifi.api.pojo;

import java.util.Date;

public class Combo {
    private Integer comboId;

    private Integer comboLong;

    private Integer comboAmount;

    private String comboDescription;

    private Date createTime;

    private Date updateTime;

    public Combo(Integer comboId, Integer comboLong, Integer comboAmount, String comboDescription, Date createTime, Date updateTime) {
        this.comboId = comboId;
        this.comboLong = comboLong;
        this.comboAmount = comboAmount;
        this.comboDescription = comboDescription;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Combo() {
        super();
    }

    public Integer getComboId() {
        return comboId;
    }

    public void setComboId(Integer comboId) {
        this.comboId = comboId;
    }

    public Integer getComboLong() {
        return comboLong;
    }

    public void setComboLong(Integer comboLong) {
        this.comboLong = comboLong;
    }

    public Integer getComboAmount() {
        return comboAmount;
    }

    public void setComboAmount(Integer comboAmount) {
        this.comboAmount = comboAmount;
    }

    public String getComboDescription() {
        return comboDescription;
    }

    public void setComboDescription(String comboDescription) {
        this.comboDescription = comboDescription == null ? null : comboDescription.trim();
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