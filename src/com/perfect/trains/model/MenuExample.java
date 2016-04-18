package com.perfect.trains.model;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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
            addCriterion("menu.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("menu.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("menu.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("menu.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("menu.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("menu.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("menu.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("menu.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("menu.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("menu.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("menu.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("menu.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("menu.code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("menu.code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("menu.code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("menu.code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("menu.code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("menu.code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("menu.code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("menu.code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("menu.code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("menu.code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("menu.code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("menu.code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("menu.code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("menu.code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNull() {
            addCriterion("menu.parent_code is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("menu.parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("menu.parent_code =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("menu.parent_code <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("menu.parent_code >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("menu.parent_code >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("menu.parent_code <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("menu.parent_code <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("menu.parent_code like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("menu.parent_code not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("menu.parent_code in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("menu.parent_code not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("menu.parent_code between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("menu.parent_code not between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("menu.`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("menu.`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("menu.`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("menu.`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("menu.`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu.`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("menu.`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("menu.`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("menu.`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("menu.`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("menu.`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("menu.`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("menu.`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("menu.`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andControllerIsNull() {
            addCriterion("menu.controller is null");
            return (Criteria) this;
        }

        public Criteria andControllerIsNotNull() {
            addCriterion("menu.controller is not null");
            return (Criteria) this;
        }

        public Criteria andControllerEqualTo(String value) {
            addCriterion("menu.controller =", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerNotEqualTo(String value) {
            addCriterion("menu.controller <>", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerGreaterThan(String value) {
            addCriterion("menu.controller >", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerGreaterThanOrEqualTo(String value) {
            addCriterion("menu.controller >=", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerLessThan(String value) {
            addCriterion("menu.controller <", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerLessThanOrEqualTo(String value) {
            addCriterion("menu.controller <=", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerLike(String value) {
            addCriterion("menu.controller like", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerNotLike(String value) {
            addCriterion("menu.controller not like", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerIn(List<String> values) {
            addCriterion("menu.controller in", values, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerNotIn(List<String> values) {
            addCriterion("menu.controller not in", values, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerBetween(String value1, String value2) {
            addCriterion("menu.controller between", value1, value2, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerNotBetween(String value1, String value2) {
            addCriterion("menu.controller not between", value1, value2, "controller");
            return (Criteria) this;
        }

        public Criteria andViewPathIsNull() {
            addCriterion("menu.view_path is null");
            return (Criteria) this;
        }

        public Criteria andViewPathIsNotNull() {
            addCriterion("menu.view_path is not null");
            return (Criteria) this;
        }

        public Criteria andViewPathEqualTo(String value) {
            addCriterion("menu.view_path =", value, "viewPath");
            return (Criteria) this;
        }

        public Criteria andViewPathNotEqualTo(String value) {
            addCriterion("menu.view_path <>", value, "viewPath");
            return (Criteria) this;
        }

        public Criteria andViewPathGreaterThan(String value) {
            addCriterion("menu.view_path >", value, "viewPath");
            return (Criteria) this;
        }

        public Criteria andViewPathGreaterThanOrEqualTo(String value) {
            addCriterion("menu.view_path >=", value, "viewPath");
            return (Criteria) this;
        }

        public Criteria andViewPathLessThan(String value) {
            addCriterion("menu.view_path <", value, "viewPath");
            return (Criteria) this;
        }

        public Criteria andViewPathLessThanOrEqualTo(String value) {
            addCriterion("menu.view_path <=", value, "viewPath");
            return (Criteria) this;
        }

        public Criteria andViewPathLike(String value) {
            addCriterion("menu.view_path like", value, "viewPath");
            return (Criteria) this;
        }

        public Criteria andViewPathNotLike(String value) {
            addCriterion("menu.view_path not like", value, "viewPath");
            return (Criteria) this;
        }

        public Criteria andViewPathIn(List<String> values) {
            addCriterion("menu.view_path in", values, "viewPath");
            return (Criteria) this;
        }

        public Criteria andViewPathNotIn(List<String> values) {
            addCriterion("menu.view_path not in", values, "viewPath");
            return (Criteria) this;
        }

        public Criteria andViewPathBetween(String value1, String value2) {
            addCriterion("menu.view_path between", value1, value2, "viewPath");
            return (Criteria) this;
        }

        public Criteria andViewPathNotBetween(String value1, String value2) {
            addCriterion("menu.view_path not between", value1, value2, "viewPath");
            return (Criteria) this;
        }

        public Criteria andLeafIsNull() {
            addCriterion("menu.leaf is null");
            return (Criteria) this;
        }

        public Criteria andLeafIsNotNull() {
            addCriterion("menu.leaf is not null");
            return (Criteria) this;
        }

        public Criteria andLeafEqualTo(Integer value) {
            addCriterion("menu.leaf =", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotEqualTo(Integer value) {
            addCriterion("menu.leaf <>", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThan(Integer value) {
            addCriterion("menu.leaf >", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu.leaf >=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThan(Integer value) {
            addCriterion("menu.leaf <", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThanOrEqualTo(Integer value) {
            addCriterion("menu.leaf <=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafIn(List<Integer> values) {
            addCriterion("menu.leaf in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotIn(List<Integer> values) {
            addCriterion("menu.leaf not in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafBetween(Integer value1, Integer value2) {
            addCriterion("menu.leaf between", value1, value2, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotBetween(Integer value1, Integer value2) {
            addCriterion("menu.leaf not between", value1, value2, "leaf");
            return (Criteria) this;
        }

        public Criteria andActionNameIsNull() {
            addCriterion("menu.action_name is null");
            return (Criteria) this;
        }

        public Criteria andActionNameIsNotNull() {
            addCriterion("menu.action_name is not null");
            return (Criteria) this;
        }

        public Criteria andActionNameEqualTo(String value) {
            addCriterion("menu.action_name =", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotEqualTo(String value) {
            addCriterion("menu.action_name <>", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameGreaterThan(String value) {
            addCriterion("menu.action_name >", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu.action_name >=", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLessThan(String value) {
            addCriterion("menu.action_name <", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLessThanOrEqualTo(String value) {
            addCriterion("menu.action_name <=", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLike(String value) {
            addCriterion("menu.action_name like", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotLike(String value) {
            addCriterion("menu.action_name not like", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameIn(List<String> values) {
            addCriterion("menu.action_name in", values, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotIn(List<String> values) {
            addCriterion("menu.action_name not in", values, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameBetween(String value1, String value2) {
            addCriterion("menu.action_name between", value1, value2, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotBetween(String value1, String value2) {
            addCriterion("menu.action_name not between", value1, value2, "actionName");
            return (Criteria) this;
        }

        public Criteria andSortIndexIsNull() {
            addCriterion("menu.sort_index is null");
            return (Criteria) this;
        }

        public Criteria andSortIndexIsNotNull() {
            addCriterion("menu.sort_index is not null");
            return (Criteria) this;
        }

        public Criteria andSortIndexEqualTo(Integer value) {
            addCriterion("menu.sort_index =", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotEqualTo(Integer value) {
            addCriterion("menu.sort_index <>", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexGreaterThan(Integer value) {
            addCriterion("menu.sort_index >", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu.sort_index >=", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexLessThan(Integer value) {
            addCriterion("menu.sort_index <", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexLessThanOrEqualTo(Integer value) {
            addCriterion("menu.sort_index <=", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexIn(List<Integer> values) {
            addCriterion("menu.sort_index in", values, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotIn(List<Integer> values) {
            addCriterion("menu.sort_index not in", values, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexBetween(Integer value1, Integer value2) {
            addCriterion("menu.sort_index between", value1, value2, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("menu.sort_index not between", value1, value2, "sortIndex");
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