package com.perfect.trains.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TrainEquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainEquipmentExample() {
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
            addCriterion("trainEquipment.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("trainEquipment.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("trainEquipment.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("trainEquipment.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("trainEquipment.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trainEquipment.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("trainEquipment.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("trainEquipment.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("trainEquipment.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("trainEquipment.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("trainEquipment.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("trainEquipment.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdIsNull() {
            addCriterion("trainEquipment.equipment_classification_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdIsNotNull() {
            addCriterion("trainEquipment.equipment_classification_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_classification_id =", value, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdNotEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_classification_id <>", value, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdGreaterThan(Long value) {
            addCriterion("trainEquipment.equipment_classification_id >", value, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_classification_id >=", value, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdLessThan(Long value) {
            addCriterion("trainEquipment.equipment_classification_id <", value, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdLessThanOrEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_classification_id <=", value, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdIn(List<Long> values) {
            addCriterion("trainEquipment.equipment_classification_id in", values, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdNotIn(List<Long> values) {
            addCriterion("trainEquipment.equipment_classification_id not in", values, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdBetween(Long value1, Long value2) {
            addCriterion("trainEquipment.equipment_classification_id between", value1, value2, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdNotBetween(Long value1, Long value2) {
            addCriterion("trainEquipment.equipment_classification_id not between", value1, value2, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andTrainIdIsNull() {
            addCriterion("trainEquipment.train_id is null");
            return (Criteria) this;
        }

        public Criteria andTrainIdIsNotNull() {
            addCriterion("trainEquipment.train_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrainIdEqualTo(Long value) {
            addCriterion("trainEquipment.train_id =", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotEqualTo(Long value) {
            addCriterion("trainEquipment.train_id <>", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThan(Long value) {
            addCriterion("trainEquipment.train_id >", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trainEquipment.train_id >=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThan(Long value) {
            addCriterion("trainEquipment.train_id <", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThanOrEqualTo(Long value) {
            addCriterion("trainEquipment.train_id <=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdIn(List<Long> values) {
            addCriterion("trainEquipment.train_id in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotIn(List<Long> values) {
            addCriterion("trainEquipment.train_id not in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdBetween(Long value1, Long value2) {
            addCriterion("trainEquipment.train_id between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotBetween(Long value1, Long value2) {
            addCriterion("trainEquipment.train_id not between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNull() {
            addCriterion("trainEquipment.equipment_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNotNull() {
            addCriterion("trainEquipment.equipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_id =", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_id <>", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThan(Long value) {
            addCriterion("trainEquipment.equipment_id >", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_id >=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThan(Long value) {
            addCriterion("trainEquipment.equipment_id <", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThanOrEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_id <=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIn(List<Long> values) {
            addCriterion("trainEquipment.equipment_id in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotIn(List<Long> values) {
            addCriterion("trainEquipment.equipment_id not in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdBetween(Long value1, Long value2) {
            addCriterion("trainEquipment.equipment_id between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotBetween(Long value1, Long value2) {
            addCriterion("trainEquipment.equipment_id not between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andUpDateIsNull() {
            addCriterion("trainEquipment.up_date is null");
            return (Criteria) this;
        }

        public Criteria andUpDateIsNotNull() {
            addCriterion("trainEquipment.up_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpDateEqualTo(Date value) {
            addCriterionForJDBCDate("trainEquipment.up_date =", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("trainEquipment.up_date <>", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateGreaterThan(Date value) {
            addCriterionForJDBCDate("trainEquipment.up_date >", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trainEquipment.up_date >=", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateLessThan(Date value) {
            addCriterionForJDBCDate("trainEquipment.up_date <", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trainEquipment.up_date <=", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateIn(List<Date> values) {
            addCriterionForJDBCDate("trainEquipment.up_date in", values, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("trainEquipment.up_date not in", values, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trainEquipment.up_date between", value1, value2, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trainEquipment.up_date not between", value1, value2, "upDate");
            return (Criteria) this;
        }

        public Criteria andPluginTypeIsNull() {
            addCriterion("trainEquipment.plugin_Type is null");
            return (Criteria) this;
        }

        public Criteria andPluginTypeIsNotNull() {
            addCriterion("trainEquipment.plugin_Type is not null");
            return (Criteria) this;
        }

        public Criteria andPluginTypeEqualTo(String value) {
            addCriterion("trainEquipment.plugin_Type =", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeNotEqualTo(String value) {
            addCriterion("trainEquipment.plugin_Type <>", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeGreaterThan(String value) {
            addCriterion("trainEquipment.plugin_Type >", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeGreaterThanOrEqualTo(String value) {
            addCriterion("trainEquipment.plugin_Type >=", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeLessThan(String value) {
            addCriterion("trainEquipment.plugin_Type <", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeLessThanOrEqualTo(String value) {
            addCriterion("trainEquipment.plugin_Type <=", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeLike(String value) {
            addCriterion("trainEquipment.plugin_Type like", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeNotLike(String value) {
            addCriterion("trainEquipment.plugin_Type not like", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeIn(List<String> values) {
            addCriterion("trainEquipment.plugin_Type in", values, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeNotIn(List<String> values) {
            addCriterion("trainEquipment.plugin_Type not in", values, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeBetween(String value1, String value2) {
            addCriterion("trainEquipment.plugin_Type between", value1, value2, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeNotBetween(String value1, String value2) {
            addCriterion("trainEquipment.plugin_Type not between", value1, value2, "pluginType");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentClassificationIdIsNull() {
            addCriterion("trainEquipment.equipment_parent_classification_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentClassificationIdIsNotNull() {
            addCriterion("trainEquipment.equipment_parent_classification_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentClassificationIdEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_parent_classification_id =", value, "equipmentParentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentClassificationIdNotEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_parent_classification_id <>", value, "equipmentParentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentClassificationIdGreaterThan(Long value) {
            addCriterion("trainEquipment.equipment_parent_classification_id >", value, "equipmentParentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentClassificationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_parent_classification_id >=", value, "equipmentParentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentClassificationIdLessThan(Long value) {
            addCriterion("trainEquipment.equipment_parent_classification_id <", value, "equipmentParentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentClassificationIdLessThanOrEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_parent_classification_id <=", value, "equipmentParentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentClassificationIdIn(List<Long> values) {
            addCriterion("trainEquipment.equipment_parent_classification_id in", values, "equipmentParentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentClassificationIdNotIn(List<Long> values) {
            addCriterion("trainEquipment.equipment_parent_classification_id not in", values, "equipmentParentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentClassificationIdBetween(Long value1, Long value2) {
            addCriterion("trainEquipment.equipment_parent_classification_id between", value1, value2, "equipmentParentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentClassificationIdNotBetween(Long value1, Long value2) {
            addCriterion("trainEquipment.equipment_parent_classification_id not between", value1, value2, "equipmentParentClassificationId");
            return (Criteria) this;
        }

        public Criteria andParentPluginTypeIsNull() {
            addCriterion("trainEquipment.parent_plugin_Type is null");
            return (Criteria) this;
        }

        public Criteria andParentPluginTypeIsNotNull() {
            addCriterion("trainEquipment.parent_plugin_Type is not null");
            return (Criteria) this;
        }

        public Criteria andParentPluginTypeEqualTo(String value) {
            addCriterion("trainEquipment.parent_plugin_Type =", value, "parentPluginType");
            return (Criteria) this;
        }

        public Criteria andParentPluginTypeNotEqualTo(String value) {
            addCriterion("trainEquipment.parent_plugin_Type <>", value, "parentPluginType");
            return (Criteria) this;
        }

        public Criteria andParentPluginTypeGreaterThan(String value) {
            addCriterion("trainEquipment.parent_plugin_Type >", value, "parentPluginType");
            return (Criteria) this;
        }

        public Criteria andParentPluginTypeGreaterThanOrEqualTo(String value) {
            addCriterion("trainEquipment.parent_plugin_Type >=", value, "parentPluginType");
            return (Criteria) this;
        }

        public Criteria andParentPluginTypeLessThan(String value) {
            addCriterion("trainEquipment.parent_plugin_Type <", value, "parentPluginType");
            return (Criteria) this;
        }

        public Criteria andParentPluginTypeLessThanOrEqualTo(String value) {
            addCriterion("trainEquipment.parent_plugin_Type <=", value, "parentPluginType");
            return (Criteria) this;
        }

        public Criteria andParentPluginTypeLike(String value) {
            addCriterion("trainEquipment.parent_plugin_Type like", value, "parentPluginType");
            return (Criteria) this;
        }

        public Criteria andParentPluginTypeNotLike(String value) {
            addCriterion("trainEquipment.parent_plugin_Type not like", value, "parentPluginType");
            return (Criteria) this;
        }

        public Criteria andParentPluginTypeIn(List<String> values) {
            addCriterion("trainEquipment.parent_plugin_Type in", values, "parentPluginType");
            return (Criteria) this;
        }

        public Criteria andParentPluginTypeNotIn(List<String> values) {
            addCriterion("trainEquipment.parent_plugin_Type not in", values, "parentPluginType");
            return (Criteria) this;
        }

        public Criteria andParentPluginTypeBetween(String value1, String value2) {
            addCriterion("trainEquipment.parent_plugin_Type between", value1, value2, "parentPluginType");
            return (Criteria) this;
        }

        public Criteria andParentPluginTypeNotBetween(String value1, String value2) {
            addCriterion("trainEquipment.parent_plugin_Type not between", value1, value2, "parentPluginType");
            return (Criteria) this;
        }

        public Criteria andDownReasonIsNull() {
            addCriterion("trainEquipment.down_reason is null");
            return (Criteria) this;
        }

        public Criteria andDownReasonIsNotNull() {
            addCriterion("trainEquipment.down_reason is not null");
            return (Criteria) this;
        }

        public Criteria andDownReasonEqualTo(String value) {
            addCriterion("trainEquipment.down_reason =", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonNotEqualTo(String value) {
            addCriterion("trainEquipment.down_reason <>", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonGreaterThan(String value) {
            addCriterion("trainEquipment.down_reason >", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonGreaterThanOrEqualTo(String value) {
            addCriterion("trainEquipment.down_reason >=", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonLessThan(String value) {
            addCriterion("trainEquipment.down_reason <", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonLessThanOrEqualTo(String value) {
            addCriterion("trainEquipment.down_reason <=", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonLike(String value) {
            addCriterion("trainEquipment.down_reason like", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonNotLike(String value) {
            addCriterion("trainEquipment.down_reason not like", value, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonIn(List<String> values) {
            addCriterion("trainEquipment.down_reason in", values, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonNotIn(List<String> values) {
            addCriterion("trainEquipment.down_reason not in", values, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonBetween(String value1, String value2) {
            addCriterion("trainEquipment.down_reason between", value1, value2, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownReasonNotBetween(String value1, String value2) {
            addCriterion("trainEquipment.down_reason not between", value1, value2, "downReason");
            return (Criteria) this;
        }

        public Criteria andDownDateIsNull() {
            addCriterion("trainEquipment.down_date is null");
            return (Criteria) this;
        }

        public Criteria andDownDateIsNotNull() {
            addCriterion("trainEquipment.down_date is not null");
            return (Criteria) this;
        }

        public Criteria andDownDateEqualTo(Date value) {
            addCriterionForJDBCDate("trainEquipment.down_date =", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("trainEquipment.down_date <>", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateGreaterThan(Date value) {
            addCriterionForJDBCDate("trainEquipment.down_date >", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trainEquipment.down_date >=", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateLessThan(Date value) {
            addCriterionForJDBCDate("trainEquipment.down_date <", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trainEquipment.down_date <=", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateIn(List<Date> values) {
            addCriterionForJDBCDate("trainEquipment.down_date in", values, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("trainEquipment.down_date not in", values, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trainEquipment.down_date between", value1, value2, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trainEquipment.down_date not between", value1, value2, "downDate");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdIsNull() {
            addCriterion("trainEquipment.equipment_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdIsNotNull() {
            addCriterion("trainEquipment.equipment_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_parent_id =", value, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdNotEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_parent_id <>", value, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdGreaterThan(Long value) {
            addCriterion("trainEquipment.equipment_parent_id >", value, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_parent_id >=", value, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdLessThan(Long value) {
            addCriterion("trainEquipment.equipment_parent_id <", value, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdLessThanOrEqualTo(Long value) {
            addCriterion("trainEquipment.equipment_parent_id <=", value, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdIn(List<Long> values) {
            addCriterion("trainEquipment.equipment_parent_id in", values, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdNotIn(List<Long> values) {
            addCriterion("trainEquipment.equipment_parent_id not in", values, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdBetween(Long value1, Long value2) {
            addCriterion("trainEquipment.equipment_parent_id between", value1, value2, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdNotBetween(Long value1, Long value2) {
            addCriterion("trainEquipment.equipment_parent_id not between", value1, value2, "equipmentParentId");
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