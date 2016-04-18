package com.perfect.trains.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EquipmentRepairRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentRepairRecordExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("equipmentRepairRecord.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("equipmentRepairRecord.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("equipmentRepairRecord.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("equipmentRepairRecord.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("equipmentRepairRecord.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("equipmentRepairRecord.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("equipmentRepairRecord.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("equipmentRepairRecord.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("equipmentRepairRecord.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("equipmentRepairRecord.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("equipmentRepairRecord.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("equipmentRepairRecord.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTrainIdIsNull() {
            addCriterion("equipmentRepairRecord.train_id is null");
            return (Criteria) this;
        }

        public Criteria andTrainIdIsNotNull() {
            addCriterion("equipmentRepairRecord.train_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrainIdEqualTo(Long value) {
            addCriterion("equipmentRepairRecord.train_id =", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotEqualTo(Long value) {
            addCriterion("equipmentRepairRecord.train_id <>", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThan(Long value) {
            addCriterion("equipmentRepairRecord.train_id >", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThanOrEqualTo(Long value) {
            addCriterion("equipmentRepairRecord.train_id >=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThan(Long value) {
            addCriterion("equipmentRepairRecord.train_id <", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThanOrEqualTo(Long value) {
            addCriterion("equipmentRepairRecord.train_id <=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdIn(List<Long> values) {
            addCriterion("equipmentRepairRecord.train_id in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotIn(List<Long> values) {
            addCriterion("equipmentRepairRecord.train_id not in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdBetween(Long value1, Long value2) {
            addCriterion("equipmentRepairRecord.train_id between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotBetween(Long value1, Long value2) {
            addCriterion("equipmentRepairRecord.train_id not between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNull() {
            addCriterion("equipmentRepairRecord.equipment_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNotNull() {
            addCriterion("equipmentRepairRecord.equipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdEqualTo(Long value) {
            addCriterion("equipmentRepairRecord.equipment_id =", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotEqualTo(Long value) {
            addCriterion("equipmentRepairRecord.equipment_id <>", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThan(Long value) {
            addCriterion("equipmentRepairRecord.equipment_id >", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("equipmentRepairRecord.equipment_id >=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThan(Long value) {
            addCriterion("equipmentRepairRecord.equipment_id <", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThanOrEqualTo(Long value) {
            addCriterion("equipmentRepairRecord.equipment_id <=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIn(List<Long> values) {
            addCriterion("equipmentRepairRecord.equipment_id in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotIn(List<Long> values) {
            addCriterion("equipmentRepairRecord.equipment_id not in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdBetween(Long value1, Long value2) {
            addCriterion("equipmentRepairRecord.equipment_id between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotBetween(Long value1, Long value2) {
            addCriterion("equipmentRepairRecord.equipment_id not between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andRepairDateIsNull() {
            addCriterion("equipmentRepairRecord.repair_date is null");
            return (Criteria) this;
        }

        public Criteria andRepairDateIsNotNull() {
            addCriterion("equipmentRepairRecord.repair_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepairDateEqualTo(Date value) {
            addCriterionForJDBCDate("equipmentRepairRecord.repair_date =", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("equipmentRepairRecord.repair_date <>", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateGreaterThan(Date value) {
            addCriterionForJDBCDate("equipmentRepairRecord.repair_date >", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("equipmentRepairRecord.repair_date >=", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateLessThan(Date value) {
            addCriterionForJDBCDate("equipmentRepairRecord.repair_date <", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("equipmentRepairRecord.repair_date <=", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateIn(List<Date> values) {
            addCriterionForJDBCDate("equipmentRepairRecord.repair_date in", values, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("equipmentRepairRecord.repair_date not in", values, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("equipmentRepairRecord.repair_date between", value1, value2, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("equipmentRepairRecord.repair_date not between", value1, value2, "repairDate");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("equipmentRepairRecord.`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("equipmentRepairRecord.`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("equipmentRepairRecord.`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("equipmentRepairRecord.`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("equipmentRepairRecord.`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("equipmentRepairRecord.`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("equipmentRepairRecord.`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("equipmentRepairRecord.`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andParameter1IsNull() {
            addCriterion("equipmentRepairRecord.parameter1 is null");
            return (Criteria) this;
        }

        public Criteria andParameter1IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter1 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter1EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter1 =", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter1 <>", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter1 >", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter1 >=", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter1 <", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter1 <=", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1Like(String value) {
            addCriterion("equipmentRepairRecord.parameter1 like", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter1 not like", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter1 in", values, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter1 not in", values, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter1 between", value1, value2, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter1 not between", value1, value2, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter2IsNull() {
            addCriterion("equipmentRepairRecord.parameter2 is null");
            return (Criteria) this;
        }

        public Criteria andParameter2IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter2 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter2EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter2 =", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter2 <>", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter2 >", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter2 >=", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter2 <", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter2 <=", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2Like(String value) {
            addCriterion("equipmentRepairRecord.parameter2 like", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter2 not like", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter2 in", values, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter2 not in", values, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter2 between", value1, value2, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter2 not between", value1, value2, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter3IsNull() {
            addCriterion("equipmentRepairRecord.parameter3 is null");
            return (Criteria) this;
        }

        public Criteria andParameter3IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter3 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter3EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter3 =", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter3 <>", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter3 >", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter3 >=", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter3 <", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter3 <=", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3Like(String value) {
            addCriterion("equipmentRepairRecord.parameter3 like", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter3 not like", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter3 in", values, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter3 not in", values, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter3 between", value1, value2, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter3 not between", value1, value2, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter4IsNull() {
            addCriterion("equipmentRepairRecord.parameter4 is null");
            return (Criteria) this;
        }

        public Criteria andParameter4IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter4 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter4EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter4 =", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter4 <>", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter4 >", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter4 >=", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter4 <", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter4 <=", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4Like(String value) {
            addCriterion("equipmentRepairRecord.parameter4 like", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter4 not like", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter4 in", values, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter4 not in", values, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter4 between", value1, value2, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter4 not between", value1, value2, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter5IsNull() {
            addCriterion("equipmentRepairRecord.parameter5 is null");
            return (Criteria) this;
        }

        public Criteria andParameter5IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter5 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter5EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter5 =", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter5 <>", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter5 >", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter5 >=", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter5 <", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter5 <=", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5Like(String value) {
            addCriterion("equipmentRepairRecord.parameter5 like", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter5 not like", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter5 in", values, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter5 not in", values, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter5 between", value1, value2, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter5 not between", value1, value2, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter6IsNull() {
            addCriterion("equipmentRepairRecord.parameter6 is null");
            return (Criteria) this;
        }

        public Criteria andParameter6IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter6 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter6EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter6 =", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter6 <>", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter6 >", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter6 >=", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter6 <", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter6 <=", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6Like(String value) {
            addCriterion("equipmentRepairRecord.parameter6 like", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter6 not like", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter6 in", values, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter6 not in", values, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter6 between", value1, value2, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter6 not between", value1, value2, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter7IsNull() {
            addCriterion("equipmentRepairRecord.parameter7 is null");
            return (Criteria) this;
        }

        public Criteria andParameter7IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter7 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter7EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter7 =", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter7 <>", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter7 >", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter7 >=", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter7 <", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter7 <=", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7Like(String value) {
            addCriterion("equipmentRepairRecord.parameter7 like", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter7 not like", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter7 in", values, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter7 not in", values, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter7 between", value1, value2, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter7 not between", value1, value2, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter8IsNull() {
            addCriterion("equipmentRepairRecord.parameter8 is null");
            return (Criteria) this;
        }

        public Criteria andParameter8IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter8 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter8EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter8 =", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter8 <>", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter8 >", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter8 >=", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter8 <", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter8 <=", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8Like(String value) {
            addCriterion("equipmentRepairRecord.parameter8 like", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter8 not like", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter8 in", values, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter8 not in", values, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter8 between", value1, value2, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter8 not between", value1, value2, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter9IsNull() {
            addCriterion("equipmentRepairRecord.parameter9 is null");
            return (Criteria) this;
        }

        public Criteria andParameter9IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter9 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter9EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter9 =", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter9 <>", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter9 >", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter9 >=", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter9 <", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter9 <=", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9Like(String value) {
            addCriterion("equipmentRepairRecord.parameter9 like", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter9 not like", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter9 in", values, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter9 not in", values, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter9 between", value1, value2, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter9 not between", value1, value2, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter10IsNull() {
            addCriterion("equipmentRepairRecord.parameter10 is null");
            return (Criteria) this;
        }

        public Criteria andParameter10IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter10 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter10EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter10 =", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter10 <>", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter10 >", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter10 >=", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter10 <", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter10 <=", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10Like(String value) {
            addCriterion("equipmentRepairRecord.parameter10 like", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter10 not like", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter10 in", values, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter10 not in", values, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter10 between", value1, value2, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter10 not between", value1, value2, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter11IsNull() {
            addCriterion("equipmentRepairRecord.parameter11 is null");
            return (Criteria) this;
        }

        public Criteria andParameter11IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter11 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter11EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter11 =", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter11 <>", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter11 >", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter11 >=", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter11 <", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter11 <=", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11Like(String value) {
            addCriterion("equipmentRepairRecord.parameter11 like", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter11 not like", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter11 in", values, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter11 not in", values, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter11 between", value1, value2, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter11 not between", value1, value2, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter12IsNull() {
            addCriterion("equipmentRepairRecord.parameter12 is null");
            return (Criteria) this;
        }

        public Criteria andParameter12IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter12 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter12EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter12 =", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter12 <>", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter12 >", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter12 >=", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter12 <", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter12 <=", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12Like(String value) {
            addCriterion("equipmentRepairRecord.parameter12 like", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter12 not like", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter12 in", values, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter12 not in", values, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter12 between", value1, value2, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter12 not between", value1, value2, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter13IsNull() {
            addCriterion("equipmentRepairRecord.parameter13 is null");
            return (Criteria) this;
        }

        public Criteria andParameter13IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter13 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter13EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter13 =", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter13 <>", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter13 >", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter13 >=", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter13 <", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter13 <=", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13Like(String value) {
            addCriterion("equipmentRepairRecord.parameter13 like", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter13 not like", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter13 in", values, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter13 not in", values, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter13 between", value1, value2, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter13 not between", value1, value2, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter14IsNull() {
            addCriterion("equipmentRepairRecord.parameter14 is null");
            return (Criteria) this;
        }

        public Criteria andParameter14IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter14 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter14EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter14 =", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter14 <>", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter14 >", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter14 >=", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter14 <", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter14 <=", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14Like(String value) {
            addCriterion("equipmentRepairRecord.parameter14 like", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter14 not like", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter14 in", values, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter14 not in", values, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter14 between", value1, value2, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter14 not between", value1, value2, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter15IsNull() {
            addCriterion("equipmentRepairRecord.parameter15 is null");
            return (Criteria) this;
        }

        public Criteria andParameter15IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter15 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter15EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter15 =", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter15 <>", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter15 >", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter15 >=", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter15 <", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter15 <=", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15Like(String value) {
            addCriterion("equipmentRepairRecord.parameter15 like", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter15 not like", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter15 in", values, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter15 not in", values, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter15 between", value1, value2, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter15 not between", value1, value2, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter16IsNull() {
            addCriterion("equipmentRepairRecord.parameter16 is null");
            return (Criteria) this;
        }

        public Criteria andParameter16IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter16 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter16EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter16 =", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter16 <>", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter16 >", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter16 >=", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter16 <", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter16 <=", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16Like(String value) {
            addCriterion("equipmentRepairRecord.parameter16 like", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter16 not like", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter16 in", values, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter16 not in", values, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter16 between", value1, value2, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter16 not between", value1, value2, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter17IsNull() {
            addCriterion("equipmentRepairRecord.parameter17 is null");
            return (Criteria) this;
        }

        public Criteria andParameter17IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter17 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter17EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter17 =", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter17 <>", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter17 >", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter17 >=", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter17 <", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter17 <=", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17Like(String value) {
            addCriterion("equipmentRepairRecord.parameter17 like", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter17 not like", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter17 in", values, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter17 not in", values, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter17 between", value1, value2, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter17 not between", value1, value2, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter18IsNull() {
            addCriterion("equipmentRepairRecord.parameter18 is null");
            return (Criteria) this;
        }

        public Criteria andParameter18IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter18 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter18EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter18 =", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter18 <>", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter18 >", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter18 >=", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter18 <", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter18 <=", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18Like(String value) {
            addCriterion("equipmentRepairRecord.parameter18 like", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter18 not like", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter18 in", values, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter18 not in", values, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter18 between", value1, value2, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter18 not between", value1, value2, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter19IsNull() {
            addCriterion("equipmentRepairRecord.parameter19 is null");
            return (Criteria) this;
        }

        public Criteria andParameter19IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter19 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter19EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter19 =", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter19 <>", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter19 >", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter19 >=", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter19 <", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter19 <=", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19Like(String value) {
            addCriterion("equipmentRepairRecord.parameter19 like", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter19 not like", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter19 in", values, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter19 not in", values, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter19 between", value1, value2, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter19 not between", value1, value2, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter20IsNull() {
            addCriterion("equipmentRepairRecord.parameter20 is null");
            return (Criteria) this;
        }

        public Criteria andParameter20IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter20 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter20EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter20 =", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter20 <>", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter20 >", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter20 >=", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter20 <", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter20 <=", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20Like(String value) {
            addCriterion("equipmentRepairRecord.parameter20 like", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter20 not like", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter20 in", values, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter20 not in", values, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter20 between", value1, value2, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter20 not between", value1, value2, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter21IsNull() {
            addCriterion("equipmentRepairRecord.parameter21 is null");
            return (Criteria) this;
        }

        public Criteria andParameter21IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter21 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter21EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter21 =", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter21 <>", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter21 >", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter21 >=", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter21 <", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter21 <=", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21Like(String value) {
            addCriterion("equipmentRepairRecord.parameter21 like", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter21 not like", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter21 in", values, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter21 not in", values, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter21 between", value1, value2, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter21 not between", value1, value2, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter22IsNull() {
            addCriterion("equipmentRepairRecord.parameter22 is null");
            return (Criteria) this;
        }

        public Criteria andParameter22IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter22 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter22EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter22 =", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter22 <>", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter22 >", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter22 >=", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter22 <", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter22 <=", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22Like(String value) {
            addCriterion("equipmentRepairRecord.parameter22 like", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter22 not like", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter22 in", values, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter22 not in", values, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter22 between", value1, value2, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter22 not between", value1, value2, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter23IsNull() {
            addCriterion("equipmentRepairRecord.parameter23 is null");
            return (Criteria) this;
        }

        public Criteria andParameter23IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter23 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter23EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter23 =", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter23 <>", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter23 >", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter23 >=", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter23 <", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter23 <=", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23Like(String value) {
            addCriterion("equipmentRepairRecord.parameter23 like", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter23 not like", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter23 in", values, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter23 not in", values, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter23 between", value1, value2, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter23 not between", value1, value2, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter24IsNull() {
            addCriterion("equipmentRepairRecord.parameter24 is null");
            return (Criteria) this;
        }

        public Criteria andParameter24IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter24 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter24EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter24 =", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter24 <>", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter24 >", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter24 >=", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter24 <", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter24 <=", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24Like(String value) {
            addCriterion("equipmentRepairRecord.parameter24 like", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter24 not like", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter24 in", values, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter24 not in", values, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter24 between", value1, value2, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter24 not between", value1, value2, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter25IsNull() {
            addCriterion("equipmentRepairRecord.parameter25 is null");
            return (Criteria) this;
        }

        public Criteria andParameter25IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter25 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter25EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter25 =", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter25 <>", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter25 >", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter25 >=", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter25 <", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter25 <=", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25Like(String value) {
            addCriterion("equipmentRepairRecord.parameter25 like", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter25 not like", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter25 in", values, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter25 not in", values, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter25 between", value1, value2, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter25 not between", value1, value2, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter26IsNull() {
            addCriterion("equipmentRepairRecord.parameter26 is null");
            return (Criteria) this;
        }

        public Criteria andParameter26IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter26 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter26EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter26 =", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter26 <>", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter26 >", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter26 >=", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter26 <", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter26 <=", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26Like(String value) {
            addCriterion("equipmentRepairRecord.parameter26 like", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter26 not like", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter26 in", values, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter26 not in", values, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter26 between", value1, value2, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter26 not between", value1, value2, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter27IsNull() {
            addCriterion("equipmentRepairRecord.parameter27 is null");
            return (Criteria) this;
        }

        public Criteria andParameter27IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter27 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter27EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter27 =", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter27 <>", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter27 >", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter27 >=", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter27 <", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter27 <=", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27Like(String value) {
            addCriterion("equipmentRepairRecord.parameter27 like", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter27 not like", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter27 in", values, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter27 not in", values, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter27 between", value1, value2, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter27 not between", value1, value2, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter28IsNull() {
            addCriterion("equipmentRepairRecord.parameter28 is null");
            return (Criteria) this;
        }

        public Criteria andParameter28IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter28 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter28EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter28 =", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter28 <>", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter28 >", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter28 >=", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter28 <", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter28 <=", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28Like(String value) {
            addCriterion("equipmentRepairRecord.parameter28 like", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter28 not like", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter28 in", values, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter28 not in", values, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter28 between", value1, value2, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter28 not between", value1, value2, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter29IsNull() {
            addCriterion("equipmentRepairRecord.parameter29 is null");
            return (Criteria) this;
        }

        public Criteria andParameter29IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter29 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter29EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter29 =", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter29 <>", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter29 >", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter29 >=", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter29 <", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter29 <=", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29Like(String value) {
            addCriterion("equipmentRepairRecord.parameter29 like", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter29 not like", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter29 in", values, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter29 not in", values, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter29 between", value1, value2, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter29 not between", value1, value2, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter30IsNull() {
            addCriterion("equipmentRepairRecord.parameter30 is null");
            return (Criteria) this;
        }

        public Criteria andParameter30IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter30 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter30EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter30 =", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter30 <>", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter30 >", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter30 >=", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter30 <", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter30 <=", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30Like(String value) {
            addCriterion("equipmentRepairRecord.parameter30 like", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter30 not like", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter30 in", values, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter30 not in", values, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter30 between", value1, value2, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter30 not between", value1, value2, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter31IsNull() {
            addCriterion("equipmentRepairRecord.parameter31 is null");
            return (Criteria) this;
        }

        public Criteria andParameter31IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter31 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter31EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter31 =", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter31 <>", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter31 >", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter31 >=", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter31 <", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter31 <=", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31Like(String value) {
            addCriterion("equipmentRepairRecord.parameter31 like", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter31 not like", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter31 in", values, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter31 not in", values, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter31 between", value1, value2, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter31 not between", value1, value2, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter32IsNull() {
            addCriterion("equipmentRepairRecord.parameter32 is null");
            return (Criteria) this;
        }

        public Criteria andParameter32IsNotNull() {
            addCriterion("equipmentRepairRecord.parameter32 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter32EqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter32 =", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32NotEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter32 <>", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32GreaterThan(String value) {
            addCriterion("equipmentRepairRecord.parameter32 >", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32GreaterThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter32 >=", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32LessThan(String value) {
            addCriterion("equipmentRepairRecord.parameter32 <", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32LessThanOrEqualTo(String value) {
            addCriterion("equipmentRepairRecord.parameter32 <=", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32Like(String value) {
            addCriterion("equipmentRepairRecord.parameter32 like", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32NotLike(String value) {
            addCriterion("equipmentRepairRecord.parameter32 not like", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32In(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter32 in", values, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32NotIn(List<String> values) {
            addCriterion("equipmentRepairRecord.parameter32 not in", values, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32Between(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter32 between", value1, value2, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32NotBetween(String value1, String value2) {
            addCriterion("equipmentRepairRecord.parameter32 not between", value1, value2, "parameter32");
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