package com.perfect.trains.model;

import java.util.ArrayList;
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

        public Criteria andIdIsNull() {
            addCriterion("sys_user.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("sys_user.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("sys_user.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("sys_user.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("sys_user.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_user.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("sys_user.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_user.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("sys_user.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("sys_user.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("sys_user.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_user.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNull() {
            addCriterion("sys_user.login_id is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("sys_user.login_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(String value) {
            addCriterion("sys_user.login_id =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(String value) {
            addCriterion("sys_user.login_id <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(String value) {
            addCriterion("sys_user.login_id >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.login_id >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(String value) {
            addCriterion("sys_user.login_id <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(String value) {
            addCriterion("sys_user.login_id <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLike(String value) {
            addCriterion("sys_user.login_id like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotLike(String value) {
            addCriterion("sys_user.login_id not like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<String> values) {
            addCriterion("sys_user.login_id in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<String> values) {
            addCriterion("sys_user.login_id not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(String value1, String value2) {
            addCriterion("sys_user.login_id between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(String value1, String value2) {
            addCriterion("sys_user.login_id not between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("sys_user.`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("sys_user.`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("sys_user.`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("sys_user.`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("sys_user.`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("sys_user.`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("sys_user.`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("sys_user.`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("sys_user.`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("sys_user.`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("sys_user.`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("sys_user.`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("sys_user.`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("sys_user.`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("sys_user.`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("sys_user.`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("sys_user.`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("sys_user.`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("sys_user.`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("sys_user.`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("sys_user.`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("sys_user.`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("sys_user.`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("sys_user.`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("sys_user.`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("sys_user.`password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("sys_user.mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("sys_user.mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("sys_user.mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("sys_user.mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("sys_user.mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("sys_user.mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("sys_user.mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("sys_user.mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("sys_user.mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("sys_user.mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("sys_user.mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("sys_user.mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("sys_user.mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("sys_user.department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("sys_user.department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Long value) {
            addCriterion("sys_user.department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Long value) {
            addCriterion("sys_user.department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Long value) {
            addCriterion("sys_user.department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_user.department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Long value) {
            addCriterion("sys_user.department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_user.department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Long> values) {
            addCriterion("sys_user.department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Long> values) {
            addCriterion("sys_user.department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("sys_user.department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_user.department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("sys_user.phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("sys_user.phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("sys_user.phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("sys_user.phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("sys_user.phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("sys_user.phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("sys_user.phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("sys_user.phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("sys_user.phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("sys_user.phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("sys_user.phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("sys_user.phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("sys_user.phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIsNull() {
            addCriterion("sys_user.permission_group is null");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIsNotNull() {
            addCriterion("sys_user.permission_group is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupEqualTo(String value) {
            addCriterion("sys_user.permission_group =", value, "permissionGroup");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupNotEqualTo(String value) {
            addCriterion("sys_user.permission_group <>", value, "permissionGroup");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupGreaterThan(String value) {
            addCriterion("sys_user.permission_group >", value, "permissionGroup");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.permission_group >=", value, "permissionGroup");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupLessThan(String value) {
            addCriterion("sys_user.permission_group <", value, "permissionGroup");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupLessThanOrEqualTo(String value) {
            addCriterion("sys_user.permission_group <=", value, "permissionGroup");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupLike(String value) {
            addCriterion("sys_user.permission_group like", value, "permissionGroup");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupNotLike(String value) {
            addCriterion("sys_user.permission_group not like", value, "permissionGroup");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIn(List<String> values) {
            addCriterion("sys_user.permission_group in", values, "permissionGroup");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupNotIn(List<String> values) {
            addCriterion("sys_user.permission_group not in", values, "permissionGroup");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupBetween(String value1, String value2) {
            addCriterion("sys_user.permission_group between", value1, value2, "permissionGroup");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupNotBetween(String value1, String value2) {
            addCriterion("sys_user.permission_group not between", value1, value2, "permissionGroup");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("sys_user.`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("sys_user.`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("sys_user.`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("sys_user.`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("sys_user.`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("sys_user.`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("sys_user.`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("sys_user.`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("sys_user.`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("sys_user.`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("sys_user.`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("sys_user.`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("sys_user.`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNull() {
            addCriterion("sys_user.employeeId is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNotNull() {
            addCriterion("sys_user.employeeId is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidEqualTo(String value) {
            addCriterion("sys_user.employeeId =", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotEqualTo(String value) {
            addCriterion("sys_user.employeeId <>", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThan(String value) {
            addCriterion("sys_user.employeeId >", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.employeeId >=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThan(String value) {
            addCriterion("sys_user.employeeId <", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThanOrEqualTo(String value) {
            addCriterion("sys_user.employeeId <=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLike(String value) {
            addCriterion("sys_user.employeeId like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotLike(String value) {
            addCriterion("sys_user.employeeId not like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIn(List<String> values) {
            addCriterion("sys_user.employeeId in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotIn(List<String> values) {
            addCriterion("sys_user.employeeId not in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidBetween(String value1, String value2) {
            addCriterion("sys_user.employeeId between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotBetween(String value1, String value2) {
            addCriterion("sys_user.employeeId not between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andRaskIsNull() {
            addCriterion("sys_user.rask is null");
            return (Criteria) this;
        }

        public Criteria andRaskIsNotNull() {
            addCriterion("sys_user.rask is not null");
            return (Criteria) this;
        }

        public Criteria andRaskEqualTo(String value) {
            addCriterion("sys_user.rask =", value, "rask");
            return (Criteria) this;
        }

        public Criteria andRaskNotEqualTo(String value) {
            addCriterion("sys_user.rask <>", value, "rask");
            return (Criteria) this;
        }

        public Criteria andRaskGreaterThan(String value) {
            addCriterion("sys_user.rask >", value, "rask");
            return (Criteria) this;
        }

        public Criteria andRaskGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.rask >=", value, "rask");
            return (Criteria) this;
        }

        public Criteria andRaskLessThan(String value) {
            addCriterion("sys_user.rask <", value, "rask");
            return (Criteria) this;
        }

        public Criteria andRaskLessThanOrEqualTo(String value) {
            addCriterion("sys_user.rask <=", value, "rask");
            return (Criteria) this;
        }

        public Criteria andRaskLike(String value) {
            addCriterion("sys_user.rask like", value, "rask");
            return (Criteria) this;
        }

        public Criteria andRaskNotLike(String value) {
            addCriterion("sys_user.rask not like", value, "rask");
            return (Criteria) this;
        }

        public Criteria andRaskIn(List<String> values) {
            addCriterion("sys_user.rask in", values, "rask");
            return (Criteria) this;
        }

        public Criteria andRaskNotIn(List<String> values) {
            addCriterion("sys_user.rask not in", values, "rask");
            return (Criteria) this;
        }

        public Criteria andRaskBetween(String value1, String value2) {
            addCriterion("sys_user.rask between", value1, value2, "rask");
            return (Criteria) this;
        }

        public Criteria andRaskNotBetween(String value1, String value2) {
            addCriterion("sys_user.rask not between", value1, value2, "rask");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIsNull() {
            addCriterion("sys_user.department_code is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIsNotNull() {
            addCriterion("sys_user.department_code is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeEqualTo(String value) {
            addCriterion("sys_user.department_code =", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotEqualTo(String value) {
            addCriterion("sys_user.department_code <>", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeGreaterThan(String value) {
            addCriterion("sys_user.department_code >", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user.department_code >=", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLessThan(String value) {
            addCriterion("sys_user.department_code <", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLessThanOrEqualTo(String value) {
            addCriterion("sys_user.department_code <=", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLike(String value) {
            addCriterion("sys_user.department_code like", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotLike(String value) {
            addCriterion("sys_user.department_code not like", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIn(List<String> values) {
            addCriterion("sys_user.department_code in", values, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotIn(List<String> values) {
            addCriterion("sys_user.department_code not in", values, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeBetween(String value1, String value2) {
            addCriterion("sys_user.department_code between", value1, value2, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotBetween(String value1, String value2) {
            addCriterion("sys_user.department_code not between", value1, value2, "departmentCode");
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