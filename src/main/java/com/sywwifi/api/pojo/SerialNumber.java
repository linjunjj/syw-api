package com.sywwifi.api.pojo;

import java.util.Date;

public class SerialNumber {
    private Long id;

    private String password;

    private Integer day;

    private Integer money;

    private Integer status;

    private String type;

    private Date createTime;

    private Date updateTime;

    public SerialNumber(Long id, String password, Integer day, Integer money, Integer status, String type, Date createTime, Date updateTime) {
        this.id = id;
        this.password = password;
        this.day = day;
        this.money = money;
        this.status = status;
        this.type = type;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public SerialNumber() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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