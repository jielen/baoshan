/**   * @(#) project: ZFCG* @(#) file: ZcEbGuiDangBill.java* * Copyright 2011 UFGOV, Inc. All rights reserved.* UFGOV PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.* */package com.ufgov.zc.common.zc.model;import java.math.BigDecimal;import java.util.ArrayList;import java.util.List;/*** @ClassName: ZcEbGuiDangBill* @Description: TCJLODO(这里用一句话描述这个类的作用)* @date: 2011-5-12 上午10:23:25* @version: V1.0 * @since: 1.0* @author: fanpl* @modify: */public class ZcEbGuiDangBill extends ZcBaseBill {  private String guiDangId;  /**   * 项目编号   */  private String projCode;  /**   * 项目名称   */  private String projName;  /**   * 批办单号   */  private String sheetId;  /**   * 采购预算   */  private BigDecimal zcMoneyBiSum = new BigDecimal("0.00");  /**   * 采购方式   */  private String zcPifuCgfs;  private String status;  private List itemList = new ArrayList();  public String getGuiDangId() {    return guiDangId;  }  public void setGuiDangId(String guiDangId) {    this.guiDangId = guiDangId;  }  public String getProjCode() {    return projCode;  }  public void setProjCode(String projCode) {    this.projCode = projCode;  }  public String getProjName() {    return projName;  }  public void setProjName(String projName) {    this.projName = projName;  }  public String getSheetId() {    return sheetId;  }  public void setSheetId(String sheetId) {    this.sheetId = sheetId;  }  public BigDecimal getZcMoneyBiSum() {    return zcMoneyBiSum;  }  public void setZcMoneyBiSum(BigDecimal zcMoneyBiSum) {    this.zcMoneyBiSum = zcMoneyBiSum;  }  public String getZcPifuCgfs() {    return zcPifuCgfs;  }  public void setZcPifuCgfs(String zcPifuCgfs) {    this.zcPifuCgfs = zcPifuCgfs;  }  public String getExecutor() {    return executor;  }  public void setExecutor(String jingBanId) {    this.executor = jingBanId;  }  public String getStatus() {    return status;  }  public void setStatus(String status) {    this.status = status;  }  public List getItemList() {    return itemList;  }  public void setItemList(List itemList) {    this.itemList = itemList;  }}