package com.ufgov.zc.common.sf.model;

import java.math.BigDecimal;
import java.util.Date;

import com.ufgov.zc.common.util.EmpMeta;
import com.ufgov.zc.common.zc.model.ZcBaseBill;

public class SfReceipt extends ZcBaseBill{
  public static final String SEQ_SF_RECEIPT_ID="SEQ_SF_RECEIPT_ID";
  /**
   * 回执页签
   */
  public static final String TAB_ID="SfReceipt_Tab";
  /**
   * 回执搜索条件
   */
  public static final String SEARCH_ID="SfReceipt_search";
  
  /**
   * 回执类别 :受理
   */
  public static final String RECIEPT_TYPE_SHOU_LI="shouli";
  /**
   * 回执类别 :不受理
   */
  public static final String RECIEPT_TYPE_JU_JUE="jujue";
  /**
   * 暂停
   */
  public static final String RECIEPT_TYPE_PAUSE="pause";
  /**
   * 终止
   */
  public static final String RECIEPT_TYPE_STOP="stop";
  /**
   * 完成
   */
  public static final String RECIEPT_TYPE_COMPLETE="complete"; 
  /**
   * 补充检材
   */
  public static final String RECIEPT_TYPE_APPEND="append"; 

  public static final String SF_VS_RECEIPT_TYPE="SF_VS_RECEIPT_TYPE";  

  public static final String SF_VS_RECEIPT_STATUS="SF_VS_RECEIPT_STATUS";  
  
  public static final String COL_ENTRUST_CODE="SF_RECEIPT_ENTRUST_CODE"; // 委托编号
  public static final String COL_ENTRUST_ID="SF_RECEIPT_ENTRUST_ID"; // 委托ID
  public static final String COL_INPUTOR="SF_RECEIPT_INPUTOR"; // 录入人
  public static final String COL_INPUT_DATE="SF_RECEIPT_INPUT_DATE"; // 录入时间
  public static final String COL_NAME="SF_RECEIPT_NAME"; // 名称
  public static final String COL_ND="SF_RECEIPT_ND"; // 年度
  public static final String COL_PROCESS_INST_ID="SF_RECEIPT_PROCESS_INST_ID"; // 工作流实例号
  public static final String COL_RECEIPT_ID="SF_RECEIPT_RECEIPT_ID"; // 回执ID
  public static final String COL_RECEIPT_TYPE="SF_RECEIPT_RECEIPT_TYPE"; // 回执类别
  public static final String COL_REMARK="SF_RECEIPT_REMARK"; // 备注
  public static final String COL_STATUS="SF_RECEIPT_STATUS"; // 状态

  private String fileId;
  
  private SfEntrust entrust;
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_RECEIPT.RECEIPT_ID
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	private BigDecimal receiptId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_RECEIPT.ENTRUST_ID
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	private BigDecimal entrustId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_RECEIPT.INPUTOR
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	private String inputor;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_RECEIPT.INPUT_DATE
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	private Date inputDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_RECEIPT.STATUS
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_RECEIPT.REMARK
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	private String remark;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_RECEIPT.RECEIPT_TYPE
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	private String receiptType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_RECEIPT.ENTRUST_CODE
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	private String entrustCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_RECEIPT.NAME
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	private String name;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_RECEIPT.RECEIPT_ID
	 * @return  the value of SF_RECEIPT.RECEIPT_ID
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public BigDecimal getReceiptId() {
		return receiptId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_RECEIPT.RECEIPT_ID
	 * @param receiptId  the value for SF_RECEIPT.RECEIPT_ID
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public void setReceiptId(BigDecimal receiptId) {
		this.receiptId = receiptId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_RECEIPT.ENTRUST_ID
	 * @return  the value of SF_RECEIPT.ENTRUST_ID
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public BigDecimal getEntrustId() {
		return entrustId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_RECEIPT.ENTRUST_ID
	 * @param entrustId  the value for SF_RECEIPT.ENTRUST_ID
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public void setEntrustId(BigDecimal entrustId) {
		this.entrustId = entrustId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_RECEIPT.INPUTOR
	 * @return  the value of SF_RECEIPT.INPUTOR
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public String getInputor() {
		return inputor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_RECEIPT.INPUTOR
	 * @param inputor  the value for SF_RECEIPT.INPUTOR
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public void setInputor(String inputor) {
		this.inputor = inputor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_RECEIPT.INPUT_DATE
	 * @return  the value of SF_RECEIPT.INPUT_DATE
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public Date getInputDate() {
		return inputDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_RECEIPT.INPUT_DATE
	 * @param inputDate  the value for SF_RECEIPT.INPUT_DATE
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_RECEIPT.STATUS
	 * @return  the value of SF_RECEIPT.STATUS
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_RECEIPT.STATUS
	 * @param status  the value for SF_RECEIPT.STATUS
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_RECEIPT.REMARK
	 * @return  the value of SF_RECEIPT.REMARK
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_RECEIPT.REMARK
	 * @param remark  the value for SF_RECEIPT.REMARK
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_RECEIPT.RECEIPT_TYPE
	 * @return  the value of SF_RECEIPT.RECEIPT_TYPE
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public String getReceiptType() {
		return receiptType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_RECEIPT.RECEIPT_TYPE
	 * @param receiptType  the value for SF_RECEIPT.RECEIPT_TYPE
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public void setReceiptType(String receiptType) {
		this.receiptType = receiptType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_RECEIPT.ENTRUST_CODE
	 * @return  the value of SF_RECEIPT.ENTRUST_CODE
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public String getEntrustCode() {
		return entrustCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_RECEIPT.ENTRUST_CODE
	 * @param entrustCode  the value for SF_RECEIPT.ENTRUST_CODE
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public void setEntrustCode(String entrustCode) {
		this.entrustCode = entrustCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_RECEIPT.NAME
	 * @return  the value of SF_RECEIPT.NAME
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_RECEIPT.NAME
	 * @param name  the value for SF_RECEIPT.NAME
	 * @mbggenerated  Fri Jan 16 03:07:34 CST 2015
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }


  public String getInputorName() {
    if(inputor!=null){
      return EmpMeta.getEmpName(inputor);
    }
    return inputorName;
  }
  public SfEntrust getEntrust() {
	return entrust;
}

public void setEntrust(SfEntrust entrust) {
	this.entrust = entrust;
}
/**
   * 
   */
  private static final long serialVersionUID = -6800320700514576312L;

}