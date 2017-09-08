package com.sywwifi.api.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserRegAreaIsNull() {
            addCriterion("user_reg_area is null");
            return (Criteria) this;
        }

        public Criteria andUserRegAreaIsNotNull() {
            addCriterion("user_reg_area is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegAreaEqualTo(String value) {
            addCriterion("user_reg_area =", value, "userRegArea");
            return (Criteria) this;
        }

        public Criteria andUserRegAreaNotEqualTo(String value) {
            addCriterion("user_reg_area <>", value, "userRegArea");
            return (Criteria) this;
        }

        public Criteria andUserRegAreaGreaterThan(String value) {
            addCriterion("user_reg_area >", value, "userRegArea");
            return (Criteria) this;
        }

        public Criteria andUserRegAreaGreaterThanOrEqualTo(String value) {
            addCriterion("user_reg_area >=", value, "userRegArea");
            return (Criteria) this;
        }

        public Criteria andUserRegAreaLessThan(String value) {
            addCriterion("user_reg_area <", value, "userRegArea");
            return (Criteria) this;
        }

        public Criteria andUserRegAreaLessThanOrEqualTo(String value) {
            addCriterion("user_reg_area <=", value, "userRegArea");
            return (Criteria) this;
        }

        public Criteria andUserRegAreaLike(String value) {
            addCriterion("user_reg_area like", value, "userRegArea");
            return (Criteria) this;
        }

        public Criteria andUserRegAreaNotLike(String value) {
            addCriterion("user_reg_area not like", value, "userRegArea");
            return (Criteria) this;
        }

        public Criteria andUserRegAreaIn(List<String> values) {
            addCriterion("user_reg_area in", values, "userRegArea");
            return (Criteria) this;
        }

        public Criteria andUserRegAreaNotIn(List<String> values) {
            addCriterion("user_reg_area not in", values, "userRegArea");
            return (Criteria) this;
        }

        public Criteria andUserRegAreaBetween(String value1, String value2) {
            addCriterion("user_reg_area between", value1, value2, "userRegArea");
            return (Criteria) this;
        }

        public Criteria andUserRegAreaNotBetween(String value1, String value2) {
            addCriterion("user_reg_area not between", value1, value2, "userRegArea");
            return (Criteria) this;
        }

        public Criteria andUserBalanceIsNull() {
            addCriterion("user_balance is null");
            return (Criteria) this;
        }

        public Criteria andUserBalanceIsNotNull() {
            addCriterion("user_balance is not null");
            return (Criteria) this;
        }

        public Criteria andUserBalanceEqualTo(Integer value) {
            addCriterion("user_balance =", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceNotEqualTo(Integer value) {
            addCriterion("user_balance <>", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceGreaterThan(Integer value) {
            addCriterion("user_balance >", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_balance >=", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceLessThan(Integer value) {
            addCriterion("user_balance <", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("user_balance <=", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceIn(List<Integer> values) {
            addCriterion("user_balance in", values, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceNotIn(List<Integer> values) {
            addCriterion("user_balance not in", values, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceBetween(Integer value1, Integer value2) {
            addCriterion("user_balance between", value1, value2, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("user_balance not between", value1, value2, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserWhenLoginIsNull() {
            addCriterion("user_when_login is null");
            return (Criteria) this;
        }

        public Criteria andUserWhenLoginIsNotNull() {
            addCriterion("user_when_login is not null");
            return (Criteria) this;
        }

        public Criteria andUserWhenLoginEqualTo(Date value) {
            addCriterion("user_when_login =", value, "userWhenLogin");
            return (Criteria) this;
        }

        public Criteria andUserWhenLoginNotEqualTo(Date value) {
            addCriterion("user_when_login <>", value, "userWhenLogin");
            return (Criteria) this;
        }

        public Criteria andUserWhenLoginGreaterThan(Date value) {
            addCriterion("user_when_login >", value, "userWhenLogin");
            return (Criteria) this;
        }

        public Criteria andUserWhenLoginGreaterThanOrEqualTo(Date value) {
            addCriterion("user_when_login >=", value, "userWhenLogin");
            return (Criteria) this;
        }

        public Criteria andUserWhenLoginLessThan(Date value) {
            addCriterion("user_when_login <", value, "userWhenLogin");
            return (Criteria) this;
        }

        public Criteria andUserWhenLoginLessThanOrEqualTo(Date value) {
            addCriterion("user_when_login <=", value, "userWhenLogin");
            return (Criteria) this;
        }

        public Criteria andUserWhenLoginIn(List<Date> values) {
            addCriterion("user_when_login in", values, "userWhenLogin");
            return (Criteria) this;
        }

        public Criteria andUserWhenLoginNotIn(List<Date> values) {
            addCriterion("user_when_login not in", values, "userWhenLogin");
            return (Criteria) this;
        }

        public Criteria andUserWhenLoginBetween(Date value1, Date value2) {
            addCriterion("user_when_login between", value1, value2, "userWhenLogin");
            return (Criteria) this;
        }

        public Criteria andUserWhenLoginNotBetween(Date value1, Date value2) {
            addCriterion("user_when_login not between", value1, value2, "userWhenLogin");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIsNull() {
            addCriterion("user_login_time is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIsNotNull() {
            addCriterion("user_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeEqualTo(Integer value) {
            addCriterion("user_login_time =", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotEqualTo(Integer value) {
            addCriterion("user_login_time <>", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeGreaterThan(Integer value) {
            addCriterion("user_login_time >", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_login_time >=", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeLessThan(Integer value) {
            addCriterion("user_login_time <", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeLessThanOrEqualTo(Integer value) {
            addCriterion("user_login_time <=", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIn(List<Integer> values) {
            addCriterion("user_login_time in", values, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotIn(List<Integer> values) {
            addCriterion("user_login_time not in", values, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeBetween(Integer value1, Integer value2) {
            addCriterion("user_login_time between", value1, value2, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_login_time not between", value1, value2, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgIsNull() {
            addCriterion("user_head_img is null");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgIsNotNull() {
            addCriterion("user_head_img is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgEqualTo(String value) {
            addCriterion("user_head_img =", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgNotEqualTo(String value) {
            addCriterion("user_head_img <>", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgGreaterThan(String value) {
            addCriterion("user_head_img >", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgGreaterThanOrEqualTo(String value) {
            addCriterion("user_head_img >=", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgLessThan(String value) {
            addCriterion("user_head_img <", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgLessThanOrEqualTo(String value) {
            addCriterion("user_head_img <=", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgLike(String value) {
            addCriterion("user_head_img like", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgNotLike(String value) {
            addCriterion("user_head_img not like", value, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgIn(List<String> values) {
            addCriterion("user_head_img in", values, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgNotIn(List<String> values) {
            addCriterion("user_head_img not in", values, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgBetween(String value1, String value2) {
            addCriterion("user_head_img between", value1, value2, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgNotBetween(String value1, String value2) {
            addCriterion("user_head_img not between", value1, value2, "userHeadImg");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}