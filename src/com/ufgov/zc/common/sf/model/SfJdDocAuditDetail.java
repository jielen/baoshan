package com.ufgov.zc.common.sf.model;

import java.math.BigDecimal;

import com.ufgov.zc.common.zc.model.ZcBaseBill;

public class SfJdDocAuditDetail extends ZcBaseBill{

  /**
   * 
   */
  private static final long serialVersionUID = -2609543223950143001L;
  
  public static final String COL_DOC_TYPE_CODE="SF_JD_DOC_AUDIT_DETAIL_DOC_TYPE_CODE"; // 鉴定文书类别编号
  public static final String COL_JD_DOC_AUDIT_ID="SF_JD_DOC_AUDIT_DETAIL_JD_DOC_AUDIT_ID"; // 鉴定文书审批单ID
  public static final String COL_REMARK="SF_JD_DOC_AUDIT_DETAIL_REMARK"; // 备注
  public static final String COL_QUANTITY="SF_JD_DOC_AUDIT_DETAIL_QUANTITY"; // 发文数量
  public static final String COL_DOC_NAME="SF_JD_DOC_AUDIT_DETAIL_DOC_NAME"; // 名称

  
//  private SfJdDocType docType=new SfJdDocType();
  
  private String docName;
  
  private BigDecimal quantity;
  
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_JD_DOC_AUDIT_DETAIL.JD_DOC_AUDIT_ID
	 * @mbggenerated  Thu Jan 22 11:06:52 CST 2015
	 */
	private BigDecimal jdDocAuditId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_JD_DOC_AUDIT_DETAIL.DOC_TYPE_CODE
	 * @mbggenerated  Thu Jan 22 11:06:52 CST 2015
	 */
	private String docTypeCode;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_JD_DOC_AUDIT_DETAIL.REMARK
	 * @mbggenerated  Thu Jan 22 11:06:52 CST 2015
	 */
	private String remark;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_JD_DOC_AUDIT_DETAIL.JD_DOC_AUDIT_ID
	 * @return  the value of SF_JD_DOC_AUDIT_DETAIL.JD_DOC_AUDIT_ID
	 * @mbggenerated  Thu Jan 22 11:06:52 CST 2015
	 */
	public BigDecimal getJdDocAuditId() {
		return jdDocAuditId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_JD_DOC_AUDIT_DETAIL.JD_DOC_AUDIT_ID
	 * @param jdDocAuditId  the value for SF_JD_DOC_AUDIT_DETAIL.JD_DOC_AUDIT_ID
	 * @mbggenerated  Thu Jan 22 11:06:52 CST 2015
	 */
	public void setJdDocAuditId(BigDecimal jdDocAuditId) {
		this.jdDocAuditId = jdDocAuditId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_JD_DOC_AUDIT_DETAIL.DOC_TYPE_CODE
	 * @return  the value of SF_JD_DOC_AUDIT_DETAIL.DOC_TYPE_CODE
	 * @mbggenerated  Thu Jan 22 11:06:52 CST 2015
	 */
	public String getDocTypeCode() {
		return docTypeCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_JD_DOC_AUDIT_DETAIL.DOC_TYPE_CODE
	 * @param docTypeCode  the value for SF_JD_DOC_AUDIT_DETAIL.DOC_TYPE_CODE
	 * @mbggenerated  Thu Jan 22 11:06:52 CST 2015
	 */
	public void setDocTypeCode(String docTypeCode) {
		this.docTypeCode = docTypeCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_JD_DOC_AUDIT_DETAIL.REMARK
	 * @return  the value of SF_JD_DOC_AUDIT_DETAIL.REMARK
	 * @mbggenerated  Thu Jan 22 11:06:52 CST 2015
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_JD_DOC_AUDIT_DETAIL.REMARK
	 * @param remark  the value for SF_JD_DOC_AUDIT_DETAIL.REMARK
	 * @mbggenerated  Thu Jan 22 11:06:52 CST 2015
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}  

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

  public String getDocName() {
    return docName;
  }

  public void setDocName(String docName) {
    this.docName = docName;
  }
}