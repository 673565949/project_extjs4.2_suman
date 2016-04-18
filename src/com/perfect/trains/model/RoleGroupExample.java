package com.perfect.trains.model;

import java.util.ArrayList;
import java.util.List;

public class RoleGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleGroupExample() {
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
            addCriterion("rolegroup.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("rolegroup.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("rolegroup.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("rolegroup.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("rolegroup.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rolegroup.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("rolegroup.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("rolegroup.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("rolegroup.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("rolegroup.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("rolegroup.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("rolegroup.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("rolegroup.`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("rolegroup.`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("rolegroup.`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("rolegroup.`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("rolegroup.`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("rolegroup.`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("rolegroup.`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("rolegroup.`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("rolegroup.`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("rolegroup.`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("rolegroup.`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("rolegroup.`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("rolegroup.`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("rolegroup.`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLeafIsNull() {
            addCriterion("rolegroup.leaf is null");
            return (Criteria) this;
        }

        public Criteria andLeafIsNotNull() {
            addCriterion("rolegroup.leaf is not null");
            return (Criteria) this;
        }

        public Criteria andLeafEqualTo(Integer value) {
            addCriterion("rolegroup.leaf =", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotEqualTo(Integer value) {
            addCriterion("rolegroup.leaf <>", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThan(Integer value) {
            addCriterion("rolegroup.leaf >", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThanOrEqualTo(Integer value) {
            addCriterion("rolegroup.leaf >=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThan(Integer value) {
            addCriterion("rolegroup.leaf <", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThanOrEqualTo(Integer value) {
            addCriterion("rolegroup.leaf <=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafIn(List<Integer> values) {
            addCriterion("rolegroup.leaf in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotIn(List<Integer> values) {
            addCriterion("rolegroup.leaf not in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafBetween(Integer value1, Integer value2) {
            addCriterion("rolegroup.leaf between", value1, value2, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotBetween(Integer value1, Integer value2) {
            addCriterion("rolegroup.leaf not between", value1, value2, "leaf");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("rolegroup.code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("rolegroup.code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("rolegroup.code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("rolegroup.code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("rolegroup.code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("rolegroup.code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("rolegroup.code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("rolegroup.code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("rolegroup.code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("rolegroup.code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("rolegroup.code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("rolegroup.code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("rolegroup.code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("rolegroup.code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNull() {
            addCriterion("rolegroup.parent_code is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("rolegroup.parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("rolegroup.parent_code =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("rolegroup.parent_code <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("rolegroup.parent_code >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("rolegroup.parent_code >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("rolegroup.parent_code <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("rolegroup.parent_code <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("rolegroup.parent_code like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("rolegroup.parent_code not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("rolegroup.parent_code in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("rolegroup.parent_code not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("rolegroup.parent_code between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("rolegroup.parent_code not between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andSortIndexIsNull() {
            addCriterion("rolegroup.sort_index is null");
            return (Criteria) this;
        }

        public Criteria andSortIndexIsNotNull() {
            addCriterion("rolegroup.sort_index is not null");
            return (Criteria) this;
        }

        public Criteria andSortIndexEqualTo(Integer value) {
            addCriterion("rolegroup.sort_index =", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotEqualTo(Integer value) {
            addCriterion("rolegroup.sort_index <>", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexGreaterThan(Integer value) {
            addCriterion("rolegroup.sort_index >", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("rolegroup.sort_index >=", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexLessThan(Integer value) {
            addCriterion("rolegroup.sort_index <", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexLessThanOrEqualTo(Integer value) {
            addCriterion("rolegroup.sort_index <=", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexIn(List<Integer> values) {
            addCriterion("rolegroup.sort_index in", values, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotIn(List<Integer> values) {
            addCriterion("rolegroup.sort_index not in", values, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexBetween(Integer value1, Integer value2) {
            addCriterion("rolegroup.sort_index between", value1, value2, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("rolegroup.sort_index not between", value1, value2, "sortIndex");
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