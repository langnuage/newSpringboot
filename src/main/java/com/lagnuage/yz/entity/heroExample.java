package com.lagnuage.yz.entity;

import java.util.ArrayList;
import java.util.List;

public class heroExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public heroExample() {
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

        public Criteria andHnameIsNull() {
            addCriterion("hname is null");
            return (Criteria) this;
        }

        public Criteria andHnameIsNotNull() {
            addCriterion("hname is not null");
            return (Criteria) this;
        }

        public Criteria andHnameEqualTo(String value) {
            addCriterion("hname =", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotEqualTo(String value) {
            addCriterion("hname <>", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameGreaterThan(String value) {
            addCriterion("hname >", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameGreaterThanOrEqualTo(String value) {
            addCriterion("hname >=", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameLessThan(String value) {
            addCriterion("hname <", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameLessThanOrEqualTo(String value) {
            addCriterion("hname <=", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameLike(String value) {
            addCriterion("hname like", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotLike(String value) {
            addCriterion("hname not like", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameIn(List<String> values) {
            addCriterion("hname in", values, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotIn(List<String> values) {
            addCriterion("hname not in", values, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameBetween(String value1, String value2) {
            addCriterion("hname between", value1, value2, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotBetween(String value1, String value2) {
            addCriterion("hname not between", value1, value2, "hname");
            return (Criteria) this;
        }

        public Criteria andHpIsNull() {
            addCriterion("hp is null");
            return (Criteria) this;
        }

        public Criteria andHpIsNotNull() {
            addCriterion("hp is not null");
            return (Criteria) this;
        }

        public Criteria andHpEqualTo(Integer value) {
            addCriterion("hp =", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotEqualTo(Integer value) {
            addCriterion("hp <>", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThan(Integer value) {
            addCriterion("hp >", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThanOrEqualTo(Integer value) {
            addCriterion("hp >=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThan(Integer value) {
            addCriterion("hp <", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThanOrEqualTo(Integer value) {
            addCriterion("hp <=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpIn(List<Integer> values) {
            addCriterion("hp in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotIn(List<Integer> values) {
            addCriterion("hp not in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpBetween(Integer value1, Integer value2) {
            addCriterion("hp between", value1, value2, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotBetween(Integer value1, Integer value2) {
            addCriterion("hp not between", value1, value2, "hp");
            return (Criteria) this;
        }

        public Criteria andDamageIsNull() {
            addCriterion("damage is null");
            return (Criteria) this;
        }

        public Criteria andDamageIsNotNull() {
            addCriterion("damage is not null");
            return (Criteria) this;
        }

        public Criteria andDamageEqualTo(Integer value) {
            addCriterion("damage =", value, "damage");
            return (Criteria) this;
        }

        public Criteria andDamageNotEqualTo(Integer value) {
            addCriterion("damage <>", value, "damage");
            return (Criteria) this;
        }

        public Criteria andDamageGreaterThan(Integer value) {
            addCriterion("damage >", value, "damage");
            return (Criteria) this;
        }

        public Criteria andDamageGreaterThanOrEqualTo(Integer value) {
            addCriterion("damage >=", value, "damage");
            return (Criteria) this;
        }

        public Criteria andDamageLessThan(Integer value) {
            addCriterion("damage <", value, "damage");
            return (Criteria) this;
        }

        public Criteria andDamageLessThanOrEqualTo(Integer value) {
            addCriterion("damage <=", value, "damage");
            return (Criteria) this;
        }

        public Criteria andDamageIn(List<Integer> values) {
            addCriterion("damage in", values, "damage");
            return (Criteria) this;
        }

        public Criteria andDamageNotIn(List<Integer> values) {
            addCriterion("damage not in", values, "damage");
            return (Criteria) this;
        }

        public Criteria andDamageBetween(Integer value1, Integer value2) {
            addCriterion("damage between", value1, value2, "damage");
            return (Criteria) this;
        }

        public Criteria andDamageNotBetween(Integer value1, Integer value2) {
            addCriterion("damage not between", value1, value2, "damage");
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