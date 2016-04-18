package com.perfect.trains.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
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
            addCriterion("equipment.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("equipment.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("equipment.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("equipment.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("equipment.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("equipment.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("equipment.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("equipment.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("equipment.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("equipment.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("equipment.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("equipment.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClassificationIdIsNull() {
            addCriterion("equipment.classification_id is null");
            return (Criteria) this;
        }

        public Criteria andClassificationIdIsNotNull() {
            addCriterion("equipment.classification_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationIdEqualTo(Long value) {
            addCriterion("equipment.classification_id =", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotEqualTo(Long value) {
            addCriterion("equipment.classification_id <>", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdGreaterThan(Long value) {
            addCriterion("equipment.classification_id >", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("equipment.classification_id >=", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdLessThan(Long value) {
            addCriterion("equipment.classification_id <", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdLessThanOrEqualTo(Long value) {
            addCriterion("equipment.classification_id <=", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdIn(List<Long> values) {
            addCriterion("equipment.classification_id in", values, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotIn(List<Long> values) {
            addCriterion("equipment.classification_id not in", values, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdBetween(Long value1, Long value2) {
            addCriterion("equipment.classification_id between", value1, value2, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotBetween(Long value1, Long value2) {
            addCriterion("equipment.classification_id not between", value1, value2, "classificationId");
            return (Criteria) this;
        }

        public Criteria andProductionDateIsNull() {
            addCriterion("equipment.production_date is null");
            return (Criteria) this;
        }

        public Criteria andProductionDateIsNotNull() {
            addCriterion("equipment.production_date is not null");
            return (Criteria) this;
        }

        public Criteria andProductionDateEqualTo(Date value) {
            addCriterionForJDBCDate("equipment.production_date =", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("equipment.production_date <>", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("equipment.production_date >", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("equipment.production_date >=", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLessThan(Date value) {
            addCriterionForJDBCDate("equipment.production_date <", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("equipment.production_date <=", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateIn(List<Date> values) {
            addCriterionForJDBCDate("equipment.production_date in", values, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("equipment.production_date not in", values, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("equipment.production_date between", value1, value2, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("equipment.production_date not between", value1, value2, "productionDate");
            return (Criteria) this;
        }

        public Criteria andAttachDateIsNull() {
            addCriterion("equipment.attach_date is null");
            return (Criteria) this;
        }

        public Criteria andAttachDateIsNotNull() {
            addCriterion("equipment.attach_date is not null");
            return (Criteria) this;
        }

        public Criteria andAttachDateEqualTo(Date value) {
            addCriterionForJDBCDate("equipment.attach_date =", value, "attachDate");
            return (Criteria) this;
        }

        public Criteria andAttachDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("equipment.attach_date <>", value, "attachDate");
            return (Criteria) this;
        }

        public Criteria andAttachDateGreaterThan(Date value) {
            addCriterionForJDBCDate("equipment.attach_date >", value, "attachDate");
            return (Criteria) this;
        }

        public Criteria andAttachDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("equipment.attach_date >=", value, "attachDate");
            return (Criteria) this;
        }

        public Criteria andAttachDateLessThan(Date value) {
            addCriterionForJDBCDate("equipment.attach_date <", value, "attachDate");
            return (Criteria) this;
        }

        public Criteria andAttachDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("equipment.attach_date <=", value, "attachDate");
            return (Criteria) this;
        }

        public Criteria andAttachDateIn(List<Date> values) {
            addCriterionForJDBCDate("equipment.attach_date in", values, "attachDate");
            return (Criteria) this;
        }

        public Criteria andAttachDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("equipment.attach_date not in", values, "attachDate");
            return (Criteria) this;
        }

        public Criteria andAttachDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("equipment.attach_date between", value1, value2, "attachDate");
            return (Criteria) this;
        }

        public Criteria andAttachDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("equipment.attach_date not between", value1, value2, "attachDate");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("equipment.model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("equipment.model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Long value) {
            addCriterion("equipment.model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Long value) {
            addCriterion("equipment.model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Long value) {
            addCriterion("equipment.model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("equipment.model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Long value) {
            addCriterion("equipment.model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Long value) {
            addCriterion("equipment.model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Long> values) {
            addCriterion("equipment.model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Long> values) {
            addCriterion("equipment.model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Long value1, Long value2) {
            addCriterion("equipment.model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Long value1, Long value2) {
            addCriterion("equipment.model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("equipment.`number` is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("equipment.`number` is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("equipment.`number` =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("equipment.`number` <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("equipment.`number` >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("equipment.`number` >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("equipment.`number` <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("equipment.`number` <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("equipment.`number` like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("equipment.`number` not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("equipment.`number` in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("equipment.`number` not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("equipment.`number` between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("equipment.`number` not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("equipment.department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("equipment.department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Long value) {
            addCriterion("equipment.department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Long value) {
            addCriterion("equipment.department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Long value) {
            addCriterion("equipment.department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("equipment.department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Long value) {
            addCriterion("equipment.department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("equipment.department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Long> values) {
            addCriterion("equipment.department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Long> values) {
            addCriterion("equipment.department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("equipment.department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("equipment.department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("equipment.`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("equipment.`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("equipment.`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("equipment.`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("equipment.`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("equipment.`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("equipment.`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("equipment.`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("equipment.`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("equipment.`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("equipment.`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("equipment.`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("equipment.`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("equipment.`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("equipment.note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("equipment.note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("equipment.note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("equipment.note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("equipment.note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("equipment.note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("equipment.note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("equipment.note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("equipment.note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("equipment.note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("equipment.note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("equipment.note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("equipment.note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("equipment.note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andPluginTypeIsNull() {
            addCriterion("equipment.plugin_type is null");
            return (Criteria) this;
        }

        public Criteria andPluginTypeIsNotNull() {
            addCriterion("equipment.plugin_type is not null");
            return (Criteria) this;
        }

        public Criteria andPluginTypeEqualTo(String value) {
            addCriterion("equipment.plugin_type =", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeNotEqualTo(String value) {
            addCriterion("equipment.plugin_type <>", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeGreaterThan(String value) {
            addCriterion("equipment.plugin_type >", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeGreaterThanOrEqualTo(String value) {
            addCriterion("equipment.plugin_type >=", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeLessThan(String value) {
            addCriterion("equipment.plugin_type <", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeLessThanOrEqualTo(String value) {
            addCriterion("equipment.plugin_type <=", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeLike(String value) {
            addCriterion("equipment.plugin_type like", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeNotLike(String value) {
            addCriterion("equipment.plugin_type not like", value, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeIn(List<String> values) {
            addCriterion("equipment.plugin_type in", values, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeNotIn(List<String> values) {
            addCriterion("equipment.plugin_type not in", values, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeBetween(String value1, String value2) {
            addCriterion("equipment.plugin_type between", value1, value2, "pluginType");
            return (Criteria) this;
        }

        public Criteria andPluginTypeNotBetween(String value1, String value2) {
            addCriterion("equipment.plugin_type not between", value1, value2, "pluginType");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("equipment.parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("equipment.parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("equipment.parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("equipment.parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("equipment.parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("equipment.parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("equipment.parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("equipment.parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("equipment.parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("equipment.parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("equipment.parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("equipment.parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andTrainIdIsNull() {
            addCriterion("equipment.train_id is null");
            return (Criteria) this;
        }

        public Criteria andTrainIdIsNotNull() {
            addCriterion("equipment.train_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrainIdEqualTo(Long value) {
            addCriterion("equipment.train_id =", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotEqualTo(Long value) {
            addCriterion("equipment.train_id <>", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThan(Long value) {
            addCriterion("equipment.train_id >", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThanOrEqualTo(Long value) {
            addCriterion("equipment.train_id >=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThan(Long value) {
            addCriterion("equipment.train_id <", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThanOrEqualTo(Long value) {
            addCriterion("equipment.train_id <=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdIn(List<Long> values) {
            addCriterion("equipment.train_id in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotIn(List<Long> values) {
            addCriterion("equipment.train_id not in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdBetween(Long value1, Long value2) {
            addCriterion("equipment.train_id between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotBetween(Long value1, Long value2) {
            addCriterion("equipment.train_id not between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIsNull() {
            addCriterion("equipment.manufacturer_id is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIsNotNull() {
            addCriterion("equipment.manufacturer_id is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdEqualTo(Long value) {
            addCriterion("equipment.manufacturer_id =", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotEqualTo(Long value) {
            addCriterion("equipment.manufacturer_id <>", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdGreaterThan(Long value) {
            addCriterion("equipment.manufacturer_id >", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("equipment.manufacturer_id >=", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdLessThan(Long value) {
            addCriterion("equipment.manufacturer_id <", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdLessThanOrEqualTo(Long value) {
            addCriterion("equipment.manufacturer_id <=", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIn(List<Long> values) {
            addCriterion("equipment.manufacturer_id in", values, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotIn(List<Long> values) {
            addCriterion("equipment.manufacturer_id not in", values, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdBetween(Long value1, Long value2) {
            addCriterion("equipment.manufacturer_id between", value1, value2, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotBetween(Long value1, Long value2) {
            addCriterion("equipment.manufacturer_id not between", value1, value2, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andParameter1IsNull() {
            addCriterion("equipment.parameter1 is null");
            return (Criteria) this;
        }

        public Criteria andParameter1IsNotNull() {
            addCriterion("equipment.parameter1 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter1EqualTo(String value) {
            addCriterion("equipment.parameter1 =", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotEqualTo(String value) {
            addCriterion("equipment.parameter1 <>", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1GreaterThan(String value) {
            addCriterion("equipment.parameter1 >", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter1 >=", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1LessThan(String value) {
            addCriterion("equipment.parameter1 <", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter1 <=", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1Like(String value) {
            addCriterion("equipment.parameter1 like", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotLike(String value) {
            addCriterion("equipment.parameter1 not like", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1In(List<String> values) {
            addCriterion("equipment.parameter1 in", values, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotIn(List<String> values) {
            addCriterion("equipment.parameter1 not in", values, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1Between(String value1, String value2) {
            addCriterion("equipment.parameter1 between", value1, value2, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter1 not between", value1, value2, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter2IsNull() {
            addCriterion("equipment.parameter2 is null");
            return (Criteria) this;
        }

        public Criteria andParameter2IsNotNull() {
            addCriterion("equipment.parameter2 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter2EqualTo(String value) {
            addCriterion("equipment.parameter2 =", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotEqualTo(String value) {
            addCriterion("equipment.parameter2 <>", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2GreaterThan(String value) {
            addCriterion("equipment.parameter2 >", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter2 >=", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2LessThan(String value) {
            addCriterion("equipment.parameter2 <", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter2 <=", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2Like(String value) {
            addCriterion("equipment.parameter2 like", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotLike(String value) {
            addCriterion("equipment.parameter2 not like", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2In(List<String> values) {
            addCriterion("equipment.parameter2 in", values, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotIn(List<String> values) {
            addCriterion("equipment.parameter2 not in", values, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2Between(String value1, String value2) {
            addCriterion("equipment.parameter2 between", value1, value2, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter2 not between", value1, value2, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter3IsNull() {
            addCriterion("equipment.parameter3 is null");
            return (Criteria) this;
        }

        public Criteria andParameter3IsNotNull() {
            addCriterion("equipment.parameter3 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter3EqualTo(String value) {
            addCriterion("equipment.parameter3 =", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3NotEqualTo(String value) {
            addCriterion("equipment.parameter3 <>", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3GreaterThan(String value) {
            addCriterion("equipment.parameter3 >", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter3 >=", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3LessThan(String value) {
            addCriterion("equipment.parameter3 <", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter3 <=", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3Like(String value) {
            addCriterion("equipment.parameter3 like", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3NotLike(String value) {
            addCriterion("equipment.parameter3 not like", value, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3In(List<String> values) {
            addCriterion("equipment.parameter3 in", values, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3NotIn(List<String> values) {
            addCriterion("equipment.parameter3 not in", values, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3Between(String value1, String value2) {
            addCriterion("equipment.parameter3 between", value1, value2, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter3NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter3 not between", value1, value2, "parameter3");
            return (Criteria) this;
        }

        public Criteria andParameter4IsNull() {
            addCriterion("equipment.parameter4 is null");
            return (Criteria) this;
        }

        public Criteria andParameter4IsNotNull() {
            addCriterion("equipment.parameter4 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter4EqualTo(String value) {
            addCriterion("equipment.parameter4 =", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4NotEqualTo(String value) {
            addCriterion("equipment.parameter4 <>", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4GreaterThan(String value) {
            addCriterion("equipment.parameter4 >", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter4 >=", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4LessThan(String value) {
            addCriterion("equipment.parameter4 <", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter4 <=", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4Like(String value) {
            addCriterion("equipment.parameter4 like", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4NotLike(String value) {
            addCriterion("equipment.parameter4 not like", value, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4In(List<String> values) {
            addCriterion("equipment.parameter4 in", values, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4NotIn(List<String> values) {
            addCriterion("equipment.parameter4 not in", values, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4Between(String value1, String value2) {
            addCriterion("equipment.parameter4 between", value1, value2, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter4NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter4 not between", value1, value2, "parameter4");
            return (Criteria) this;
        }

        public Criteria andParameter5IsNull() {
            addCriterion("equipment.parameter5 is null");
            return (Criteria) this;
        }

        public Criteria andParameter5IsNotNull() {
            addCriterion("equipment.parameter5 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter5EqualTo(String value) {
            addCriterion("equipment.parameter5 =", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5NotEqualTo(String value) {
            addCriterion("equipment.parameter5 <>", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5GreaterThan(String value) {
            addCriterion("equipment.parameter5 >", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter5 >=", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5LessThan(String value) {
            addCriterion("equipment.parameter5 <", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter5 <=", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5Like(String value) {
            addCriterion("equipment.parameter5 like", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5NotLike(String value) {
            addCriterion("equipment.parameter5 not like", value, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5In(List<String> values) {
            addCriterion("equipment.parameter5 in", values, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5NotIn(List<String> values) {
            addCriterion("equipment.parameter5 not in", values, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5Between(String value1, String value2) {
            addCriterion("equipment.parameter5 between", value1, value2, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter5NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter5 not between", value1, value2, "parameter5");
            return (Criteria) this;
        }

        public Criteria andParameter6IsNull() {
            addCriterion("equipment.parameter6 is null");
            return (Criteria) this;
        }

        public Criteria andParameter6IsNotNull() {
            addCriterion("equipment.parameter6 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter6EqualTo(String value) {
            addCriterion("equipment.parameter6 =", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6NotEqualTo(String value) {
            addCriterion("equipment.parameter6 <>", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6GreaterThan(String value) {
            addCriterion("equipment.parameter6 >", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter6 >=", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6LessThan(String value) {
            addCriterion("equipment.parameter6 <", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter6 <=", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6Like(String value) {
            addCriterion("equipment.parameter6 like", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6NotLike(String value) {
            addCriterion("equipment.parameter6 not like", value, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6In(List<String> values) {
            addCriterion("equipment.parameter6 in", values, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6NotIn(List<String> values) {
            addCriterion("equipment.parameter6 not in", values, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6Between(String value1, String value2) {
            addCriterion("equipment.parameter6 between", value1, value2, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter6NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter6 not between", value1, value2, "parameter6");
            return (Criteria) this;
        }

        public Criteria andParameter7IsNull() {
            addCriterion("equipment.parameter7 is null");
            return (Criteria) this;
        }

        public Criteria andParameter7IsNotNull() {
            addCriterion("equipment.parameter7 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter7EqualTo(String value) {
            addCriterion("equipment.parameter7 =", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7NotEqualTo(String value) {
            addCriterion("equipment.parameter7 <>", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7GreaterThan(String value) {
            addCriterion("equipment.parameter7 >", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter7 >=", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7LessThan(String value) {
            addCriterion("equipment.parameter7 <", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter7 <=", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7Like(String value) {
            addCriterion("equipment.parameter7 like", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7NotLike(String value) {
            addCriterion("equipment.parameter7 not like", value, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7In(List<String> values) {
            addCriterion("equipment.parameter7 in", values, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7NotIn(List<String> values) {
            addCriterion("equipment.parameter7 not in", values, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7Between(String value1, String value2) {
            addCriterion("equipment.parameter7 between", value1, value2, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter7NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter7 not between", value1, value2, "parameter7");
            return (Criteria) this;
        }

        public Criteria andParameter8IsNull() {
            addCriterion("equipment.parameter8 is null");
            return (Criteria) this;
        }

        public Criteria andParameter8IsNotNull() {
            addCriterion("equipment.parameter8 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter8EqualTo(String value) {
            addCriterion("equipment.parameter8 =", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8NotEqualTo(String value) {
            addCriterion("equipment.parameter8 <>", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8GreaterThan(String value) {
            addCriterion("equipment.parameter8 >", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter8 >=", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8LessThan(String value) {
            addCriterion("equipment.parameter8 <", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter8 <=", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8Like(String value) {
            addCriterion("equipment.parameter8 like", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8NotLike(String value) {
            addCriterion("equipment.parameter8 not like", value, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8In(List<String> values) {
            addCriterion("equipment.parameter8 in", values, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8NotIn(List<String> values) {
            addCriterion("equipment.parameter8 not in", values, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8Between(String value1, String value2) {
            addCriterion("equipment.parameter8 between", value1, value2, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter8NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter8 not between", value1, value2, "parameter8");
            return (Criteria) this;
        }

        public Criteria andParameter9IsNull() {
            addCriterion("equipment.parameter9 is null");
            return (Criteria) this;
        }

        public Criteria andParameter9IsNotNull() {
            addCriterion("equipment.parameter9 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter9EqualTo(String value) {
            addCriterion("equipment.parameter9 =", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9NotEqualTo(String value) {
            addCriterion("equipment.parameter9 <>", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9GreaterThan(String value) {
            addCriterion("equipment.parameter9 >", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter9 >=", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9LessThan(String value) {
            addCriterion("equipment.parameter9 <", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter9 <=", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9Like(String value) {
            addCriterion("equipment.parameter9 like", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9NotLike(String value) {
            addCriterion("equipment.parameter9 not like", value, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9In(List<String> values) {
            addCriterion("equipment.parameter9 in", values, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9NotIn(List<String> values) {
            addCriterion("equipment.parameter9 not in", values, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9Between(String value1, String value2) {
            addCriterion("equipment.parameter9 between", value1, value2, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter9NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter9 not between", value1, value2, "parameter9");
            return (Criteria) this;
        }

        public Criteria andParameter10IsNull() {
            addCriterion("equipment.parameter10 is null");
            return (Criteria) this;
        }

        public Criteria andParameter10IsNotNull() {
            addCriterion("equipment.parameter10 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter10EqualTo(String value) {
            addCriterion("equipment.parameter10 =", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10NotEqualTo(String value) {
            addCriterion("equipment.parameter10 <>", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10GreaterThan(String value) {
            addCriterion("equipment.parameter10 >", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter10 >=", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10LessThan(String value) {
            addCriterion("equipment.parameter10 <", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter10 <=", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10Like(String value) {
            addCriterion("equipment.parameter10 like", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10NotLike(String value) {
            addCriterion("equipment.parameter10 not like", value, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10In(List<String> values) {
            addCriterion("equipment.parameter10 in", values, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10NotIn(List<String> values) {
            addCriterion("equipment.parameter10 not in", values, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10Between(String value1, String value2) {
            addCriterion("equipment.parameter10 between", value1, value2, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter10NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter10 not between", value1, value2, "parameter10");
            return (Criteria) this;
        }

        public Criteria andParameter11IsNull() {
            addCriterion("equipment.parameter11 is null");
            return (Criteria) this;
        }

        public Criteria andParameter11IsNotNull() {
            addCriterion("equipment.parameter11 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter11EqualTo(String value) {
            addCriterion("equipment.parameter11 =", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11NotEqualTo(String value) {
            addCriterion("equipment.parameter11 <>", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11GreaterThan(String value) {
            addCriterion("equipment.parameter11 >", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter11 >=", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11LessThan(String value) {
            addCriterion("equipment.parameter11 <", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter11 <=", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11Like(String value) {
            addCriterion("equipment.parameter11 like", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11NotLike(String value) {
            addCriterion("equipment.parameter11 not like", value, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11In(List<String> values) {
            addCriterion("equipment.parameter11 in", values, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11NotIn(List<String> values) {
            addCriterion("equipment.parameter11 not in", values, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11Between(String value1, String value2) {
            addCriterion("equipment.parameter11 between", value1, value2, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter11NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter11 not between", value1, value2, "parameter11");
            return (Criteria) this;
        }

        public Criteria andParameter12IsNull() {
            addCriterion("equipment.parameter12 is null");
            return (Criteria) this;
        }

        public Criteria andParameter12IsNotNull() {
            addCriterion("equipment.parameter12 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter12EqualTo(String value) {
            addCriterion("equipment.parameter12 =", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12NotEqualTo(String value) {
            addCriterion("equipment.parameter12 <>", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12GreaterThan(String value) {
            addCriterion("equipment.parameter12 >", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter12 >=", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12LessThan(String value) {
            addCriterion("equipment.parameter12 <", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter12 <=", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12Like(String value) {
            addCriterion("equipment.parameter12 like", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12NotLike(String value) {
            addCriterion("equipment.parameter12 not like", value, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12In(List<String> values) {
            addCriterion("equipment.parameter12 in", values, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12NotIn(List<String> values) {
            addCriterion("equipment.parameter12 not in", values, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12Between(String value1, String value2) {
            addCriterion("equipment.parameter12 between", value1, value2, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter12NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter12 not between", value1, value2, "parameter12");
            return (Criteria) this;
        }

        public Criteria andParameter13IsNull() {
            addCriterion("equipment.parameter13 is null");
            return (Criteria) this;
        }

        public Criteria andParameter13IsNotNull() {
            addCriterion("equipment.parameter13 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter13EqualTo(String value) {
            addCriterion("equipment.parameter13 =", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13NotEqualTo(String value) {
            addCriterion("equipment.parameter13 <>", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13GreaterThan(String value) {
            addCriterion("equipment.parameter13 >", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter13 >=", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13LessThan(String value) {
            addCriterion("equipment.parameter13 <", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter13 <=", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13Like(String value) {
            addCriterion("equipment.parameter13 like", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13NotLike(String value) {
            addCriterion("equipment.parameter13 not like", value, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13In(List<String> values) {
            addCriterion("equipment.parameter13 in", values, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13NotIn(List<String> values) {
            addCriterion("equipment.parameter13 not in", values, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13Between(String value1, String value2) {
            addCriterion("equipment.parameter13 between", value1, value2, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter13NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter13 not between", value1, value2, "parameter13");
            return (Criteria) this;
        }

        public Criteria andParameter14IsNull() {
            addCriterion("equipment.parameter14 is null");
            return (Criteria) this;
        }

        public Criteria andParameter14IsNotNull() {
            addCriterion("equipment.parameter14 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter14EqualTo(String value) {
            addCriterion("equipment.parameter14 =", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14NotEqualTo(String value) {
            addCriterion("equipment.parameter14 <>", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14GreaterThan(String value) {
            addCriterion("equipment.parameter14 >", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter14 >=", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14LessThan(String value) {
            addCriterion("equipment.parameter14 <", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter14 <=", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14Like(String value) {
            addCriterion("equipment.parameter14 like", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14NotLike(String value) {
            addCriterion("equipment.parameter14 not like", value, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14In(List<String> values) {
            addCriterion("equipment.parameter14 in", values, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14NotIn(List<String> values) {
            addCriterion("equipment.parameter14 not in", values, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14Between(String value1, String value2) {
            addCriterion("equipment.parameter14 between", value1, value2, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter14NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter14 not between", value1, value2, "parameter14");
            return (Criteria) this;
        }

        public Criteria andParameter15IsNull() {
            addCriterion("equipment.parameter15 is null");
            return (Criteria) this;
        }

        public Criteria andParameter15IsNotNull() {
            addCriterion("equipment.parameter15 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter15EqualTo(String value) {
            addCriterion("equipment.parameter15 =", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15NotEqualTo(String value) {
            addCriterion("equipment.parameter15 <>", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15GreaterThan(String value) {
            addCriterion("equipment.parameter15 >", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter15 >=", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15LessThan(String value) {
            addCriterion("equipment.parameter15 <", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter15 <=", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15Like(String value) {
            addCriterion("equipment.parameter15 like", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15NotLike(String value) {
            addCriterion("equipment.parameter15 not like", value, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15In(List<String> values) {
            addCriterion("equipment.parameter15 in", values, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15NotIn(List<String> values) {
            addCriterion("equipment.parameter15 not in", values, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15Between(String value1, String value2) {
            addCriterion("equipment.parameter15 between", value1, value2, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter15NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter15 not between", value1, value2, "parameter15");
            return (Criteria) this;
        }

        public Criteria andParameter16IsNull() {
            addCriterion("equipment.parameter16 is null");
            return (Criteria) this;
        }

        public Criteria andParameter16IsNotNull() {
            addCriterion("equipment.parameter16 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter16EqualTo(String value) {
            addCriterion("equipment.parameter16 =", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16NotEqualTo(String value) {
            addCriterion("equipment.parameter16 <>", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16GreaterThan(String value) {
            addCriterion("equipment.parameter16 >", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter16 >=", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16LessThan(String value) {
            addCriterion("equipment.parameter16 <", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter16 <=", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16Like(String value) {
            addCriterion("equipment.parameter16 like", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16NotLike(String value) {
            addCriterion("equipment.parameter16 not like", value, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16In(List<String> values) {
            addCriterion("equipment.parameter16 in", values, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16NotIn(List<String> values) {
            addCriterion("equipment.parameter16 not in", values, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16Between(String value1, String value2) {
            addCriterion("equipment.parameter16 between", value1, value2, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter16NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter16 not between", value1, value2, "parameter16");
            return (Criteria) this;
        }

        public Criteria andParameter17IsNull() {
            addCriterion("equipment.parameter17 is null");
            return (Criteria) this;
        }

        public Criteria andParameter17IsNotNull() {
            addCriterion("equipment.parameter17 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter17EqualTo(String value) {
            addCriterion("equipment.parameter17 =", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17NotEqualTo(String value) {
            addCriterion("equipment.parameter17 <>", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17GreaterThan(String value) {
            addCriterion("equipment.parameter17 >", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter17 >=", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17LessThan(String value) {
            addCriterion("equipment.parameter17 <", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter17 <=", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17Like(String value) {
            addCriterion("equipment.parameter17 like", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17NotLike(String value) {
            addCriterion("equipment.parameter17 not like", value, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17In(List<String> values) {
            addCriterion("equipment.parameter17 in", values, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17NotIn(List<String> values) {
            addCriterion("equipment.parameter17 not in", values, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17Between(String value1, String value2) {
            addCriterion("equipment.parameter17 between", value1, value2, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter17NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter17 not between", value1, value2, "parameter17");
            return (Criteria) this;
        }

        public Criteria andParameter18IsNull() {
            addCriterion("equipment.parameter18 is null");
            return (Criteria) this;
        }

        public Criteria andParameter18IsNotNull() {
            addCriterion("equipment.parameter18 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter18EqualTo(String value) {
            addCriterion("equipment.parameter18 =", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18NotEqualTo(String value) {
            addCriterion("equipment.parameter18 <>", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18GreaterThan(String value) {
            addCriterion("equipment.parameter18 >", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter18 >=", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18LessThan(String value) {
            addCriterion("equipment.parameter18 <", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter18 <=", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18Like(String value) {
            addCriterion("equipment.parameter18 like", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18NotLike(String value) {
            addCriterion("equipment.parameter18 not like", value, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18In(List<String> values) {
            addCriterion("equipment.parameter18 in", values, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18NotIn(List<String> values) {
            addCriterion("equipment.parameter18 not in", values, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18Between(String value1, String value2) {
            addCriterion("equipment.parameter18 between", value1, value2, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter18NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter18 not between", value1, value2, "parameter18");
            return (Criteria) this;
        }

        public Criteria andParameter19IsNull() {
            addCriterion("equipment.parameter19 is null");
            return (Criteria) this;
        }

        public Criteria andParameter19IsNotNull() {
            addCriterion("equipment.parameter19 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter19EqualTo(String value) {
            addCriterion("equipment.parameter19 =", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19NotEqualTo(String value) {
            addCriterion("equipment.parameter19 <>", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19GreaterThan(String value) {
            addCriterion("equipment.parameter19 >", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter19 >=", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19LessThan(String value) {
            addCriterion("equipment.parameter19 <", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter19 <=", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19Like(String value) {
            addCriterion("equipment.parameter19 like", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19NotLike(String value) {
            addCriterion("equipment.parameter19 not like", value, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19In(List<String> values) {
            addCriterion("equipment.parameter19 in", values, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19NotIn(List<String> values) {
            addCriterion("equipment.parameter19 not in", values, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19Between(String value1, String value2) {
            addCriterion("equipment.parameter19 between", value1, value2, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter19NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter19 not between", value1, value2, "parameter19");
            return (Criteria) this;
        }

        public Criteria andParameter20IsNull() {
            addCriterion("equipment.parameter20 is null");
            return (Criteria) this;
        }

        public Criteria andParameter20IsNotNull() {
            addCriterion("equipment.parameter20 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter20EqualTo(String value) {
            addCriterion("equipment.parameter20 =", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20NotEqualTo(String value) {
            addCriterion("equipment.parameter20 <>", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20GreaterThan(String value) {
            addCriterion("equipment.parameter20 >", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter20 >=", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20LessThan(String value) {
            addCriterion("equipment.parameter20 <", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter20 <=", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20Like(String value) {
            addCriterion("equipment.parameter20 like", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20NotLike(String value) {
            addCriterion("equipment.parameter20 not like", value, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20In(List<String> values) {
            addCriterion("equipment.parameter20 in", values, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20NotIn(List<String> values) {
            addCriterion("equipment.parameter20 not in", values, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20Between(String value1, String value2) {
            addCriterion("equipment.parameter20 between", value1, value2, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter20NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter20 not between", value1, value2, "parameter20");
            return (Criteria) this;
        }

        public Criteria andParameter21IsNull() {
            addCriterion("equipment.parameter21 is null");
            return (Criteria) this;
        }

        public Criteria andParameter21IsNotNull() {
            addCriterion("equipment.parameter21 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter21EqualTo(String value) {
            addCriterion("equipment.parameter21 =", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21NotEqualTo(String value) {
            addCriterion("equipment.parameter21 <>", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21GreaterThan(String value) {
            addCriterion("equipment.parameter21 >", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter21 >=", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21LessThan(String value) {
            addCriterion("equipment.parameter21 <", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter21 <=", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21Like(String value) {
            addCriterion("equipment.parameter21 like", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21NotLike(String value) {
            addCriterion("equipment.parameter21 not like", value, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21In(List<String> values) {
            addCriterion("equipment.parameter21 in", values, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21NotIn(List<String> values) {
            addCriterion("equipment.parameter21 not in", values, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21Between(String value1, String value2) {
            addCriterion("equipment.parameter21 between", value1, value2, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter21NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter21 not between", value1, value2, "parameter21");
            return (Criteria) this;
        }

        public Criteria andParameter22IsNull() {
            addCriterion("equipment.parameter22 is null");
            return (Criteria) this;
        }

        public Criteria andParameter22IsNotNull() {
            addCriterion("equipment.parameter22 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter22EqualTo(String value) {
            addCriterion("equipment.parameter22 =", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22NotEqualTo(String value) {
            addCriterion("equipment.parameter22 <>", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22GreaterThan(String value) {
            addCriterion("equipment.parameter22 >", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter22 >=", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22LessThan(String value) {
            addCriterion("equipment.parameter22 <", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter22 <=", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22Like(String value) {
            addCriterion("equipment.parameter22 like", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22NotLike(String value) {
            addCriterion("equipment.parameter22 not like", value, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22In(List<String> values) {
            addCriterion("equipment.parameter22 in", values, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22NotIn(List<String> values) {
            addCriterion("equipment.parameter22 not in", values, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22Between(String value1, String value2) {
            addCriterion("equipment.parameter22 between", value1, value2, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter22NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter22 not between", value1, value2, "parameter22");
            return (Criteria) this;
        }

        public Criteria andParameter23IsNull() {
            addCriterion("equipment.parameter23 is null");
            return (Criteria) this;
        }

        public Criteria andParameter23IsNotNull() {
            addCriterion("equipment.parameter23 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter23EqualTo(String value) {
            addCriterion("equipment.parameter23 =", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23NotEqualTo(String value) {
            addCriterion("equipment.parameter23 <>", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23GreaterThan(String value) {
            addCriterion("equipment.parameter23 >", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter23 >=", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23LessThan(String value) {
            addCriterion("equipment.parameter23 <", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter23 <=", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23Like(String value) {
            addCriterion("equipment.parameter23 like", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23NotLike(String value) {
            addCriterion("equipment.parameter23 not like", value, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23In(List<String> values) {
            addCriterion("equipment.parameter23 in", values, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23NotIn(List<String> values) {
            addCriterion("equipment.parameter23 not in", values, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23Between(String value1, String value2) {
            addCriterion("equipment.parameter23 between", value1, value2, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter23NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter23 not between", value1, value2, "parameter23");
            return (Criteria) this;
        }

        public Criteria andParameter24IsNull() {
            addCriterion("equipment.parameter24 is null");
            return (Criteria) this;
        }

        public Criteria andParameter24IsNotNull() {
            addCriterion("equipment.parameter24 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter24EqualTo(String value) {
            addCriterion("equipment.parameter24 =", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24NotEqualTo(String value) {
            addCriterion("equipment.parameter24 <>", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24GreaterThan(String value) {
            addCriterion("equipment.parameter24 >", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter24 >=", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24LessThan(String value) {
            addCriterion("equipment.parameter24 <", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter24 <=", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24Like(String value) {
            addCriterion("equipment.parameter24 like", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24NotLike(String value) {
            addCriterion("equipment.parameter24 not like", value, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24In(List<String> values) {
            addCriterion("equipment.parameter24 in", values, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24NotIn(List<String> values) {
            addCriterion("equipment.parameter24 not in", values, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24Between(String value1, String value2) {
            addCriterion("equipment.parameter24 between", value1, value2, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter24NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter24 not between", value1, value2, "parameter24");
            return (Criteria) this;
        }

        public Criteria andParameter25IsNull() {
            addCriterion("equipment.parameter25 is null");
            return (Criteria) this;
        }

        public Criteria andParameter25IsNotNull() {
            addCriterion("equipment.parameter25 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter25EqualTo(String value) {
            addCriterion("equipment.parameter25 =", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25NotEqualTo(String value) {
            addCriterion("equipment.parameter25 <>", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25GreaterThan(String value) {
            addCriterion("equipment.parameter25 >", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter25 >=", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25LessThan(String value) {
            addCriterion("equipment.parameter25 <", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter25 <=", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25Like(String value) {
            addCriterion("equipment.parameter25 like", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25NotLike(String value) {
            addCriterion("equipment.parameter25 not like", value, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25In(List<String> values) {
            addCriterion("equipment.parameter25 in", values, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25NotIn(List<String> values) {
            addCriterion("equipment.parameter25 not in", values, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25Between(String value1, String value2) {
            addCriterion("equipment.parameter25 between", value1, value2, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter25NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter25 not between", value1, value2, "parameter25");
            return (Criteria) this;
        }

        public Criteria andParameter26IsNull() {
            addCriterion("equipment.parameter26 is null");
            return (Criteria) this;
        }

        public Criteria andParameter26IsNotNull() {
            addCriterion("equipment.parameter26 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter26EqualTo(String value) {
            addCriterion("equipment.parameter26 =", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26NotEqualTo(String value) {
            addCriterion("equipment.parameter26 <>", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26GreaterThan(String value) {
            addCriterion("equipment.parameter26 >", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter26 >=", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26LessThan(String value) {
            addCriterion("equipment.parameter26 <", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter26 <=", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26Like(String value) {
            addCriterion("equipment.parameter26 like", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26NotLike(String value) {
            addCriterion("equipment.parameter26 not like", value, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26In(List<String> values) {
            addCriterion("equipment.parameter26 in", values, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26NotIn(List<String> values) {
            addCriterion("equipment.parameter26 not in", values, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26Between(String value1, String value2) {
            addCriterion("equipment.parameter26 between", value1, value2, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter26NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter26 not between", value1, value2, "parameter26");
            return (Criteria) this;
        }

        public Criteria andParameter27IsNull() {
            addCriterion("equipment.parameter27 is null");
            return (Criteria) this;
        }

        public Criteria andParameter27IsNotNull() {
            addCriterion("equipment.parameter27 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter27EqualTo(String value) {
            addCriterion("equipment.parameter27 =", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27NotEqualTo(String value) {
            addCriterion("equipment.parameter27 <>", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27GreaterThan(String value) {
            addCriterion("equipment.parameter27 >", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter27 >=", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27LessThan(String value) {
            addCriterion("equipment.parameter27 <", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter27 <=", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27Like(String value) {
            addCriterion("equipment.parameter27 like", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27NotLike(String value) {
            addCriterion("equipment.parameter27 not like", value, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27In(List<String> values) {
            addCriterion("equipment.parameter27 in", values, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27NotIn(List<String> values) {
            addCriterion("equipment.parameter27 not in", values, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27Between(String value1, String value2) {
            addCriterion("equipment.parameter27 between", value1, value2, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter27NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter27 not between", value1, value2, "parameter27");
            return (Criteria) this;
        }

        public Criteria andParameter28IsNull() {
            addCriterion("equipment.parameter28 is null");
            return (Criteria) this;
        }

        public Criteria andParameter28IsNotNull() {
            addCriterion("equipment.parameter28 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter28EqualTo(String value) {
            addCriterion("equipment.parameter28 =", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28NotEqualTo(String value) {
            addCriterion("equipment.parameter28 <>", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28GreaterThan(String value) {
            addCriterion("equipment.parameter28 >", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter28 >=", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28LessThan(String value) {
            addCriterion("equipment.parameter28 <", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter28 <=", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28Like(String value) {
            addCriterion("equipment.parameter28 like", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28NotLike(String value) {
            addCriterion("equipment.parameter28 not like", value, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28In(List<String> values) {
            addCriterion("equipment.parameter28 in", values, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28NotIn(List<String> values) {
            addCriterion("equipment.parameter28 not in", values, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28Between(String value1, String value2) {
            addCriterion("equipment.parameter28 between", value1, value2, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter28NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter28 not between", value1, value2, "parameter28");
            return (Criteria) this;
        }

        public Criteria andParameter29IsNull() {
            addCriterion("equipment.parameter29 is null");
            return (Criteria) this;
        }

        public Criteria andParameter29IsNotNull() {
            addCriterion("equipment.parameter29 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter29EqualTo(String value) {
            addCriterion("equipment.parameter29 =", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29NotEqualTo(String value) {
            addCriterion("equipment.parameter29 <>", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29GreaterThan(String value) {
            addCriterion("equipment.parameter29 >", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter29 >=", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29LessThan(String value) {
            addCriterion("equipment.parameter29 <", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter29 <=", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29Like(String value) {
            addCriterion("equipment.parameter29 like", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29NotLike(String value) {
            addCriterion("equipment.parameter29 not like", value, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29In(List<String> values) {
            addCriterion("equipment.parameter29 in", values, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29NotIn(List<String> values) {
            addCriterion("equipment.parameter29 not in", values, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29Between(String value1, String value2) {
            addCriterion("equipment.parameter29 between", value1, value2, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter29NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter29 not between", value1, value2, "parameter29");
            return (Criteria) this;
        }

        public Criteria andParameter30IsNull() {
            addCriterion("equipment.parameter30 is null");
            return (Criteria) this;
        }

        public Criteria andParameter30IsNotNull() {
            addCriterion("equipment.parameter30 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter30EqualTo(String value) {
            addCriterion("equipment.parameter30 =", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30NotEqualTo(String value) {
            addCriterion("equipment.parameter30 <>", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30GreaterThan(String value) {
            addCriterion("equipment.parameter30 >", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter30 >=", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30LessThan(String value) {
            addCriterion("equipment.parameter30 <", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter30 <=", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30Like(String value) {
            addCriterion("equipment.parameter30 like", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30NotLike(String value) {
            addCriterion("equipment.parameter30 not like", value, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30In(List<String> values) {
            addCriterion("equipment.parameter30 in", values, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30NotIn(List<String> values) {
            addCriterion("equipment.parameter30 not in", values, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30Between(String value1, String value2) {
            addCriterion("equipment.parameter30 between", value1, value2, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter30NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter30 not between", value1, value2, "parameter30");
            return (Criteria) this;
        }

        public Criteria andParameter31IsNull() {
            addCriterion("equipment.parameter31 is null");
            return (Criteria) this;
        }

        public Criteria andParameter31IsNotNull() {
            addCriterion("equipment.parameter31 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter31EqualTo(String value) {
            addCriterion("equipment.parameter31 =", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31NotEqualTo(String value) {
            addCriterion("equipment.parameter31 <>", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31GreaterThan(String value) {
            addCriterion("equipment.parameter31 >", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter31 >=", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31LessThan(String value) {
            addCriterion("equipment.parameter31 <", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter31 <=", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31Like(String value) {
            addCriterion("equipment.parameter31 like", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31NotLike(String value) {
            addCriterion("equipment.parameter31 not like", value, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31In(List<String> values) {
            addCriterion("equipment.parameter31 in", values, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31NotIn(List<String> values) {
            addCriterion("equipment.parameter31 not in", values, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31Between(String value1, String value2) {
            addCriterion("equipment.parameter31 between", value1, value2, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter31NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter31 not between", value1, value2, "parameter31");
            return (Criteria) this;
        }

        public Criteria andParameter32IsNull() {
            addCriterion("equipment.parameter32 is null");
            return (Criteria) this;
        }

        public Criteria andParameter32IsNotNull() {
            addCriterion("equipment.parameter32 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter32EqualTo(String value) {
            addCriterion("equipment.parameter32 =", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32NotEqualTo(String value) {
            addCriterion("equipment.parameter32 <>", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32GreaterThan(String value) {
            addCriterion("equipment.parameter32 >", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32GreaterThanOrEqualTo(String value) {
            addCriterion("equipment.parameter32 >=", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32LessThan(String value) {
            addCriterion("equipment.parameter32 <", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32LessThanOrEqualTo(String value) {
            addCriterion("equipment.parameter32 <=", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32Like(String value) {
            addCriterion("equipment.parameter32 like", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32NotLike(String value) {
            addCriterion("equipment.parameter32 not like", value, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32In(List<String> values) {
            addCriterion("equipment.parameter32 in", values, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32NotIn(List<String> values) {
            addCriterion("equipment.parameter32 not in", values, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32Between(String value1, String value2) {
            addCriterion("equipment.parameter32 between", value1, value2, "parameter32");
            return (Criteria) this;
        }

        public Criteria andParameter32NotBetween(String value1, String value2) {
            addCriterion("equipment.parameter32 not between", value1, value2, "parameter32");
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