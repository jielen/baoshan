package com.ufgov.zc.common.zc.model;import java.math.BigDecimal;import java.util.ArrayList;import java.util.Date;import java.util.HashMap;import java.util.Iterator;import java.util.List;import java.util.Map;public class ZcDelegJczwDataExchangeExample {  /**   * This field was generated by Abator for iBATIS.   * This field corresponds to the database table ZC_DELEG_JCZW_DATA_EXCHANGE   *   * @abatorgenerated Thu Oct 27 18:07:40 CST 2011   */  protected String orderByClause;  /**   * This field was generated by Abator for iBATIS.   * This field corresponds to the database table ZC_DELEG_JCZW_DATA_EXCHANGE   *   * @abatorgenerated Thu Oct 27 18:07:40 CST 2011   */  protected List oredCriteria;  private String numLimitStr;  /**   * This method was generated by Abator for iBATIS.   * This method corresponds to the database table ZC_DELEG_JCZW_DATA_EXCHANGE   *   * @abatorgenerated Thu Oct 27 18:07:40 CST 2011   */  public ZcDelegJczwDataExchangeExample() {    oredCriteria = new ArrayList();  }  /**   * This method was generated by Abator for iBATIS.   * This method corresponds to the database table ZC_DELEG_JCZW_DATA_EXCHANGE   *   * @abatorgenerated Thu Oct 27 18:07:40 CST 2011   */  protected ZcDelegJczwDataExchangeExample(ZcDelegJczwDataExchangeExample example) {    this.orderByClause = example.orderByClause;    this.oredCriteria = example.oredCriteria;  }  /**   * This method was generated by Abator for iBATIS.   * This method corresponds to the database table ZC_DELEG_JCZW_DATA_EXCHANGE   *   * @abatorgenerated Thu Oct 27 18:07:40 CST 2011   */  public void setOrderByClause(String orderByClause) {    this.orderByClause = orderByClause;  }  /**   * This method was generated by Abator for iBATIS.   * This method corresponds to the database table ZC_DELEG_JCZW_DATA_EXCHANGE   *   * @abatorgenerated Thu Oct 27 18:07:40 CST 2011   */  public String getOrderByClause() {    return orderByClause;  }  /**   * This method was generated by Abator for iBATIS.   * This method corresponds to the database table ZC_DELEG_JCZW_DATA_EXCHANGE   *   * @abatorgenerated Thu Oct 27 18:07:40 CST 2011   */  public List getOredCriteria() {    return oredCriteria;  }  /**   * This method was generated by Abator for iBATIS.   * This method corresponds to the database table ZC_DELEG_JCZW_DATA_EXCHANGE   *   * @abatorgenerated Thu Oct 27 18:07:40 CST 2011   */  public void or(Criteria criteria) {    oredCriteria.add(criteria);  }  /**   * This method was generated by Abator for iBATIS.   * This method corresponds to the database table ZC_DELEG_JCZW_DATA_EXCHANGE   *   * @abatorgenerated Thu Oct 27 18:07:40 CST 2011   */  public Criteria createCriteria() {    Criteria criteria = createCriteriaInternal();    if (oredCriteria.size() == 0) {      oredCriteria.add(criteria);    }    return criteria;  }  /**   * This method was generated by Abator for iBATIS.   * This method corresponds to the database table ZC_DELEG_JCZW_DATA_EXCHANGE   *   * @abatorgenerated Thu Oct 27 18:07:40 CST 2011   */  protected Criteria createCriteriaInternal() {    Criteria criteria = new Criteria();    return criteria;  }  /**   * This method was generated by Abator for iBATIS.   * This method corresponds to the database table ZC_DELEG_JCZW_DATA_EXCHANGE   *   * @abatorgenerated Thu Oct 27 18:07:40 CST 2011   */  public void clear() {    oredCriteria.clear();  }  /**   * This class was generated by Abator for iBATIS.   * This class corresponds to the database table ZC_DELEG_JCZW_DATA_EXCHANGE   *   * @abatorgenerated Thu Oct 27 18:07:40 CST 2011   */  public static class Criteria {    protected List criteriaWithoutValue;    protected List criteriaWithSingleValue;    protected List criteriaWithListValue;    protected List criteriaWithBetweenValue;    protected Criteria() {      super();      criteriaWithoutValue = new ArrayList();      criteriaWithSingleValue = new ArrayList();      criteriaWithListValue = new ArrayList();      criteriaWithBetweenValue = new ArrayList();    }    public boolean isValid() {      return criteriaWithoutValue.size() > 0 || criteriaWithSingleValue.size() > 0 || criteriaWithListValue.size() > 0      || criteriaWithBetweenValue.size() > 0;    }    public List getCriteriaWithoutValue() {      return criteriaWithoutValue;    }    public List getCriteriaWithSingleValue() {      return criteriaWithSingleValue;    }    public List getCriteriaWithListValue() {      return criteriaWithListValue;    }    public List getCriteriaWithBetweenValue() {      return criteriaWithBetweenValue;    }    protected void addCriterion(String condition) {      if (condition == null) {        throw new RuntimeException("Value for condition cannot be null");      }      criteriaWithoutValue.add(condition);    }    protected void addCriterion(String condition, Object value, String property) {      if (value == null) {        throw new RuntimeException("Value for " + property + " cannot be null");      }      Map map = new HashMap();      map.put("condition", condition);      map.put("value", value);      criteriaWithSingleValue.add(map);    }    protected void addCriterion(String condition, List values, String property) {      if (values == null || values.size() == 0) {        throw new RuntimeException("Value list for " + property + " cannot be null or empty");      }      Map map = new HashMap();      map.put("condition", condition);      map.put("values", values);      criteriaWithListValue.add(map);    }    protected void addCriterion(String condition, Object value1, Object value2, String property) {      if (value1 == null || value2 == null) {        throw new RuntimeException("Between values for " + property + " cannot be null");      }      List list = new ArrayList();      list.add(value1);      list.add(value2);      Map map = new HashMap();      map.put("condition", condition);      map.put("values", list);      criteriaWithBetweenValue.add(map);    }    protected void addCriterionForJDBCDate(String condition, Date value, String property) {      addCriterion(condition, new java.sql.Date(value.getTime()), property);    }    protected void addCriterionForJDBCDate(String condition, List values, String property) {      if (values == null || values.size() == 0) {        throw new RuntimeException("Value list for " + property + " cannot be null or empty");      }      List dateList = new ArrayList();      Iterator iter = values.iterator();      while (iter.hasNext()) {        dateList.add(new java.sql.Date(((Date) iter.next()).getTime()));      }      addCriterion(condition, dateList, property);    }    protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {      if (value1 == null || value2 == null) {        throw new RuntimeException("Between values for " + property + " cannot be null");      }      addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);    }    public Criteria andExchangeIdIsNull() {      addCriterion("EXCHANGE_ID is null");      return this;    }    public Criteria andExchangeIdIsNotNull() {      addCriterion("EXCHANGE_ID is not null");      return this;    }    public Criteria andExchangeIdEqualTo(BigDecimal value) {      addCriterion("EXCHANGE_ID =", value, "exchangeId");      return this;    }    public Criteria andExchangeIdNotEqualTo(BigDecimal value) {      addCriterion("EXCHANGE_ID <>", value, "exchangeId");      return this;    }    public Criteria andExchangeIdGreaterThan(BigDecimal value) {      addCriterion("EXCHANGE_ID >", value, "exchangeId");      return this;    }    public Criteria andExchangeIdGreaterThanOrEqualTo(BigDecimal value) {      addCriterion("EXCHANGE_ID >=", value, "exchangeId");      return this;    }    public Criteria andExchangeIdLessThan(BigDecimal value) {      addCriterion("EXCHANGE_ID <", value, "exchangeId");      return this;    }    public Criteria andExchangeIdLessThanOrEqualTo(BigDecimal value) {      addCriterion("EXCHANGE_ID <=", value, "exchangeId");      return this;    }    public Criteria andExchangeIdIn(List values) {      addCriterion("EXCHANGE_ID in", values, "exchangeId");      return this;    }    public Criteria andExchangeIdNotIn(List values) {      addCriterion("EXCHANGE_ID not in", values, "exchangeId");      return this;    }    public Criteria andExchangeIdBetween(BigDecimal value1, BigDecimal value2) {      addCriterion("EXCHANGE_ID between", value1, value2, "exchangeId");      return this;    }    public Criteria andExchangeIdNotBetween(BigDecimal value1, BigDecimal value2) {      addCriterion("EXCHANGE_ID not between", value1, value2, "exchangeId");      return this;    }    public Criteria andDataTypeIsNull() {      addCriterion("DATA_TYPE is null");      return this;    }    public Criteria andDataTypeIsNotNull() {      addCriterion("DATA_TYPE is not null");      return this;    }    public Criteria andDataTypeEqualTo(String value) {      addCriterion("DATA_TYPE =", value, "dataType");      return this;    }    public Criteria andDataTypeNotEqualTo(String value) {      addCriterion("DATA_TYPE <>", value, "dataType");      return this;    }    public Criteria andDataTypeGreaterThan(String value) {      addCriterion("DATA_TYPE >", value, "dataType");      return this;    }    public Criteria andDataTypeGreaterThanOrEqualTo(String value) {      addCriterion("DATA_TYPE >=", value, "dataType");      return this;    }    public Criteria andDataTypeLessThan(String value) {      addCriterion("DATA_TYPE <", value, "dataType");      return this;    }    public Criteria andDataTypeLessThanOrEqualTo(String value) {      addCriterion("DATA_TYPE <=", value, "dataType");      return this;    }    public Criteria andDataTypeLike(String value) {      addCriterion("DATA_TYPE like", value, "dataType");      return this;    }    public Criteria andDataTypeNotLike(String value) {      addCriterion("DATA_TYPE not like", value, "dataType");      return this;    }    public Criteria andDataTypeIn(List values) {      addCriterion("DATA_TYPE in", values, "dataType");      return this;    }    public Criteria andDataTypeNotIn(List values) {      addCriterion("DATA_TYPE not in", values, "dataType");      return this;    }    public Criteria andDataTypeBetween(String value1, String value2) {      addCriterion("DATA_TYPE between", value1, value2, "dataType");      return this;    }    public Criteria andDataTypeNotBetween(String value1, String value2) {      addCriterion("DATA_TYPE not between", value1, value2, "dataType");      return this;    }    public Criteria andBusinessCodeIsNull() {      addCriterion("BUSINESS_CODE is null");      return this;    }    public Criteria andBusinessCodeIsNotNull() {      addCriterion("BUSINESS_CODE is not null");      return this;    }    public Criteria andBusinessCodeEqualTo(String value) {      addCriterion("BUSINESS_CODE =", value, "businessCode");      return this;    }    public Criteria andBusinessCodeNotEqualTo(String value) {      addCriterion("BUSINESS_CODE <>", value, "businessCode");      return this;    }    public Criteria andBusinessCodeGreaterThan(String value) {      addCriterion("BUSINESS_CODE >", value, "businessCode");      return this;    }    public Criteria andBusinessCodeGreaterThanOrEqualTo(String value) {      addCriterion("BUSINESS_CODE >=", value, "businessCode");      return this;    }    public Criteria andBusinessCodeLessThan(String value) {      addCriterion("BUSINESS_CODE <", value, "businessCode");      return this;    }    public Criteria andBusinessCodeLessThanOrEqualTo(String value) {      addCriterion("BUSINESS_CODE <=", value, "businessCode");      return this;    }    public Criteria andBusinessCodeLike(String value) {      addCriterion("BUSINESS_CODE like", value, "businessCode");      return this;    }    public Criteria andBusinessCodeNotLike(String value) {      addCriterion("BUSINESS_CODE not like", value, "businessCode");      return this;    }    public Criteria andBusinessCodeIn(List values) {      addCriterion("BUSINESS_CODE in", values, "businessCode");      return this;    }    public Criteria andBusinessCodeNotIn(List values) {      addCriterion("BUSINESS_CODE not in", values, "businessCode");      return this;    }    public Criteria andBusinessCodeBetween(String value1, String value2) {      addCriterion("BUSINESS_CODE between", value1, value2, "businessCode");      return this;    }    public Criteria andBusinessCodeNotBetween(String value1, String value2) {      addCriterion("BUSINESS_CODE not between", value1, value2, "businessCode");      return this;    }    public Criteria andMemoIsNull() {      addCriterion("MEMO is null");      return this;    }    public Criteria andMemoIsNotNull() {      addCriterion("MEMO is not null");      return this;    }    public Criteria andMemoEqualTo(String value) {      addCriterion("MEMO =", value, "memo");      return this;    }    public Criteria andMemoNotEqualTo(String value) {      addCriterion("MEMO <>", value, "memo");      return this;    }    public Criteria andMemoGreaterThan(String value) {      addCriterion("MEMO >", value, "memo");      return this;    }    public Criteria andMemoGreaterThanOrEqualTo(String value) {      addCriterion("MEMO >=", value, "memo");      return this;    }    public Criteria andMemoLessThan(String value) {      addCriterion("MEMO <", value, "memo");      return this;    }    public Criteria andMemoLessThanOrEqualTo(String value) {      addCriterion("MEMO <=", value, "memo");      return this;    }    public Criteria andMemoLike(String value) {      addCriterion("MEMO like", value, "memo");      return this;    }    public Criteria andMemoNotLike(String value) {      addCriterion("MEMO not like", value, "memo");      return this;    }    public Criteria andMemoIn(List values) {      addCriterion("MEMO in", values, "memo");      return this;    }    public Criteria andMemoNotIn(List values) {      addCriterion("MEMO not in", values, "memo");      return this;    }    public Criteria andMemoBetween(String value1, String value2) {      addCriterion("MEMO between", value1, value2, "memo");      return this;    }    public Criteria andMemoNotBetween(String value1, String value2) {      addCriterion("MEMO not between", value1, value2, "memo");      return this;    }    public Criteria andOpTypeIsNull() {      addCriterion("OP_TYPE is null");      return this;    }    public Criteria andOpTypeIsNotNull() {      addCriterion("OP_TYPE is not null");      return this;    }    public Criteria andOpTypeEqualTo(String value) {      addCriterion("OP_TYPE =", value, "opType");      return this;    }    public Criteria andOpTypeNotEqualTo(String value) {      addCriterion("OP_TYPE <>", value, "opType");      return this;    }    public Criteria andOpTypeGreaterThan(String value) {      addCriterion("OP_TYPE >", value, "opType");      return this;    }    public Criteria andOpTypeGreaterThanOrEqualTo(String value) {      addCriterion("OP_TYPE >=", value, "opType");      return this;    }    public Criteria andOpTypeLessThan(String value) {      addCriterion("OP_TYPE <", value, "opType");      return this;    }    public Criteria andOpTypeLessThanOrEqualTo(String value) {      addCriterion("OP_TYPE <=", value, "opType");      return this;    }    public Criteria andOpTypeLike(String value) {      addCriterion("OP_TYPE like", value, "opType");      return this;    }    public Criteria andOpTypeNotLike(String value) {      addCriterion("OP_TYPE not like", value, "opType");      return this;    }    public Criteria andOpTypeIn(List values) {      addCriterion("OP_TYPE in", values, "opType");      return this;    }    public Criteria andOpTypeNotIn(List values) {      addCriterion("OP_TYPE not in", values, "opType");      return this;    }    public Criteria andOpTypeBetween(String value1, String value2) {      addCriterion("OP_TYPE between", value1, value2, "opType");      return this;    }    public Criteria andOpTypeNotBetween(String value1, String value2) {      addCriterion("OP_TYPE not between", value1, value2, "opType");      return this;    }    public Criteria andEditDateIsNull() {      addCriterion("EDIT_DATE is null");      return this;    }    public Criteria andEditDateIsNotNull() {      addCriterion("EDIT_DATE is not null");      return this;    }    public Criteria andEditDateEqualTo(Date value) {      addCriterionForJDBCDate("EDIT_DATE =", value, "editDate");      return this;    }    public Criteria andEditDateNotEqualTo(Date value) {      addCriterionForJDBCDate("EDIT_DATE <>", value, "editDate");      return this;    }    public Criteria andEditDateGreaterThan(Date value) {      addCriterionForJDBCDate("EDIT_DATE >", value, "editDate");      return this;    }    public Criteria andEditDateGreaterThanOrEqualTo(Date value) {      addCriterionForJDBCDate("EDIT_DATE >=", value, "editDate");      return this;    }    public Criteria andEditDateLessThan(Date value) {      addCriterionForJDBCDate("EDIT_DATE <", value, "editDate");      return this;    }    public Criteria andEditDateLessThanOrEqualTo(Date value) {      addCriterionForJDBCDate("EDIT_DATE <=", value, "editDate");      return this;    }    public Criteria andEditDateIn(List values) {      addCriterionForJDBCDate("EDIT_DATE in", values, "editDate");      return this;    }    public Criteria andEditDateNotIn(List values) {      addCriterionForJDBCDate("EDIT_DATE not in", values, "editDate");      return this;    }    public Criteria andEditDateBetween(Date value1, Date value2) {      addCriterionForJDBCDate("EDIT_DATE between", value1, value2, "editDate");      return this;    }    public Criteria andEditDateNotBetween(Date value1, Date value2) {      addCriterionForJDBCDate("EDIT_DATE not between", value1, value2, "editDate");      return this;    }    public Criteria andEditUserIdIsNull() {      addCriterion("EDIT_USER_ID is null");      return this;    }    public Criteria andEditUserIdIsNotNull() {      addCriterion("EDIT_USER_ID is not null");      return this;    }    public Criteria andEditUserIdEqualTo(String value) {      addCriterion("EDIT_USER_ID =", value, "editUserId");      return this;    }    public Criteria andEditUserIdNotEqualTo(String value) {      addCriterion("EDIT_USER_ID <>", value, "editUserId");      return this;    }    public Criteria andEditUserIdGreaterThan(String value) {      addCriterion("EDIT_USER_ID >", value, "editUserId");      return this;    }    public Criteria andEditUserIdGreaterThanOrEqualTo(String value) {      addCriterion("EDIT_USER_ID >=", value, "editUserId");      return this;    }    public Criteria andEditUserIdLessThan(String value) {      addCriterion("EDIT_USER_ID <", value, "editUserId");      return this;    }    public Criteria andEditUserIdLessThanOrEqualTo(String value) {      addCriterion("EDIT_USER_ID <=", value, "editUserId");      return this;    }    public Criteria andEditUserIdLike(String value) {      addCriterion("EDIT_USER_ID like", value, "editUserId");      return this;    }    public Criteria andEditUserIdNotLike(String value) {      addCriterion("EDIT_USER_ID not like", value, "editUserId");      return this;    }    public Criteria andEditUserIdIn(List values) {      addCriterion("EDIT_USER_ID in", values, "editUserId");      return this;    }    public Criteria andEditUserIdNotIn(List values) {      addCriterion("EDIT_USER_ID not in", values, "editUserId");      return this;    }    public Criteria andEditUserIdBetween(String value1, String value2) {      addCriterion("EDIT_USER_ID between", value1, value2, "editUserId");      return this;    }    public Criteria andEditUserIdNotBetween(String value1, String value2) {      addCriterion("EDIT_USER_ID not between", value1, value2, "editUserId");      return this;    }    public Criteria andEditUserNameIsNull() {      addCriterion("EDIT_USER_NAME is null");      return this;    }    public Criteria andEditUserNameIsNotNull() {      addCriterion("EDIT_USER_NAME is not null");      return this;    }    public Criteria andEditUserNameEqualTo(String value) {      addCriterion("EDIT_USER_NAME =", value, "editUserName");      return this;    }    public Criteria andEditUserNameNotEqualTo(String value) {      addCriterion("EDIT_USER_NAME <>", value, "editUserName");      return this;    }    public Criteria andEditUserNameGreaterThan(String value) {      addCriterion("EDIT_USER_NAME >", value, "editUserName");      return this;    }    public Criteria andEditUserNameGreaterThanOrEqualTo(String value) {      addCriterion("EDIT_USER_NAME >=", value, "editUserName");      return this;    }    public Criteria andEditUserNameLessThan(String value) {      addCriterion("EDIT_USER_NAME <", value, "editUserName");      return this;    }    public Criteria andEditUserNameLessThanOrEqualTo(String value) {      addCriterion("EDIT_USER_NAME <=", value, "editUserName");      return this;    }    public Criteria andEditUserNameLike(String value) {      addCriterion("EDIT_USER_NAME like", value, "editUserName");      return this;    }    public Criteria andEditUserNameNotLike(String value) {      addCriterion("EDIT_USER_NAME not like", value, "editUserName");      return this;    }    public Criteria andEditUserNameIn(List values) {      addCriterion("EDIT_USER_NAME in", values, "editUserName");      return this;    }    public Criteria andEditUserNameNotIn(List values) {      addCriterion("EDIT_USER_NAME not in", values, "editUserName");      return this;    }    public Criteria andEditUserNameBetween(String value1, String value2) {      addCriterion("EDIT_USER_NAME between", value1, value2, "editUserName");      return this;    }    public Criteria andEditUserNameNotBetween(String value1, String value2) {      addCriterion("EDIT_USER_NAME not between", value1, value2, "editUserName");      return this;    }  }  public String getNumLimitStr() {    return numLimitStr;  }  public void setNumLimitStr(String numLimitStr) {    this.numLimitStr = numLimitStr;  }}