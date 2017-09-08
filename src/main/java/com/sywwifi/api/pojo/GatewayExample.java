package com.sywwifi.api.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GatewayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GatewayExample() {
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

        public Criteria andGatewayIdIsNull() {
            addCriterion("gateway_id is null");
            return (Criteria) this;
        }

        public Criteria andGatewayIdIsNotNull() {
            addCriterion("gateway_id is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayIdEqualTo(Integer value) {
            addCriterion("gateway_id =", value, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdNotEqualTo(Integer value) {
            addCriterion("gateway_id <>", value, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdGreaterThan(Integer value) {
            addCriterion("gateway_id >", value, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gateway_id >=", value, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdLessThan(Integer value) {
            addCriterion("gateway_id <", value, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdLessThanOrEqualTo(Integer value) {
            addCriterion("gateway_id <=", value, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdIn(List<Integer> values) {
            addCriterion("gateway_id in", values, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdNotIn(List<Integer> values) {
            addCriterion("gateway_id not in", values, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdBetween(Integer value1, Integer value2) {
            addCriterion("gateway_id between", value1, value2, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gateway_id not between", value1, value2, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayNameIsNull() {
            addCriterion("gateway_name is null");
            return (Criteria) this;
        }

        public Criteria andGatewayNameIsNotNull() {
            addCriterion("gateway_name is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayNameEqualTo(String value) {
            addCriterion("gateway_name =", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameNotEqualTo(String value) {
            addCriterion("gateway_name <>", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameGreaterThan(String value) {
            addCriterion("gateway_name >", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_name >=", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameLessThan(String value) {
            addCriterion("gateway_name <", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameLessThanOrEqualTo(String value) {
            addCriterion("gateway_name <=", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameLike(String value) {
            addCriterion("gateway_name like", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameNotLike(String value) {
            addCriterion("gateway_name not like", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameIn(List<String> values) {
            addCriterion("gateway_name in", values, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameNotIn(List<String> values) {
            addCriterion("gateway_name not in", values, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameBetween(String value1, String value2) {
            addCriterion("gateway_name between", value1, value2, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameNotBetween(String value1, String value2) {
            addCriterion("gateway_name not between", value1, value2, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayMacIsNull() {
            addCriterion("gateway_mac is null");
            return (Criteria) this;
        }

        public Criteria andGatewayMacIsNotNull() {
            addCriterion("gateway_mac is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayMacEqualTo(String value) {
            addCriterion("gateway_mac =", value, "gatewayMac");
            return (Criteria) this;
        }

        public Criteria andGatewayMacNotEqualTo(String value) {
            addCriterion("gateway_mac <>", value, "gatewayMac");
            return (Criteria) this;
        }

        public Criteria andGatewayMacGreaterThan(String value) {
            addCriterion("gateway_mac >", value, "gatewayMac");
            return (Criteria) this;
        }

        public Criteria andGatewayMacGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_mac >=", value, "gatewayMac");
            return (Criteria) this;
        }

        public Criteria andGatewayMacLessThan(String value) {
            addCriterion("gateway_mac <", value, "gatewayMac");
            return (Criteria) this;
        }

        public Criteria andGatewayMacLessThanOrEqualTo(String value) {
            addCriterion("gateway_mac <=", value, "gatewayMac");
            return (Criteria) this;
        }

        public Criteria andGatewayMacLike(String value) {
            addCriterion("gateway_mac like", value, "gatewayMac");
            return (Criteria) this;
        }

        public Criteria andGatewayMacNotLike(String value) {
            addCriterion("gateway_mac not like", value, "gatewayMac");
            return (Criteria) this;
        }

        public Criteria andGatewayMacIn(List<String> values) {
            addCriterion("gateway_mac in", values, "gatewayMac");
            return (Criteria) this;
        }

        public Criteria andGatewayMacNotIn(List<String> values) {
            addCriterion("gateway_mac not in", values, "gatewayMac");
            return (Criteria) this;
        }

        public Criteria andGatewayMacBetween(String value1, String value2) {
            addCriterion("gateway_mac between", value1, value2, "gatewayMac");
            return (Criteria) this;
        }

        public Criteria andGatewayMacNotBetween(String value1, String value2) {
            addCriterion("gateway_mac not between", value1, value2, "gatewayMac");
            return (Criteria) this;
        }

        public Criteria andGatewayPageIsNull() {
            addCriterion("gateway_page is null");
            return (Criteria) this;
        }

        public Criteria andGatewayPageIsNotNull() {
            addCriterion("gateway_page is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayPageEqualTo(Integer value) {
            addCriterion("gateway_page =", value, "gatewayPage");
            return (Criteria) this;
        }

        public Criteria andGatewayPageNotEqualTo(Integer value) {
            addCriterion("gateway_page <>", value, "gatewayPage");
            return (Criteria) this;
        }

        public Criteria andGatewayPageGreaterThan(Integer value) {
            addCriterion("gateway_page >", value, "gatewayPage");
            return (Criteria) this;
        }

        public Criteria andGatewayPageGreaterThanOrEqualTo(Integer value) {
            addCriterion("gateway_page >=", value, "gatewayPage");
            return (Criteria) this;
        }

        public Criteria andGatewayPageLessThan(Integer value) {
            addCriterion("gateway_page <", value, "gatewayPage");
            return (Criteria) this;
        }

        public Criteria andGatewayPageLessThanOrEqualTo(Integer value) {
            addCriterion("gateway_page <=", value, "gatewayPage");
            return (Criteria) this;
        }

        public Criteria andGatewayPageIn(List<Integer> values) {
            addCriterion("gateway_page in", values, "gatewayPage");
            return (Criteria) this;
        }

        public Criteria andGatewayPageNotIn(List<Integer> values) {
            addCriterion("gateway_page not in", values, "gatewayPage");
            return (Criteria) this;
        }

        public Criteria andGatewayPageBetween(Integer value1, Integer value2) {
            addCriterion("gateway_page between", value1, value2, "gatewayPage");
            return (Criteria) this;
        }

        public Criteria andGatewayPageNotBetween(Integer value1, Integer value2) {
            addCriterion("gateway_page not between", value1, value2, "gatewayPage");
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

        public Criteria andGatewayTypeIsNull() {
            addCriterion("gateway_type is null");
            return (Criteria) this;
        }

        public Criteria andGatewayTypeIsNotNull() {
            addCriterion("gateway_type is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayTypeEqualTo(String value) {
            addCriterion("gateway_type =", value, "gatewayType");
            return (Criteria) this;
        }

        public Criteria andGatewayTypeNotEqualTo(String value) {
            addCriterion("gateway_type <>", value, "gatewayType");
            return (Criteria) this;
        }

        public Criteria andGatewayTypeGreaterThan(String value) {
            addCriterion("gateway_type >", value, "gatewayType");
            return (Criteria) this;
        }

        public Criteria andGatewayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_type >=", value, "gatewayType");
            return (Criteria) this;
        }

        public Criteria andGatewayTypeLessThan(String value) {
            addCriterion("gateway_type <", value, "gatewayType");
            return (Criteria) this;
        }

        public Criteria andGatewayTypeLessThanOrEqualTo(String value) {
            addCriterion("gateway_type <=", value, "gatewayType");
            return (Criteria) this;
        }

        public Criteria andGatewayTypeLike(String value) {
            addCriterion("gateway_type like", value, "gatewayType");
            return (Criteria) this;
        }

        public Criteria andGatewayTypeNotLike(String value) {
            addCriterion("gateway_type not like", value, "gatewayType");
            return (Criteria) this;
        }

        public Criteria andGatewayTypeIn(List<String> values) {
            addCriterion("gateway_type in", values, "gatewayType");
            return (Criteria) this;
        }

        public Criteria andGatewayTypeNotIn(List<String> values) {
            addCriterion("gateway_type not in", values, "gatewayType");
            return (Criteria) this;
        }

        public Criteria andGatewayTypeBetween(String value1, String value2) {
            addCriterion("gateway_type between", value1, value2, "gatewayType");
            return (Criteria) this;
        }

        public Criteria andGatewayTypeNotBetween(String value1, String value2) {
            addCriterion("gateway_type not between", value1, value2, "gatewayType");
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