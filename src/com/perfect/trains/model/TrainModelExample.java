package com.perfect.trains.model;

import java.util.ArrayList;
import java.util.List;

public class TrainModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainModelExample() {
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
            addCriterion("trainModel.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("trainModel.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("trainModel.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("trainModel.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("trainModel.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trainModel.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("trainModel.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("trainModel.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("trainModel.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("trainModel.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("trainModel.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("trainModel.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("trainModel.`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("trainModel.`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("trainModel.`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("trainModel.`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("trainModel.`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("trainModel.`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("trainModel.`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("trainModel.`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("trainModel.`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("trainModel.`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("trainModel.`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("trainModel.`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("trainModel.`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("trainModel.`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("trainModel.`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("trainModel.`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("trainModel.`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("trainModel.`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trainModel.`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("trainModel.`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("trainModel.`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("trainModel.`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("trainModel.`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("trainModel.`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("trainModel.`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("trainModel.code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("trainModel.code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("trainModel.code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("trainModel.code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("trainModel.code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("trainModel.code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("trainModel.code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("trainModel.code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("trainModel.code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("trainModel.code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("trainModel.code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("trainModel.code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("trainModel.code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNull() {
            addCriterion("trainModel.parent_code is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("trainModel.parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("trainModel.parent_code =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("trainModel.parent_code <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("trainModel.parent_code >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parent_code >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("trainModel.parent_code <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("trainModel.parent_code <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("trainModel.parent_code like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("trainModel.parent_code not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("trainModel.parent_code in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("trainModel.parent_code not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("trainModel.parent_code between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("trainModel.parent_code not between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andLeafIsNull() {
            addCriterion("trainModel.leaf is null");
            return (Criteria) this;
        }

        public Criteria andLeafIsNotNull() {
            addCriterion("trainModel.leaf is not null");
            return (Criteria) this;
        }

        public Criteria andLeafEqualTo(Integer value) {
            addCriterion("trainModel.leaf =", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotEqualTo(Integer value) {
            addCriterion("trainModel.leaf <>", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThan(Integer value) {
            addCriterion("trainModel.leaf >", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThanOrEqualTo(Integer value) {
            addCriterion("trainModel.leaf >=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThan(Integer value) {
            addCriterion("trainModel.leaf <", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThanOrEqualTo(Integer value) {
            addCriterion("trainModel.leaf <=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafIn(List<Integer> values) {
            addCriterion("trainModel.leaf in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotIn(List<Integer> values) {
            addCriterion("trainModel.leaf not in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafBetween(Integer value1, Integer value2) {
            addCriterion("trainModel.leaf between", value1, value2, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotBetween(Integer value1, Integer value2) {
            addCriterion("trainModel.leaf not between", value1, value2, "leaf");
            return (Criteria) this;
        }

        public Criteria andSortIndexIsNull() {
            addCriterion("trainModel.sort_index is null");
            return (Criteria) this;
        }

        public Criteria andSortIndexIsNotNull() {
            addCriterion("trainModel.sort_index is not null");
            return (Criteria) this;
        }

        public Criteria andSortIndexEqualTo(Integer value) {
            addCriterion("trainModel.sort_index =", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotEqualTo(Integer value) {
            addCriterion("trainModel.sort_index <>", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexGreaterThan(Integer value) {
            addCriterion("trainModel.sort_index >", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("trainModel.sort_index >=", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexLessThan(Integer value) {
            addCriterion("trainModel.sort_index <", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexLessThanOrEqualTo(Integer value) {
            addCriterion("trainModel.sort_index <=", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexIn(List<Integer> values) {
            addCriterion("trainModel.sort_index in", values, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotIn(List<Integer> values) {
            addCriterion("trainModel.sort_index not in", values, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexBetween(Integer value1, Integer value2) {
            addCriterion("trainModel.sort_index between", value1, value2, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("trainModel.sort_index not between", value1, value2, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andParameter1IsNull() {
            addCriterion("trainModel.parameter1 is null");
            return (Criteria) this;
        }

        public Criteria andParameter1IsNotNull() {
            addCriterion("trainModel.parameter1 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter1EqualTo(String value) {
            addCriterion("trainModel.parameter1 =", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotEqualTo(String value) {
            addCriterion("trainModel.parameter1 <>", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1GreaterThan(String value) {
            addCriterion("trainModel.parameter1 >", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter1 >=", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1LessThan(String value) {
            addCriterion("trainModel.parameter1 <", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter1 <=", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1Like(String value) {
            addCriterion("trainModel.parameter1 like", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotLike(String value) {
            addCriterion("trainModel.parameter1 not like", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1In(List<String> values) {
            addCriterion("trainModel.parameter1 in", values, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotIn(List<String> values) {
            addCriterion("trainModel.parameter1 not in", values, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1Between(String value1, String value2) {
            addCriterion("trainModel.parameter1 between", value1, value2, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter1 not between", value1, value2, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter2IsNull() {
            addCriterion("trainModel.parameter2 is null");
            return (Criteria) this;
        }

        public Criteria andParameter2IsNotNull() {
            addCriterion("trainModel.parameter2 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter2EqualTo(String value) {
            addCriterion("trainModel.parameter2 =", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotEqualTo(String value) {
            addCriterion("trainModel.parameter2 <>", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2GreaterThan(String value) {
            addCriterion("trainModel.parameter2 >", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter2 >=", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2LessThan(String value) {
            addCriterion("trainModel.parameter2 <", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter2 <=", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2Like(String value) {
            addCriterion("trainModel.parameter2 like", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotLike(String value) {
            addCriterion("trainModel.parameter2 not like", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2In(List<String> values) {
            addCriterion("trainModel.parameter2 in", values, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotIn(List<String> values) {
            addCriterion("trainModel.parameter2 not in", values, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2Between(String value1, String value2) {
            addCriterion("trainModel.parameter2 between", value1, value2, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter2 not between", value1, value2, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter3IsNull() {
            addCriterion("trainModel.parameter3 is null");
            return (Criteria) this;
        }

        public Criteria andParameter3IsNotNull() {
            addCriterion("trainModel.parameter3 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter3EqualTo(String value) {
            addCriterion("trainModel.parameter3 =", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3NotEqualTo(String value) {
            addCriterion("trainModel.parameter3 <>", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3GreaterThan(String value) {
            addCriterion("trainModel.parameter3 >", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter3 >=", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3LessThan(String value) {
            addCriterion("trainModel.parameter3 <", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter3 <=", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3Like(String value) {
            addCriterion("trainModel.parameter3 like", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3NotLike(String value) {
            addCriterion("trainModel.parameter3 not like", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3In(List<String> values) {
            addCriterion("trainModel.parameter3 in", values, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3NotIn(List<String> values) {
            addCriterion("trainModel.parameter3 not in", values, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3Between(String value1, String value2) {
            addCriterion("trainModel.parameter3 between", value1, value2, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter3 not between", value1, value2, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter4IsNull() {
            addCriterion("trainModel.parameter4 is null");
            return (Criteria) this;
        }

        public Criteria andParameter4IsNotNull() {
            addCriterion("trainModel.parameter4 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter4EqualTo(String value) {
            addCriterion("trainModel.parameter4 =", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4NotEqualTo(String value) {
            addCriterion("trainModel.parameter4 <>", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4GreaterThan(String value) {
            addCriterion("trainModel.parameter4 >", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter4 >=", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4LessThan(String value) {
            addCriterion("trainModel.parameter4 <", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter4 <=", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4Like(String value) {
            addCriterion("trainModel.parameter4 like", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4NotLike(String value) {
            addCriterion("trainModel.parameter4 not like", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4In(List<String> values) {
            addCriterion("trainModel.parameter4 in", values, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4NotIn(List<String> values) {
            addCriterion("trainModel.parameter4 not in", values, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4Between(String value1, String value2) {
            addCriterion("trainModel.parameter4 between", value1, value2, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter4 not between", value1, value2, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter5IsNull() {
            addCriterion("trainModel.parameter5 is null");
            return (Criteria) this;
        }

        public Criteria andParameter5IsNotNull() {
            addCriterion("trainModel.parameter5 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter5EqualTo(String value) {
            addCriterion("trainModel.parameter5 =", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5NotEqualTo(String value) {
            addCriterion("trainModel.parameter5 <>", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5GreaterThan(String value) {
            addCriterion("trainModel.parameter5 >", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter5 >=", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5LessThan(String value) {
            addCriterion("trainModel.parameter5 <", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter5 <=", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5Like(String value) {
            addCriterion("trainModel.parameter5 like", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5NotLike(String value) {
            addCriterion("trainModel.parameter5 not like", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5In(List<String> values) {
            addCriterion("trainModel.parameter5 in", values, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5NotIn(List<String> values) {
            addCriterion("trainModel.parameter5 not in", values, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5Between(String value1, String value2) {
            addCriterion("trainModel.parameter5 between", value1, value2, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter5 not between", value1, value2, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter6IsNull() {
            addCriterion("trainModel.parameter6 is null");
            return (Criteria) this;
        }

        public Criteria andParameter6IsNotNull() {
            addCriterion("trainModel.parameter6 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter6EqualTo(String value) {
            addCriterion("trainModel.parameter6 =", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6NotEqualTo(String value) {
            addCriterion("trainModel.parameter6 <>", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6GreaterThan(String value) {
            addCriterion("trainModel.parameter6 >", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter6 >=", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6LessThan(String value) {
            addCriterion("trainModel.parameter6 <", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter6 <=", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6Like(String value) {
            addCriterion("trainModel.parameter6 like", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6NotLike(String value) {
            addCriterion("trainModel.parameter6 not like", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6In(List<String> values) {
            addCriterion("trainModel.parameter6 in", values, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6NotIn(List<String> values) {
            addCriterion("trainModel.parameter6 not in", values, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6Between(String value1, String value2) {
            addCriterion("trainModel.parameter6 between", value1, value2, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter6 not between", value1, value2, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter7IsNull() {
            addCriterion("trainModel.parameter7 is null");
            return (Criteria) this;
        }

        public Criteria andParameter7IsNotNull() {
            addCriterion("trainModel.parameter7 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter7EqualTo(String value) {
            addCriterion("trainModel.parameter7 =", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7NotEqualTo(String value) {
            addCriterion("trainModel.parameter7 <>", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7GreaterThan(String value) {
            addCriterion("trainModel.parameter7 >", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter7 >=", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7LessThan(String value) {
            addCriterion("trainModel.parameter7 <", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter7 <=", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7Like(String value) {
            addCriterion("trainModel.parameter7 like", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7NotLike(String value) {
            addCriterion("trainModel.parameter7 not like", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7In(List<String> values) {
            addCriterion("trainModel.parameter7 in", values, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7NotIn(List<String> values) {
            addCriterion("trainModel.parameter7 not in", values, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7Between(String value1, String value2) {
            addCriterion("trainModel.parameter7 between", value1, value2, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter7 not between", value1, value2, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter8IsNull() {
            addCriterion("trainModel.parameter8 is null");
            return (Criteria) this;
        }

        public Criteria andParameter8IsNotNull() {
            addCriterion("trainModel.parameter8 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter8EqualTo(String value) {
            addCriterion("trainModel.parameter8 =", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8NotEqualTo(String value) {
            addCriterion("trainModel.parameter8 <>", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8GreaterThan(String value) {
            addCriterion("trainModel.parameter8 >", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter8 >=", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8LessThan(String value) {
            addCriterion("trainModel.parameter8 <", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter8 <=", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8Like(String value) {
            addCriterion("trainModel.parameter8 like", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8NotLike(String value) {
            addCriterion("trainModel.parameter8 not like", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8In(List<String> values) {
            addCriterion("trainModel.parameter8 in", values, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8NotIn(List<String> values) {
            addCriterion("trainModel.parameter8 not in", values, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8Between(String value1, String value2) {
            addCriterion("trainModel.parameter8 between", value1, value2, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter8 not between", value1, value2, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter9IsNull() {
            addCriterion("trainModel.parameter9 is null");
            return (Criteria) this;
        }

        public Criteria andParameter9IsNotNull() {
            addCriterion("trainModel.parameter9 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter9EqualTo(String value) {
            addCriterion("trainModel.parameter9 =", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9NotEqualTo(String value) {
            addCriterion("trainModel.parameter9 <>", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9GreaterThan(String value) {
            addCriterion("trainModel.parameter9 >", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter9 >=", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9LessThan(String value) {
            addCriterion("trainModel.parameter9 <", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter9 <=", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9Like(String value) {
            addCriterion("trainModel.parameter9 like", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9NotLike(String value) {
            addCriterion("trainModel.parameter9 not like", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9In(List<String> values) {
            addCriterion("trainModel.parameter9 in", values, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9NotIn(List<String> values) {
            addCriterion("trainModel.parameter9 not in", values, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9Between(String value1, String value2) {
            addCriterion("trainModel.parameter9 between", value1, value2, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter9 not between", value1, value2, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter10IsNull() {
            addCriterion("trainModel.parameter10 is null");
            return (Criteria) this;
        }

        public Criteria andParameter10IsNotNull() {
            addCriterion("trainModel.parameter10 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter10EqualTo(String value) {
            addCriterion("trainModel.parameter10 =", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10NotEqualTo(String value) {
            addCriterion("trainModel.parameter10 <>", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10GreaterThan(String value) {
            addCriterion("trainModel.parameter10 >", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter10 >=", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10LessThan(String value) {
            addCriterion("trainModel.parameter10 <", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter10 <=", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10Like(String value) {
            addCriterion("trainModel.parameter10 like", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10NotLike(String value) {
            addCriterion("trainModel.parameter10 not like", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10In(List<String> values) {
            addCriterion("trainModel.parameter10 in", values, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10NotIn(List<String> values) {
            addCriterion("trainModel.parameter10 not in", values, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10Between(String value1, String value2) {
            addCriterion("trainModel.parameter10 between", value1, value2, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter10 not between", value1, value2, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter11IsNull() {
            addCriterion("trainModel.parameter11 is null");
            return (Criteria) this;
        }

        public Criteria andParameter11IsNotNull() {
            addCriterion("trainModel.parameter11 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter11EqualTo(String value) {
            addCriterion("trainModel.parameter11 =", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11NotEqualTo(String value) {
            addCriterion("trainModel.parameter11 <>", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11GreaterThan(String value) {
            addCriterion("trainModel.parameter11 >", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter11 >=", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11LessThan(String value) {
            addCriterion("trainModel.parameter11 <", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter11 <=", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11Like(String value) {
            addCriterion("trainModel.parameter11 like", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11NotLike(String value) {
            addCriterion("trainModel.parameter11 not like", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11In(List<String> values) {
            addCriterion("trainModel.parameter11 in", values, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11NotIn(List<String> values) {
            addCriterion("trainModel.parameter11 not in", values, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11Between(String value1, String value2) {
            addCriterion("trainModel.parameter11 between", value1, value2, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter11 not between", value1, value2, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter12IsNull() {
            addCriterion("trainModel.parameter12 is null");
            return (Criteria) this;
        }

        public Criteria andParameter12IsNotNull() {
            addCriterion("trainModel.parameter12 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter12EqualTo(String value) {
            addCriterion("trainModel.parameter12 =", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12NotEqualTo(String value) {
            addCriterion("trainModel.parameter12 <>", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12GreaterThan(String value) {
            addCriterion("trainModel.parameter12 >", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter12 >=", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12LessThan(String value) {
            addCriterion("trainModel.parameter12 <", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter12 <=", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12Like(String value) {
            addCriterion("trainModel.parameter12 like", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12NotLike(String value) {
            addCriterion("trainModel.parameter12 not like", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12In(List<String> values) {
            addCriterion("trainModel.parameter12 in", values, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12NotIn(List<String> values) {
            addCriterion("trainModel.parameter12 not in", values, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12Between(String value1, String value2) {
            addCriterion("trainModel.parameter12 between", value1, value2, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter12 not between", value1, value2, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter13IsNull() {
            addCriterion("trainModel.parameter13 is null");
            return (Criteria) this;
        }

        public Criteria andParameter13IsNotNull() {
            addCriterion("trainModel.parameter13 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter13EqualTo(String value) {
            addCriterion("trainModel.parameter13 =", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13NotEqualTo(String value) {
            addCriterion("trainModel.parameter13 <>", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13GreaterThan(String value) {
            addCriterion("trainModel.parameter13 >", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter13 >=", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13LessThan(String value) {
            addCriterion("trainModel.parameter13 <", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter13 <=", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13Like(String value) {
            addCriterion("trainModel.parameter13 like", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13NotLike(String value) {
            addCriterion("trainModel.parameter13 not like", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13In(List<String> values) {
            addCriterion("trainModel.parameter13 in", values, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13NotIn(List<String> values) {
            addCriterion("trainModel.parameter13 not in", values, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13Between(String value1, String value2) {
            addCriterion("trainModel.parameter13 between", value1, value2, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter13 not between", value1, value2, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter14IsNull() {
            addCriterion("trainModel.parameter14 is null");
            return (Criteria) this;
        }

        public Criteria andParameter14IsNotNull() {
            addCriterion("trainModel.parameter14 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter14EqualTo(String value) {
            addCriterion("trainModel.parameter14 =", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14NotEqualTo(String value) {
            addCriterion("trainModel.parameter14 <>", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14GreaterThan(String value) {
            addCriterion("trainModel.parameter14 >", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter14 >=", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14LessThan(String value) {
            addCriterion("trainModel.parameter14 <", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter14 <=", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14Like(String value) {
            addCriterion("trainModel.parameter14 like", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14NotLike(String value) {
            addCriterion("trainModel.parameter14 not like", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14In(List<String> values) {
            addCriterion("trainModel.parameter14 in", values, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14NotIn(List<String> values) {
            addCriterion("trainModel.parameter14 not in", values, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14Between(String value1, String value2) {
            addCriterion("trainModel.parameter14 between", value1, value2, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter14 not between", value1, value2, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter15IsNull() {
            addCriterion("trainModel.parameter15 is null");
            return (Criteria) this;
        }

        public Criteria andParameter15IsNotNull() {
            addCriterion("trainModel.parameter15 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter15EqualTo(String value) {
            addCriterion("trainModel.parameter15 =", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15NotEqualTo(String value) {
            addCriterion("trainModel.parameter15 <>", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15GreaterThan(String value) {
            addCriterion("trainModel.parameter15 >", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter15 >=", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15LessThan(String value) {
            addCriterion("trainModel.parameter15 <", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter15 <=", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15Like(String value) {
            addCriterion("trainModel.parameter15 like", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15NotLike(String value) {
            addCriterion("trainModel.parameter15 not like", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15In(List<String> values) {
            addCriterion("trainModel.parameter15 in", values, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15NotIn(List<String> values) {
            addCriterion("trainModel.parameter15 not in", values, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15Between(String value1, String value2) {
            addCriterion("trainModel.parameter15 between", value1, value2, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter15 not between", value1, value2, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter16IsNull() {
            addCriterion("trainModel.parameter16 is null");
            return (Criteria) this;
        }

        public Criteria andParameter16IsNotNull() {
            addCriterion("trainModel.parameter16 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter16EqualTo(String value) {
            addCriterion("trainModel.parameter16 =", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16NotEqualTo(String value) {
            addCriterion("trainModel.parameter16 <>", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16GreaterThan(String value) {
            addCriterion("trainModel.parameter16 >", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter16 >=", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16LessThan(String value) {
            addCriterion("trainModel.parameter16 <", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter16 <=", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16Like(String value) {
            addCriterion("trainModel.parameter16 like", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16NotLike(String value) {
            addCriterion("trainModel.parameter16 not like", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16In(List<String> values) {
            addCriterion("trainModel.parameter16 in", values, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16NotIn(List<String> values) {
            addCriterion("trainModel.parameter16 not in", values, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16Between(String value1, String value2) {
            addCriterion("trainModel.parameter16 between", value1, value2, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter16 not between", value1, value2, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter17IsNull() {
            addCriterion("trainModel.parameter17 is null");
            return (Criteria) this;
        }

        public Criteria andParameter17IsNotNull() {
            addCriterion("trainModel.parameter17 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter17EqualTo(String value) {
            addCriterion("trainModel.parameter17 =", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17NotEqualTo(String value) {
            addCriterion("trainModel.parameter17 <>", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17GreaterThan(String value) {
            addCriterion("trainModel.parameter17 >", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter17 >=", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17LessThan(String value) {
            addCriterion("trainModel.parameter17 <", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter17 <=", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17Like(String value) {
            addCriterion("trainModel.parameter17 like", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17NotLike(String value) {
            addCriterion("trainModel.parameter17 not like", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17In(List<String> values) {
            addCriterion("trainModel.parameter17 in", values, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17NotIn(List<String> values) {
            addCriterion("trainModel.parameter17 not in", values, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17Between(String value1, String value2) {
            addCriterion("trainModel.parameter17 between", value1, value2, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter17 not between", value1, value2, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter18IsNull() {
            addCriterion("trainModel.parameter18 is null");
            return (Criteria) this;
        }

        public Criteria andParameter18IsNotNull() {
            addCriterion("trainModel.parameter18 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter18EqualTo(String value) {
            addCriterion("trainModel.parameter18 =", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18NotEqualTo(String value) {
            addCriterion("trainModel.parameter18 <>", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18GreaterThan(String value) {
            addCriterion("trainModel.parameter18 >", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter18 >=", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18LessThan(String value) {
            addCriterion("trainModel.parameter18 <", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter18 <=", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18Like(String value) {
            addCriterion("trainModel.parameter18 like", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18NotLike(String value) {
            addCriterion("trainModel.parameter18 not like", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18In(List<String> values) {
            addCriterion("trainModel.parameter18 in", values, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18NotIn(List<String> values) {
            addCriterion("trainModel.parameter18 not in", values, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18Between(String value1, String value2) {
            addCriterion("trainModel.parameter18 between", value1, value2, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter18 not between", value1, value2, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter19IsNull() {
            addCriterion("trainModel.parameter19 is null");
            return (Criteria) this;
        }

        public Criteria andParameter19IsNotNull() {
            addCriterion("trainModel.parameter19 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter19EqualTo(String value) {
            addCriterion("trainModel.parameter19 =", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19NotEqualTo(String value) {
            addCriterion("trainModel.parameter19 <>", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19GreaterThan(String value) {
            addCriterion("trainModel.parameter19 >", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter19 >=", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19LessThan(String value) {
            addCriterion("trainModel.parameter19 <", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter19 <=", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19Like(String value) {
            addCriterion("trainModel.parameter19 like", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19NotLike(String value) {
            addCriterion("trainModel.parameter19 not like", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19In(List<String> values) {
            addCriterion("trainModel.parameter19 in", values, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19NotIn(List<String> values) {
            addCriterion("trainModel.parameter19 not in", values, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19Between(String value1, String value2) {
            addCriterion("trainModel.parameter19 between", value1, value2, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter19 not between", value1, value2, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter20IsNull() {
            addCriterion("trainModel.parameter20 is null");
            return (Criteria) this;
        }

        public Criteria andParameter20IsNotNull() {
            addCriterion("trainModel.parameter20 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter20EqualTo(String value) {
            addCriterion("trainModel.parameter20 =", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20NotEqualTo(String value) {
            addCriterion("trainModel.parameter20 <>", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20GreaterThan(String value) {
            addCriterion("trainModel.parameter20 >", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter20 >=", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20LessThan(String value) {
            addCriterion("trainModel.parameter20 <", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter20 <=", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20Like(String value) {
            addCriterion("trainModel.parameter20 like", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20NotLike(String value) {
            addCriterion("trainModel.parameter20 not like", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20In(List<String> values) {
            addCriterion("trainModel.parameter20 in", values, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20NotIn(List<String> values) {
            addCriterion("trainModel.parameter20 not in", values, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20Between(String value1, String value2) {
            addCriterion("trainModel.parameter20 between", value1, value2, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter20 not between", value1, value2, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter21IsNull() {
            addCriterion("trainModel.parameter21 is null");
            return (Criteria) this;
        }

        public Criteria andParameter21IsNotNull() {
            addCriterion("trainModel.parameter21 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter21EqualTo(String value) {
            addCriterion("trainModel.parameter21 =", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21NotEqualTo(String value) {
            addCriterion("trainModel.parameter21 <>", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21GreaterThan(String value) {
            addCriterion("trainModel.parameter21 >", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter21 >=", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21LessThan(String value) {
            addCriterion("trainModel.parameter21 <", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter21 <=", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21Like(String value) {
            addCriterion("trainModel.parameter21 like", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21NotLike(String value) {
            addCriterion("trainModel.parameter21 not like", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21In(List<String> values) {
            addCriterion("trainModel.parameter21 in", values, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21NotIn(List<String> values) {
            addCriterion("trainModel.parameter21 not in", values, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21Between(String value1, String value2) {
            addCriterion("trainModel.parameter21 between", value1, value2, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter21 not between", value1, value2, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter22IsNull() {
            addCriterion("trainModel.parameter22 is null");
            return (Criteria) this;
        }

        public Criteria andParameter22IsNotNull() {
            addCriterion("trainModel.parameter22 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter22EqualTo(String value) {
            addCriterion("trainModel.parameter22 =", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22NotEqualTo(String value) {
            addCriterion("trainModel.parameter22 <>", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22GreaterThan(String value) {
            addCriterion("trainModel.parameter22 >", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter22 >=", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22LessThan(String value) {
            addCriterion("trainModel.parameter22 <", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter22 <=", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22Like(String value) {
            addCriterion("trainModel.parameter22 like", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22NotLike(String value) {
            addCriterion("trainModel.parameter22 not like", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22In(List<String> values) {
            addCriterion("trainModel.parameter22 in", values, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22NotIn(List<String> values) {
            addCriterion("trainModel.parameter22 not in", values, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22Between(String value1, String value2) {
            addCriterion("trainModel.parameter22 between", value1, value2, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter22 not between", value1, value2, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter23IsNull() {
            addCriterion("trainModel.parameter23 is null");
            return (Criteria) this;
        }

        public Criteria andParameter23IsNotNull() {
            addCriterion("trainModel.parameter23 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter23EqualTo(String value) {
            addCriterion("trainModel.parameter23 =", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23NotEqualTo(String value) {
            addCriterion("trainModel.parameter23 <>", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23GreaterThan(String value) {
            addCriterion("trainModel.parameter23 >", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter23 >=", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23LessThan(String value) {
            addCriterion("trainModel.parameter23 <", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter23 <=", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23Like(String value) {
            addCriterion("trainModel.parameter23 like", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23NotLike(String value) {
            addCriterion("trainModel.parameter23 not like", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23In(List<String> values) {
            addCriterion("trainModel.parameter23 in", values, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23NotIn(List<String> values) {
            addCriterion("trainModel.parameter23 not in", values, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23Between(String value1, String value2) {
            addCriterion("trainModel.parameter23 between", value1, value2, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter23 not between", value1, value2, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter24IsNull() {
            addCriterion("trainModel.parameter24 is null");
            return (Criteria) this;
        }

        public Criteria andParameter24IsNotNull() {
            addCriterion("trainModel.parameter24 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter24EqualTo(String value) {
            addCriterion("trainModel.parameter24 =", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24NotEqualTo(String value) {
            addCriterion("trainModel.parameter24 <>", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24GreaterThan(String value) {
            addCriterion("trainModel.parameter24 >", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter24 >=", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24LessThan(String value) {
            addCriterion("trainModel.parameter24 <", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter24 <=", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24Like(String value) {
            addCriterion("trainModel.parameter24 like", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24NotLike(String value) {
            addCriterion("trainModel.parameter24 not like", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24In(List<String> values) {
            addCriterion("trainModel.parameter24 in", values, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24NotIn(List<String> values) {
            addCriterion("trainModel.parameter24 not in", values, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24Between(String value1, String value2) {
            addCriterion("trainModel.parameter24 between", value1, value2, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter24 not between", value1, value2, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter25IsNull() {
            addCriterion("trainModel.parameter25 is null");
            return (Criteria) this;
        }

        public Criteria andParameter25IsNotNull() {
            addCriterion("trainModel.parameter25 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter25EqualTo(String value) {
            addCriterion("trainModel.parameter25 =", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25NotEqualTo(String value) {
            addCriterion("trainModel.parameter25 <>", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25GreaterThan(String value) {
            addCriterion("trainModel.parameter25 >", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter25 >=", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25LessThan(String value) {
            addCriterion("trainModel.parameter25 <", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter25 <=", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25Like(String value) {
            addCriterion("trainModel.parameter25 like", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25NotLike(String value) {
            addCriterion("trainModel.parameter25 not like", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25In(List<String> values) {
            addCriterion("trainModel.parameter25 in", values, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25NotIn(List<String> values) {
            addCriterion("trainModel.parameter25 not in", values, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25Between(String value1, String value2) {
            addCriterion("trainModel.parameter25 between", value1, value2, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter25 not between", value1, value2, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter26IsNull() {
            addCriterion("trainModel.parameter26 is null");
            return (Criteria) this;
        }

        public Criteria andParameter26IsNotNull() {
            addCriterion("trainModel.parameter26 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter26EqualTo(String value) {
            addCriterion("trainModel.parameter26 =", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26NotEqualTo(String value) {
            addCriterion("trainModel.parameter26 <>", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26GreaterThan(String value) {
            addCriterion("trainModel.parameter26 >", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter26 >=", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26LessThan(String value) {
            addCriterion("trainModel.parameter26 <", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter26 <=", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26Like(String value) {
            addCriterion("trainModel.parameter26 like", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26NotLike(String value) {
            addCriterion("trainModel.parameter26 not like", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26In(List<String> values) {
            addCriterion("trainModel.parameter26 in", values, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26NotIn(List<String> values) {
            addCriterion("trainModel.parameter26 not in", values, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26Between(String value1, String value2) {
            addCriterion("trainModel.parameter26 between", value1, value2, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter26 not between", value1, value2, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter27IsNull() {
            addCriterion("trainModel.parameter27 is null");
            return (Criteria) this;
        }

        public Criteria andParameter27IsNotNull() {
            addCriterion("trainModel.parameter27 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter27EqualTo(String value) {
            addCriterion("trainModel.parameter27 =", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27NotEqualTo(String value) {
            addCriterion("trainModel.parameter27 <>", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27GreaterThan(String value) {
            addCriterion("trainModel.parameter27 >", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter27 >=", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27LessThan(String value) {
            addCriterion("trainModel.parameter27 <", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter27 <=", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27Like(String value) {
            addCriterion("trainModel.parameter27 like", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27NotLike(String value) {
            addCriterion("trainModel.parameter27 not like", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27In(List<String> values) {
            addCriterion("trainModel.parameter27 in", values, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27NotIn(List<String> values) {
            addCriterion("trainModel.parameter27 not in", values, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27Between(String value1, String value2) {
            addCriterion("trainModel.parameter27 between", value1, value2, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter27 not between", value1, value2, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter28IsNull() {
            addCriterion("trainModel.parameter28 is null");
            return (Criteria) this;
        }

        public Criteria andParameter28IsNotNull() {
            addCriterion("trainModel.parameter28 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter28EqualTo(String value) {
            addCriterion("trainModel.parameter28 =", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28NotEqualTo(String value) {
            addCriterion("trainModel.parameter28 <>", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28GreaterThan(String value) {
            addCriterion("trainModel.parameter28 >", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter28 >=", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28LessThan(String value) {
            addCriterion("trainModel.parameter28 <", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter28 <=", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28Like(String value) {
            addCriterion("trainModel.parameter28 like", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28NotLike(String value) {
            addCriterion("trainModel.parameter28 not like", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28In(List<String> values) {
            addCriterion("trainModel.parameter28 in", values, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28NotIn(List<String> values) {
            addCriterion("trainModel.parameter28 not in", values, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28Between(String value1, String value2) {
            addCriterion("trainModel.parameter28 between", value1, value2, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter28 not between", value1, value2, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter29IsNull() {
            addCriterion("trainModel.parameter29 is null");
            return (Criteria) this;
        }

        public Criteria andParameter29IsNotNull() {
            addCriterion("trainModel.parameter29 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter29EqualTo(String value) {
            addCriterion("trainModel.parameter29 =", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29NotEqualTo(String value) {
            addCriterion("trainModel.parameter29 <>", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29GreaterThan(String value) {
            addCriterion("trainModel.parameter29 >", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter29 >=", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29LessThan(String value) {
            addCriterion("trainModel.parameter29 <", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter29 <=", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29Like(String value) {
            addCriterion("trainModel.parameter29 like", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29NotLike(String value) {
            addCriterion("trainModel.parameter29 not like", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29In(List<String> values) {
            addCriterion("trainModel.parameter29 in", values, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29NotIn(List<String> values) {
            addCriterion("trainModel.parameter29 not in", values, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29Between(String value1, String value2) {
            addCriterion("trainModel.parameter29 between", value1, value2, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter29 not between", value1, value2, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter30IsNull() {
            addCriterion("trainModel.parameter30 is null");
            return (Criteria) this;
        }

        public Criteria andParameter30IsNotNull() {
            addCriterion("trainModel.parameter30 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter30EqualTo(String value) {
            addCriterion("trainModel.parameter30 =", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30NotEqualTo(String value) {
            addCriterion("trainModel.parameter30 <>", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30GreaterThan(String value) {
            addCriterion("trainModel.parameter30 >", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter30 >=", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30LessThan(String value) {
            addCriterion("trainModel.parameter30 <", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter30 <=", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30Like(String value) {
            addCriterion("trainModel.parameter30 like", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30NotLike(String value) {
            addCriterion("trainModel.parameter30 not like", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30In(List<String> values) {
            addCriterion("trainModel.parameter30 in", values, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30NotIn(List<String> values) {
            addCriterion("trainModel.parameter30 not in", values, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30Between(String value1, String value2) {
            addCriterion("trainModel.parameter30 between", value1, value2, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter30 not between", value1, value2, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter31IsNull() {
            addCriterion("trainModel.parameter31 is null");
            return (Criteria) this;
        }

        public Criteria andParameter31IsNotNull() {
            addCriterion("trainModel.parameter31 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter31EqualTo(String value) {
            addCriterion("trainModel.parameter31 =", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31NotEqualTo(String value) {
            addCriterion("trainModel.parameter31 <>", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31GreaterThan(String value) {
            addCriterion("trainModel.parameter31 >", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter31 >=", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31LessThan(String value) {
            addCriterion("trainModel.parameter31 <", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter31 <=", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31Like(String value) {
            addCriterion("trainModel.parameter31 like", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31NotLike(String value) {
            addCriterion("trainModel.parameter31 not like", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31In(List<String> values) {
            addCriterion("trainModel.parameter31 in", values, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31NotIn(List<String> values) {
            addCriterion("trainModel.parameter31 not in", values, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31Between(String value1, String value2) {
            addCriterion("trainModel.parameter31 between", value1, value2, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter31 not between", value1, value2, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter32IsNull() {
            addCriterion("trainModel.parameter32 is null");
            return (Criteria) this;
        }

        public Criteria andParameter32IsNotNull() {
            addCriterion("trainModel.parameter32 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter32EqualTo(String value) {
            addCriterion("trainModel.parameter32 =", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32NotEqualTo(String value) {
            addCriterion("trainModel.parameter32 <>", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32GreaterThan(String value) {
            addCriterion("trainModel.parameter32 >", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32GreaterThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter32 >=", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32LessThan(String value) {
            addCriterion("trainModel.parameter32 <", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32LessThanOrEqualTo(String value) {
            addCriterion("trainModel.parameter32 <=", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32Like(String value) {
            addCriterion("trainModel.parameter32 like", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32NotLike(String value) {
            addCriterion("trainModel.parameter32 not like", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32In(List<String> values) {
            addCriterion("trainModel.parameter32 in", values, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32NotIn(List<String> values) {
            addCriterion("trainModel.parameter32 not in", values, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32Between(String value1, String value2) {
            addCriterion("trainModel.parameter32 between", value1, value2, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32NotBetween(String value1, String value2) {
            addCriterion("trainModel.parameter32 not between", value1, value2, "parameter32");
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