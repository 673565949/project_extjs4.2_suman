package com.perfect.trains.model;

import java.util.ArrayList;
import java.util.List;

public class TrainModelEquipmentClassificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainModelEquipmentClassificationExample() {
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
            addCriterion("trainModelEquipmentClassification.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("trainModelEquipmentClassification.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("trainModelEquipmentClassification.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("trainModelEquipmentClassification.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("trainModelEquipmentClassification.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trainModelEquipmentClassification.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("trainModelEquipmentClassification.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("trainModelEquipmentClassification.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("trainModelEquipmentClassification.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("trainModelEquipmentClassification.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("trainModelEquipmentClassification.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("trainModelEquipmentClassification.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdIsNull() {
            addCriterion("trainModelEquipmentClassification.equipment_classification_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdIsNotNull() {
            addCriterion("trainModelEquipmentClassification.equipment_classification_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdEqualTo(Long value) {
            addCriterion("trainModelEquipmentClassification.equipment_classification_id =", value, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdNotEqualTo(Long value) {
            addCriterion("trainModelEquipmentClassification.equipment_classification_id <>", value, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdGreaterThan(Long value) {
            addCriterion("trainModelEquipmentClassification.equipment_classification_id >", value, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trainModelEquipmentClassification.equipment_classification_id >=", value, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdLessThan(Long value) {
            addCriterion("trainModelEquipmentClassification.equipment_classification_id <", value, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdLessThanOrEqualTo(Long value) {
            addCriterion("trainModelEquipmentClassification.equipment_classification_id <=", value, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdIn(List<Long> values) {
            addCriterion("trainModelEquipmentClassification.equipment_classification_id in", values, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdNotIn(List<Long> values) {
            addCriterion("trainModelEquipmentClassification.equipment_classification_id not in", values, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdBetween(Long value1, Long value2) {
            addCriterion("trainModelEquipmentClassification.equipment_classification_id between", value1, value2, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentClassificationIdNotBetween(Long value1, Long value2) {
            addCriterion("trainModelEquipmentClassification.equipment_classification_id not between", value1, value2, "equipmentClassificationId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdIsNull() {
            addCriterion("trainModelEquipmentClassification.train_model_id is null");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdIsNotNull() {
            addCriterion("trainModelEquipmentClassification.train_model_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdEqualTo(Long value) {
            addCriterion("trainModelEquipmentClassification.train_model_id =", value, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdNotEqualTo(Long value) {
            addCriterion("trainModelEquipmentClassification.train_model_id <>", value, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdGreaterThan(Long value) {
            addCriterion("trainModelEquipmentClassification.train_model_id >", value, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trainModelEquipmentClassification.train_model_id >=", value, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdLessThan(Long value) {
            addCriterion("trainModelEquipmentClassification.train_model_id <", value, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdLessThanOrEqualTo(Long value) {
            addCriterion("trainModelEquipmentClassification.train_model_id <=", value, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdIn(List<Long> values) {
            addCriterion("trainModelEquipmentClassification.train_model_id in", values, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdNotIn(List<Long> values) {
            addCriterion("trainModelEquipmentClassification.train_model_id not in", values, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdBetween(Long value1, Long value2) {
            addCriterion("trainModelEquipmentClassification.train_model_id between", value1, value2, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdNotBetween(Long value1, Long value2) {
            addCriterion("trainModelEquipmentClassification.train_model_id not between", value1, value2, "trainModelId");
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