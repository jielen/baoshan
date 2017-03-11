package com.ufgov.zc.common.sf.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ufgov.zc.common.util.EmpMeta;
import com.ufgov.zc.common.zc.model.ZcBaseBill;

public class SfJdDocAudit extends ZcBaseBill {

  /**
  * 
  */
  private static final long serialVersionUID = -1002170070279897573L;

  public static final String COL_DOC_QUATITY = "SF_JD_DOC_AUDIT_DOC_QUATITY"; // 发文数量

  public static final String COL_ENTRUST_CODE = "SF_JD_DOC_AUDIT_ENTRUST_CODE"; // 委托编号

  public static final String COL_ENTRUST_ID = "SF_JD_DOC_AUDIT_ENTRUST_ID"; // 委托ID

  public static final String COL_INPUTOR = "SF_JD_DOC_AUDIT_INPUTOR"; // 录入人

  public static final String COL_INPUT_DATE = "SF_JD_DOC_AUDIT_INPUT_DATE"; // 录入时间

  public static final String COL_JD_DOC_AUDIT_ID = "SF_JD_DOC_AUDIT_JD_DOC_AUDIT_ID"; // 鉴定文书审批单ID

  public static final String COL_NAME = "SF_JD_DOC_AUDIT_NAME"; // 名称

  public static final String COL_ND = "SF_JD_DOC_AUDIT_ND"; // 年度

  public static final String COL_PHOTOGRAPHER = "SF_JD_DOC_AUDIT_PHOTOGRAPHER"; // 检验照片拍摄人

  public static final String COL_PROCESS_INST_ID = "SF_JD_DOC_AUDIT_PROCESS_INST_ID"; // 工作流实例号

  public static final String COL_REMARK = "SF_JD_DOC_AUDIT_REMARK"; // 备注

  public static final String COL_REPORT_TYPE = "SF_JD_DOC_AUDIT_REPORT_TYPE"; // 发文类别

  public static final String COL_STATUS = "SF_JD_DOC_AUDIT_STATUS"; // 状态

  public static final String COL_WTF = "SF_JD_DOC_AUDIT_WTF"; // 委托方

  public static final String SEQ_SF_JD_DOC_AUDIT_ID = "SEQ_SF_JD_DOC_AUDIT_ID";

  /**
   * 司法鉴定文书页签
   */
  public static final String TAB_ID = "SfJdDocAudit_Tab";

  /**
   * 搜索条件
   */
  public static final String SEARCH_ID = "SfJdDocAudit_search";

  public static final String SF_VS_JD_DOC_AUDIT_STATUS = "SF_VS_JD_DOC_AUDIT_STATUS";

  private List detailLst = new ArrayList();

  private SfEntrust entrust = new SfEntrust();
  
  private SfJdReport report=new SfJdReport();
  
  private List materialLst=new ArrayList(); 
   
  private String wtf;
   

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_JD_DOC_AUDIT.JD_DOC_AUDIT_ID
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  private BigDecimal jdDocAuditId;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_JD_DOC_AUDIT.INPUTOR
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  private String inputor;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_JD_DOC_AUDIT.INPUT_DATE
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  private Date inputDate;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_JD_DOC_AUDIT.DOC_QUATITY
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  private Integer docQuatity;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_JD_DOC_AUDIT.REPORT_TYPE
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  private String reportType;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_JD_DOC_AUDIT.REMARK
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  private String remark;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_JD_DOC_AUDIT.STATUS
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  private String status;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_JD_DOC_AUDIT.PHOTOGRAPHER
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  private String photographer;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_JD_DOC_AUDIT.ENTRUST_ID
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  private BigDecimal entrustId;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_JD_DOC_AUDIT.NAME
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  private String name;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_JD_DOC_AUDIT.ENTRUST_CODE
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  private String entrustCode;

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_JD_DOC_AUDIT.JD_DOC_AUDIT_ID
   *
   * @return the value of SF_JD_DOC_AUDIT.JD_DOC_AUDIT_ID
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public BigDecimal getJdDocAuditId() {
    return jdDocAuditId;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_JD_DOC_AUDIT.JD_DOC_AUDIT_ID
   *
   * @param jdDocAuditId the value for SF_JD_DOC_AUDIT.JD_DOC_AUDIT_ID
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public void setJdDocAuditId(BigDecimal jdDocAuditId) {
    this.jdDocAuditId = jdDocAuditId;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_JD_DOC_AUDIT.INPUTOR
   *
   * @return the value of SF_JD_DOC_AUDIT.INPUTOR
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public String getInputor() {
    return inputor;
  }

  public String getInputorName() {
    return EmpMeta.getEmpName(inputor);
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_JD_DOC_AUDIT.INPUTOR
   *
   * @param inputor the value for SF_JD_DOC_AUDIT.INPUTOR
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public void setInputor(String inputor) {
    this.inputor = inputor;
  }

  public void setInputorName(String inputorName) {
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_JD_DOC_AUDIT.INPUT_DATE
   *
   * @return the value of SF_JD_DOC_AUDIT.INPUT_DATE
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public Date getInputDate() {
    return inputDate;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_JD_DOC_AUDIT.INPUT_DATE
   *
   * @param inputDate the value for SF_JD_DOC_AUDIT.INPUT_DATE
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public void setInputDate(Date inputDate) {
    this.inputDate = inputDate;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_JD_DOC_AUDIT.DOC_QUATITY
   *
   * @return the value of SF_JD_DOC_AUDIT.DOC_QUATITY
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public Integer getDocQuatity() {
    return docQuatity;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_JD_DOC_AUDIT.DOC_QUATITY
   *
   * @param docQuatity the value for SF_JD_DOC_AUDIT.DOC_QUATITY
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public void setDocQuatity(Integer docQuatity) {
    this.docQuatity = docQuatity;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_JD_DOC_AUDIT.REPORT_TYPE
   *
   * @return the value of SF_JD_DOC_AUDIT.REPORT_TYPE
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public String getReportType() {
    return reportType;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_JD_DOC_AUDIT.REPORT_TYPE
   *
   * @param reportType the value for SF_JD_DOC_AUDIT.REPORT_TYPE
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_JD_DOC_AUDIT.REMARK
   *
   * @return the value of SF_JD_DOC_AUDIT.REMARK
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public String getRemark() {
    return remark;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_JD_DOC_AUDIT.REMARK
   *
   * @param remark the value for SF_JD_DOC_AUDIT.REMARK
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public void setRemark(String remark) {
    this.remark = remark;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_JD_DOC_AUDIT.STATUS
   *
   * @return the value of SF_JD_DOC_AUDIT.STATUS
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public String getStatus() {
    return status;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_JD_DOC_AUDIT.STATUS
   *
   * @param status the value for SF_JD_DOC_AUDIT.STATUS
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_JD_DOC_AUDIT.PHOTOGRAPHER
   *
   * @return the value of SF_JD_DOC_AUDIT.PHOTOGRAPHER
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public String getPhotographer() {
    return photographer;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_JD_DOC_AUDIT.PHOTOGRAPHER
   *
   * @param photographer the value for SF_JD_DOC_AUDIT.PHOTOGRAPHER
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public void setPhotographer(String photographer) {
    this.photographer = photographer;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_JD_DOC_AUDIT.ENTRUST_ID
   *
   * @return the value of SF_JD_DOC_AUDIT.ENTRUST_ID
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public BigDecimal getEntrustId() {
    return entrust.getEntrustId();
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_JD_DOC_AUDIT.ENTRUST_ID
   *
   * @param entrustId the value for SF_JD_DOC_AUDIT.ENTRUST_ID
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public void setEntrustId(BigDecimal entrustId) {

  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_JD_DOC_AUDIT.NAME
   *
   * @return the value of SF_JD_DOC_AUDIT.NAME
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public String getName() {
    return name;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_JD_DOC_AUDIT.NAME
   *
   * @param name the value for SF_JD_DOC_AUDIT.NAME
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_JD_DOC_AUDIT.ENTRUST_CODE
   *
   * @return the value of SF_JD_DOC_AUDIT.ENTRUST_CODE
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public String getEntrustCode() {
    return entrust.getCode();
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_JD_DOC_AUDIT.ENTRUST_CODE
   *
   * @param entrustCode the value for SF_JD_DOC_AUDIT.ENTRUST_CODE
   *
   * @mbggenerated Thu Jan 22 10:30:52 CST 2015
   */
  public void setEntrustCode(String entrustCode) {
  }

  public List getDetailLst() {
    return detailLst;
  }

  public void setDetailLst(List detailLst) {
    this.detailLst = detailLst;
  }

  public SfEntrust getEntrust() {
    return entrust;
  }

  public void setEntrust(SfEntrust entrust) {
    this.entrust = entrust;
  }

  public String getWtf() {
    return wtf;
  }

  public void setWtf(String wtf) {
    this.wtf = wtf;
  }

public SfJdReport getReport() {
	return report;
}

public void setReport(SfJdReport report) {
	this.report = report;
}

public List getMaterialLst() {
  return materialLst;
}

public void setMaterialLst(List materialLst) {
  this.materialLst = materialLst;
}
}