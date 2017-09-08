package com.sywwifi.api.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andNewAppSizeIsNull() {
            addCriterion("new_app_size is null");
            return (Criteria) this;
        }

        public Criteria andNewAppSizeIsNotNull() {
            addCriterion("new_app_size is not null");
            return (Criteria) this;
        }

        public Criteria andNewAppSizeEqualTo(String value) {
            addCriterion("new_app_size =", value, "newAppSize");
            return (Criteria) this;
        }

        public Criteria andNewAppSizeNotEqualTo(String value) {
            addCriterion("new_app_size <>", value, "newAppSize");
            return (Criteria) this;
        }

        public Criteria andNewAppSizeGreaterThan(String value) {
            addCriterion("new_app_size >", value, "newAppSize");
            return (Criteria) this;
        }

        public Criteria andNewAppSizeGreaterThanOrEqualTo(String value) {
            addCriterion("new_app_size >=", value, "newAppSize");
            return (Criteria) this;
        }

        public Criteria andNewAppSizeLessThan(String value) {
            addCriterion("new_app_size <", value, "newAppSize");
            return (Criteria) this;
        }

        public Criteria andNewAppSizeLessThanOrEqualTo(String value) {
            addCriterion("new_app_size <=", value, "newAppSize");
            return (Criteria) this;
        }

        public Criteria andNewAppSizeLike(String value) {
            addCriterion("new_app_size like", value, "newAppSize");
            return (Criteria) this;
        }

        public Criteria andNewAppSizeNotLike(String value) {
            addCriterion("new_app_size not like", value, "newAppSize");
            return (Criteria) this;
        }

        public Criteria andNewAppSizeIn(List<String> values) {
            addCriterion("new_app_size in", values, "newAppSize");
            return (Criteria) this;
        }

        public Criteria andNewAppSizeNotIn(List<String> values) {
            addCriterion("new_app_size not in", values, "newAppSize");
            return (Criteria) this;
        }

        public Criteria andNewAppSizeBetween(String value1, String value2) {
            addCriterion("new_app_size between", value1, value2, "newAppSize");
            return (Criteria) this;
        }

        public Criteria andNewAppSizeNotBetween(String value1, String value2) {
            addCriterion("new_app_size not between", value1, value2, "newAppSize");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionNameIsNull() {
            addCriterion("new_app_version_name is null");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionNameIsNotNull() {
            addCriterion("new_app_version_name is not null");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionNameEqualTo(String value) {
            addCriterion("new_app_version_name =", value, "newAppVersionName");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionNameNotEqualTo(String value) {
            addCriterion("new_app_version_name <>", value, "newAppVersionName");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionNameGreaterThan(String value) {
            addCriterion("new_app_version_name >", value, "newAppVersionName");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionNameGreaterThanOrEqualTo(String value) {
            addCriterion("new_app_version_name >=", value, "newAppVersionName");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionNameLessThan(String value) {
            addCriterion("new_app_version_name <", value, "newAppVersionName");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionNameLessThanOrEqualTo(String value) {
            addCriterion("new_app_version_name <=", value, "newAppVersionName");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionNameLike(String value) {
            addCriterion("new_app_version_name like", value, "newAppVersionName");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionNameNotLike(String value) {
            addCriterion("new_app_version_name not like", value, "newAppVersionName");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionNameIn(List<String> values) {
            addCriterion("new_app_version_name in", values, "newAppVersionName");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionNameNotIn(List<String> values) {
            addCriterion("new_app_version_name not in", values, "newAppVersionName");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionNameBetween(String value1, String value2) {
            addCriterion("new_app_version_name between", value1, value2, "newAppVersionName");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionNameNotBetween(String value1, String value2) {
            addCriterion("new_app_version_name not between", value1, value2, "newAppVersionName");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionCodeIsNull() {
            addCriterion("new_app_version_code is null");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionCodeIsNotNull() {
            addCriterion("new_app_version_code is not null");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionCodeEqualTo(Integer value) {
            addCriterion("new_app_version_code =", value, "newAppVersionCode");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionCodeNotEqualTo(Integer value) {
            addCriterion("new_app_version_code <>", value, "newAppVersionCode");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionCodeGreaterThan(Integer value) {
            addCriterion("new_app_version_code >", value, "newAppVersionCode");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_app_version_code >=", value, "newAppVersionCode");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionCodeLessThan(Integer value) {
            addCriterion("new_app_version_code <", value, "newAppVersionCode");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionCodeLessThanOrEqualTo(Integer value) {
            addCriterion("new_app_version_code <=", value, "newAppVersionCode");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionCodeIn(List<Integer> values) {
            addCriterion("new_app_version_code in", values, "newAppVersionCode");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionCodeNotIn(List<Integer> values) {
            addCriterion("new_app_version_code not in", values, "newAppVersionCode");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionCodeBetween(Integer value1, Integer value2) {
            addCriterion("new_app_version_code between", value1, value2, "newAppVersionCode");
            return (Criteria) this;
        }

        public Criteria andNewAppVersionCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("new_app_version_code not between", value1, value2, "newAppVersionCode");
            return (Criteria) this;
        }

        public Criteria andNewAppUpdateDescIsNull() {
            addCriterion("new_app_update_desc is null");
            return (Criteria) this;
        }

        public Criteria andNewAppUpdateDescIsNotNull() {
            addCriterion("new_app_update_desc is not null");
            return (Criteria) this;
        }

        public Criteria andNewAppUpdateDescEqualTo(String value) {
            addCriterion("new_app_update_desc =", value, "newAppUpdateDesc");
            return (Criteria) this;
        }

        public Criteria andNewAppUpdateDescNotEqualTo(String value) {
            addCriterion("new_app_update_desc <>", value, "newAppUpdateDesc");
            return (Criteria) this;
        }

        public Criteria andNewAppUpdateDescGreaterThan(String value) {
            addCriterion("new_app_update_desc >", value, "newAppUpdateDesc");
            return (Criteria) this;
        }

        public Criteria andNewAppUpdateDescGreaterThanOrEqualTo(String value) {
            addCriterion("new_app_update_desc >=", value, "newAppUpdateDesc");
            return (Criteria) this;
        }

        public Criteria andNewAppUpdateDescLessThan(String value) {
            addCriterion("new_app_update_desc <", value, "newAppUpdateDesc");
            return (Criteria) this;
        }

        public Criteria andNewAppUpdateDescLessThanOrEqualTo(String value) {
            addCriterion("new_app_update_desc <=", value, "newAppUpdateDesc");
            return (Criteria) this;
        }

        public Criteria andNewAppUpdateDescLike(String value) {
            addCriterion("new_app_update_desc like", value, "newAppUpdateDesc");
            return (Criteria) this;
        }

        public Criteria andNewAppUpdateDescNotLike(String value) {
            addCriterion("new_app_update_desc not like", value, "newAppUpdateDesc");
            return (Criteria) this;
        }

        public Criteria andNewAppUpdateDescIn(List<String> values) {
            addCriterion("new_app_update_desc in", values, "newAppUpdateDesc");
            return (Criteria) this;
        }

        public Criteria andNewAppUpdateDescNotIn(List<String> values) {
            addCriterion("new_app_update_desc not in", values, "newAppUpdateDesc");
            return (Criteria) this;
        }

        public Criteria andNewAppUpdateDescBetween(String value1, String value2) {
            addCriterion("new_app_update_desc between", value1, value2, "newAppUpdateDesc");
            return (Criteria) this;
        }

        public Criteria andNewAppUpdateDescNotBetween(String value1, String value2) {
            addCriterion("new_app_update_desc not between", value1, value2, "newAppUpdateDesc");
            return (Criteria) this;
        }

        public Criteria andNewAppReleaseTimeIsNull() {
            addCriterion("new_app_release_time is null");
            return (Criteria) this;
        }

        public Criteria andNewAppReleaseTimeIsNotNull() {
            addCriterion("new_app_release_time is not null");
            return (Criteria) this;
        }

        public Criteria andNewAppReleaseTimeEqualTo(Date value) {
            addCriterion("new_app_release_time =", value, "newAppReleaseTime");
            return (Criteria) this;
        }

        public Criteria andNewAppReleaseTimeNotEqualTo(Date value) {
            addCriterion("new_app_release_time <>", value, "newAppReleaseTime");
            return (Criteria) this;
        }

        public Criteria andNewAppReleaseTimeGreaterThan(Date value) {
            addCriterion("new_app_release_time >", value, "newAppReleaseTime");
            return (Criteria) this;
        }

        public Criteria andNewAppReleaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("new_app_release_time >=", value, "newAppReleaseTime");
            return (Criteria) this;
        }

        public Criteria andNewAppReleaseTimeLessThan(Date value) {
            addCriterion("new_app_release_time <", value, "newAppReleaseTime");
            return (Criteria) this;
        }

        public Criteria andNewAppReleaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("new_app_release_time <=", value, "newAppReleaseTime");
            return (Criteria) this;
        }

        public Criteria andNewAppReleaseTimeIn(List<Date> values) {
            addCriterion("new_app_release_time in", values, "newAppReleaseTime");
            return (Criteria) this;
        }

        public Criteria andNewAppReleaseTimeNotIn(List<Date> values) {
            addCriterion("new_app_release_time not in", values, "newAppReleaseTime");
            return (Criteria) this;
        }

        public Criteria andNewAppReleaseTimeBetween(Date value1, Date value2) {
            addCriterion("new_app_release_time between", value1, value2, "newAppReleaseTime");
            return (Criteria) this;
        }

        public Criteria andNewAppReleaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("new_app_release_time not between", value1, value2, "newAppReleaseTime");
            return (Criteria) this;
        }

        public Criteria andNewAppUrlIsNull() {
            addCriterion("new_app_url is null");
            return (Criteria) this;
        }

        public Criteria andNewAppUrlIsNotNull() {
            addCriterion("new_app_url is not null");
            return (Criteria) this;
        }

        public Criteria andNewAppUrlEqualTo(String value) {
            addCriterion("new_app_url =", value, "newAppUrl");
            return (Criteria) this;
        }

        public Criteria andNewAppUrlNotEqualTo(String value) {
            addCriterion("new_app_url <>", value, "newAppUrl");
            return (Criteria) this;
        }

        public Criteria andNewAppUrlGreaterThan(String value) {
            addCriterion("new_app_url >", value, "newAppUrl");
            return (Criteria) this;
        }

        public Criteria andNewAppUrlGreaterThanOrEqualTo(String value) {
            addCriterion("new_app_url >=", value, "newAppUrl");
            return (Criteria) this;
        }

        public Criteria andNewAppUrlLessThan(String value) {
            addCriterion("new_app_url <", value, "newAppUrl");
            return (Criteria) this;
        }

        public Criteria andNewAppUrlLessThanOrEqualTo(String value) {
            addCriterion("new_app_url <=", value, "newAppUrl");
            return (Criteria) this;
        }

        public Criteria andNewAppUrlLike(String value) {
            addCriterion("new_app_url like", value, "newAppUrl");
            return (Criteria) this;
        }

        public Criteria andNewAppUrlNotLike(String value) {
            addCriterion("new_app_url not like", value, "newAppUrl");
            return (Criteria) this;
        }

        public Criteria andNewAppUrlIn(List<String> values) {
            addCriterion("new_app_url in", values, "newAppUrl");
            return (Criteria) this;
        }

        public Criteria andNewAppUrlNotIn(List<String> values) {
            addCriterion("new_app_url not in", values, "newAppUrl");
            return (Criteria) this;
        }

        public Criteria andNewAppUrlBetween(String value1, String value2) {
            addCriterion("new_app_url between", value1, value2, "newAppUrl");
            return (Criteria) this;
        }

        public Criteria andNewAppUrlNotBetween(String value1, String value2) {
            addCriterion("new_app_url not between", value1, value2, "newAppUrl");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdateIsNull() {
            addCriterion("is_force_update is null");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdateIsNotNull() {
            addCriterion("is_force_update is not null");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdateEqualTo(Integer value) {
            addCriterion("is_force_update =", value, "isForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdateNotEqualTo(Integer value) {
            addCriterion("is_force_update <>", value, "isForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdateGreaterThan(Integer value) {
            addCriterion("is_force_update >", value, "isForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_force_update >=", value, "isForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdateLessThan(Integer value) {
            addCriterion("is_force_update <", value, "isForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdateLessThanOrEqualTo(Integer value) {
            addCriterion("is_force_update <=", value, "isForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdateIn(List<Integer> values) {
            addCriterion("is_force_update in", values, "isForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdateNotIn(List<Integer> values) {
            addCriterion("is_force_update not in", values, "isForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdateBetween(Integer value1, Integer value2) {
            addCriterion("is_force_update between", value1, value2, "isForceUpdate");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdateNotBetween(Integer value1, Integer value2) {
            addCriterion("is_force_update not between", value1, value2, "isForceUpdate");
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