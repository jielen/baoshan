package com.ufgov.zc.common.sf.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ufgov.zc.common.util.EmpMeta;
import com.ufgov.zc.common.zc.model.ZcBaseBill;

public class SfMaterialsTransfer extends ZcBaseBill {

  /**
   * 
   */
  private static final long serialVersionUID = -3327309672686350827L;

  public static final String SEQ_SF_MATERIALS_TRANSFER_ID = "SEQ_SF_MATERIALS_TRANSFER_ID";

  /**
   * 司法鉴定费用页签
   */
  public static final String TAB_ID = "SfMaterialsTransfer_Tab";

  /**
   * 搜索条件
   */
  public static final String SEARCH_ID = "SfMaterialsTransfer_search";

  public static final String SF_VS_SF_MATERIALS_TRANSFER_STATUS = "SF_VS_SF_MATERIALS_TRANSFER_STATUS";

  /**
   * 待移交
   */
  public static final String STATUS_DAI_YI_JIAO = "daiYiJiao";

  /**
   * 待接收
   */
  public static final String STATUS_DAI_JIE_SHOU = "daiJieShou";

  /**
   * 已接收
   */
  public static final String STATUS_YI_JIE_SHOU = "yiJieShou";

  public static final String COL_CL_QUALITY = "SF_MATERIALS_TRANSFER_CL_QUALITY"; // 鉴定材料数量

  public static final String COL_COMPLETION_DESC = "SF_MATERIALS_TRANSFER_COMPLETION_DESC"; // 完成情况

  public static final String COL_ENTRUST_CODE = "SF_MATERIALS_TRANSFER_ENTRUST_CODE"; // 委托编号

  public static final String COL_ENTRUST_ID = "SF_MATERIALS_TRANSFER_ENTRUST_ID"; // 委托ID

  public static final String COL_JIE_SHOU_DATE = "SF_MATERIALS_TRANSFER_JIE_SHOU_DATE"; // 接收时间

  public static final String COL_JIE_SHOU_DESC = "SF_MATERIALS_TRANSFER_JIE_SHOU_DESC"; // 接收说明

  public static final String COL_JIE_SHOU_REN = "SF_MATERIALS_TRANSFER_JIE_SHOU_REN"; // 接收人

  public static final String COL_MATERIALS_DESC = "SF_MATERIALS_TRANSFER_MATERIALS_DESC"; // 鉴定材料状况描述

  public static final String COL_NAME = "SF_MATERIALS_TRANSFER_NAME"; // 名称

  public static final String COL_ND = "SF_MATERIALS_TRANSFER_ND"; // 年度

  public static final String COL_PARENT_ID = "SF_MATERIALS_TRANSFER_PARENT_ID"; // 上次流转_ID

  public static final String COL_PROCESS_INST_ID = "SF_MATERIALS_TRANSFER_PROCESS_INST_ID"; // 工作流实例号

  public static final String COL_REMARK = "SF_MATERIALS_TRANSFER_REMARK"; // 备注

  public static final String COL_STATUS = "SF_MATERIALS_TRANSFER_STATUS"; // 状态

  public static final String COL_TRANSFER_ID = "SF_MATERIALS_TRANSFER_TRANSFER_ID"; // 材料流转_ID

  public static final String COL_YB_QUALITY = "SF_MATERIALS_TRANSFER_YB_QUALITY"; // 样本数量

  public static final String COL_YI_JIAO_DATE = "SF_MATERIALS_TRANSFER_YI_JIAO_DATE"; // 移交时间

  public static final String COL_YI_JIAO_DESC = "SF_MATERIALS_TRANSFER_YI_JIAO_DESC"; // 移交说明

  public static final String COL_YI_JIAO_REN = "SF_MATERIALS_TRANSFER_YI_JIAO_REN"; // 移交人

  private List detailLst = new ArrayList();

  private List materialLst = new ArrayList();

  private List outInfoLst = new ArrayList();

  public List getMaterialLst() {
    return materialLst;
  }

  public void setMaterialLst(List materialLst) {
    this.materialLst = materialLst;
  }

  public List getOutInfoLst() {
    return outInfoLst;
  }

  public void setOutInfoLst(List outInfoLst) {
    this.outInfoLst = outInfoLst;
  }

  /**
  * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.TRANSFER_ID
  * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
  */
  private BigDecimal transferId;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.ENTRUST_ID
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private BigDecimal entrustId;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.YI_JIAO_REN
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private String yiJiaoRen;

  private String yiJiaoRenName;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.JIE_SHOU_REN
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private String jieShouRen;

  private String jieShouRenName;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.YI_JIAO_DATE
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private Date yiJiaoDate;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.JIE_SHOU_DATE
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private Date jieShouDate;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.YI_JIAO_DESC
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private String yiJiaoDesc;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.JIE_SHOU_DESC
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private String jieShouDesc;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.REMARK
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private String remark;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.CL_QUALITY
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private Integer clQuality;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.YB_QUALITY
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private Integer ybQuality;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.STATUS
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private String status;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.PROCESS_INST_ID
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.ENTRUST_CODE
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private String entrustCode;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.NAME
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private String name;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.MATERIALS_DESC
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private String materialsDesc;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.COMPLETION_DESC
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private String completionDesc;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MATERIALS_TRANSFER.PARENT_ID
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  private BigDecimal parentId;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.TRANSFER_ID
   * @return  the value of SF_MATERIALS_TRANSFER.TRANSFER_ID
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public BigDecimal getTransferId() {
    return transferId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.TRANSFER_ID
   * @param transferId  the value for SF_MATERIALS_TRANSFER.TRANSFER_ID
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setTransferId(BigDecimal transferId) {
    this.transferId = transferId;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.ENTRUST_ID
   * @return  the value of SF_MATERIALS_TRANSFER.ENTRUST_ID
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public BigDecimal getEntrustId() {
    return entrustId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.ENTRUST_ID
   * @param entrustId  the value for SF_MATERIALS_TRANSFER.ENTRUST_ID
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setEntrustId(BigDecimal entrustId) {
    this.entrustId = entrustId;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.YI_JIAO_REN
   * @return  the value of SF_MATERIALS_TRANSFER.YI_JIAO_REN
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public String getYiJiaoRen() {
    return yiJiaoRen;
  }

  public String getYiJiaoRenName() {
    if (yiJiaoRen == null)
      return null;
    return EmpMeta.getEmpName(yiJiaoRen);
  }

  public void setYiJiaoRenName(String yiJiaoRenName) {
    this.yiJiaoRenName = yiJiaoRenName;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.YI_JIAO_REN
   * @param yiJiaoRen  the value for SF_MATERIALS_TRANSFER.YI_JIAO_REN
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setYiJiaoRen(String yiJiaoRen) {
    this.yiJiaoRen = yiJiaoRen;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.JIE_SHOU_REN
   * @return  the value of SF_MATERIALS_TRANSFER.JIE_SHOU_REN
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public String getJieShouRen() {
    return jieShouRen;
  }

  public String getJieShouRenName() {
    if (jieShouRen == null)
      return null;
    return EmpMeta.getEmpName(jieShouRen);
  }

  public void setJieShouRenName(String jieShouRenName) {
    this.jieShouRenName = jieShouRenName;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.JIE_SHOU_REN
   * @param jieShouRen  the value for SF_MATERIALS_TRANSFER.JIE_SHOU_REN
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setJieShouRen(String jieShouRen) {
    this.jieShouRen = jieShouRen;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.YI_JIAO_DATE
   * @return  the value of SF_MATERIALS_TRANSFER.YI_JIAO_DATE
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public Date getYiJiaoDate() {
    return yiJiaoDate;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.YI_JIAO_DATE
   * @param yiJiaoDate  the value for SF_MATERIALS_TRANSFER.YI_JIAO_DATE
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setYiJiaoDate(Date yiJiaoDate) {
    this.yiJiaoDate = yiJiaoDate;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.JIE_SHOU_DATE
   * @return  the value of SF_MATERIALS_TRANSFER.JIE_SHOU_DATE
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public Date getJieShouDate() {
    return jieShouDate;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.JIE_SHOU_DATE
   * @param jieShouDate  the value for SF_MATERIALS_TRANSFER.JIE_SHOU_DATE
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setJieShouDate(Date jieShouDate) {
    this.jieShouDate = jieShouDate;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.YI_JIAO_DESC
   * @return  the value of SF_MATERIALS_TRANSFER.YI_JIAO_DESC
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public String getYiJiaoDesc() {
    return yiJiaoDesc;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.YI_JIAO_DESC
   * @param yiJiaoDesc  the value for SF_MATERIALS_TRANSFER.YI_JIAO_DESC
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setYiJiaoDesc(String yiJiaoDesc) {
    this.yiJiaoDesc = yiJiaoDesc;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.JIE_SHOU_DESC
   * @return  the value of SF_MATERIALS_TRANSFER.JIE_SHOU_DESC
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public String getJieShouDesc() {
    return jieShouDesc;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.JIE_SHOU_DESC
   * @param jieShouDesc  the value for SF_MATERIALS_TRANSFER.JIE_SHOU_DESC
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setJieShouDesc(String jieShouDesc) {
    this.jieShouDesc = jieShouDesc;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.REMARK
   * @return  the value of SF_MATERIALS_TRANSFER.REMARK
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public String getRemark() {
    return remark;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.REMARK
   * @param remark  the value for SF_MATERIALS_TRANSFER.REMARK
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setRemark(String remark) {
    this.remark = remark;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.CL_QUALITY
   * @return  the value of SF_MATERIALS_TRANSFER.CL_QUALITY
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public Integer getClQuality() {
    return clQuality;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.CL_QUALITY
   * @param clQuality  the value for SF_MATERIALS_TRANSFER.CL_QUALITY
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setClQuality(Integer clQuality) {
    this.clQuality = clQuality;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.YB_QUALITY
   * @return  the value of SF_MATERIALS_TRANSFER.YB_QUALITY
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public Integer getYbQuality() {
    return ybQuality;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.YB_QUALITY
   * @param ybQuality  the value for SF_MATERIALS_TRANSFER.YB_QUALITY
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setYbQuality(Integer ybQuality) {
    this.ybQuality = ybQuality;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.STATUS
   * @return  the value of SF_MATERIALS_TRANSFER.STATUS
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public String getStatus() {
    return status;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.STATUS
   * @param status  the value for SF_MATERIALS_TRANSFER.STATUS
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.ENTRUST_CODE
   * @return  the value of SF_MATERIALS_TRANSFER.ENTRUST_CODE
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public String getEntrustCode() {
    return entrustCode;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.ENTRUST_CODE
   * @param entrustCode  the value for SF_MATERIALS_TRANSFER.ENTRUST_CODE
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setEntrustCode(String entrustCode) {
    this.entrustCode = entrustCode;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.NAME
   * @return  the value of SF_MATERIALS_TRANSFER.NAME
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public String getName() {
    return name;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.NAME
   * @param name  the value for SF_MATERIALS_TRANSFER.NAME
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.MATERIALS_DESC
   * @return  the value of SF_MATERIALS_TRANSFER.MATERIALS_DESC
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public String getMaterialsDesc() {
    return materialsDesc;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.MATERIALS_DESC
   * @param materialsDesc  the value for SF_MATERIALS_TRANSFER.MATERIALS_DESC
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setMaterialsDesc(String materialsDesc) {
    this.materialsDesc = materialsDesc;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.COMPLETION_DESC
   * @return  the value of SF_MATERIALS_TRANSFER.COMPLETION_DESC
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public String getCompletionDesc() {
    return completionDesc;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.COMPLETION_DESC
   * @param completionDesc  the value for SF_MATERIALS_TRANSFER.COMPLETION_DESC
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setCompletionDesc(String completionDesc) {
    this.completionDesc = completionDesc;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MATERIALS_TRANSFER.PARENT_ID
   * @return  the value of SF_MATERIALS_TRANSFER.PARENT_ID
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public BigDecimal getParentId() {
    return parentId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MATERIALS_TRANSFER.PARENT_ID
   * @param parentId  the value for SF_MATERIALS_TRANSFER.PARENT_ID
   * @mbggenerated  Sun Jan 18 15:57:06 CST 2015
   */
  public void setParentId(BigDecimal parentId) {
    this.parentId = parentId;
  }

  public List getDetailLst() {
    if (detailLst == null)
      return new ArrayList();
    detailLst.clear();
    if (materialLst != null)
      detailLst.addAll(materialLst);
    if (outInfoLst != null)
      detailLst.addAll(outInfoLst);
    return detailLst;
  }

  public void setDetailLst(List detailLst) {
    this.detailLst = detailLst;
    if (detailLst == null)
      return;
    materialLst.clear();
    outInfoLst.clear();
    for (int i = 0; i < detailLst.size(); i++) {
      SfMaterialsTransferDetail d = (SfMaterialsTransferDetail) detailLst.get(i);
      if (d.getMaterial() != null && d.getMaterial().getMaterialId() != null) {
        materialLst.add(d);
      } else if (d.getOutInfoDetail() != null && d.getOutInfoDetail().getOutInfoDetailId() != null) {
        outInfoLst.add(d);
      }
    }
  }

}