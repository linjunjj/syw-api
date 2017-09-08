package com.sywwifi.api.pojo;

import java.util.Date;

public class User {
    private String userId;

    private String userPhone;

    private String userName;

    private String userPassword;

    private String userRegArea;

    private Integer userBalance;

    private Date userWhenLogin;

    private Integer userLoginTime;

    private String userHeadImg;

    private Date createTime;

    private Date updateTime;

    public User(String userId, String userPhone, String userName, String userPassword, String userRegArea, Integer userBalance, Date userWhenLogin, Integer userLoginTime, String userHeadImg, Date createTime, Date updateTime) {
        this.userId = userId;
        this.userPhone = userPhone;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRegArea = userRegArea;
        this.userBalance = userBalance;
        this.userWhenLogin = userWhenLogin;
        this.userLoginTime = userLoginTime;
        this.userHeadImg = userHeadImg;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public User() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserRegArea() {
        return userRegArea;
    }

    public void setUserRegArea(String userRegArea) {
        this.userRegArea = userRegArea == null ? null : userRegArea.trim();
    }

    public Integer getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(Integer userBalance) {
        this.userBalance = userBalance;
    }

    public Date getUserWhenLogin() {
        return userWhenLogin;
    }

    public void setUserWhenLogin(Date userWhenLogin) {
        this.userWhenLogin = userWhenLogin;
    }

    public Integer getUserLoginTime() {
        return userLoginTime;
    }

    public void setUserLoginTime(Integer userLoginTime) {
        this.userLoginTime = userLoginTime;
    }

    public String getUserHeadImg() {
        return userHeadImg;
    }

    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg == null ? null : userHeadImg.trim();
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