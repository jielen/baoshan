/**   * @(#) project: ZC* @(#) file: RfqPack.java* * Copyright 2010 UFGOV, Inc. All rights reserved.* UFGOV PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.* */package com.ufgov.zc.common.zc.model;import java.math.BigDecimal;import java.util.Date;/*** @ClassName: RfqSinupPack* @Description: TCJLODO(询价报名标段)* @date: 2010-9-14 下午02:40:27* @version: V1.0 * @since: 1.0* @author: fanpeile* @modify: */public class RfqSinupPack extends ZcBaseBill {  private String projCode;  private String packCode;  private String sigupPackId;//报名标段ID  private String signupId;//报名编号  private String bidDocId;  private String bidDocName;  private String providerName;  private String providerCode;  private BigDecimal bidSum;//询价单总报价  private String openBidStatus;  private String openBidRemark;  private Date openBidDate;  public String getProjCode() {    return projCode;  }  public void setProjCode(String projCode) {    this.projCode = projCode;  }  public String getPackCode() {    return packCode;  }  public void setPackCode(String packCode) {    this.packCode = packCode;  }  public String getSigupPackId() {    return sigupPackId;  }  public void setSigupPackId(String sigupPackId) {    this.sigupPackId = sigupPackId;  }  public String getSignupId() {    return signupId;  }  public void setSignupId(String signupId) {    this.signupId = signupId;  }  public String getBidDocId() {    return bidDocId;  }  public void setBidDocId(String bidDocId) {    this.bidDocId = bidDocId;  }  public String getBidDocName() {    return bidDocName;  }  public void setBidDocName(String bidDocName) {    this.bidDocName = bidDocName;  }  public String getProviderName() {    return providerName;  }  public void setProviderName(String providerName) {    this.providerName = providerName;  }  public BigDecimal getBidSum() {    return bidSum;  }  public void setBidSum(BigDecimal bidSum) {    this.bidSum = bidSum;  }  public String getOpenBidStatus() {    return openBidStatus;  }  public void setOpenBidStatus(String openBidStatus) {    this.openBidStatus = openBidStatus;  }  public String getOpenBidRemark() {    return openBidRemark;  }  public void setOpenBidRemark(String openBidRemark) {    this.openBidRemark = openBidRemark;  }  public Date getOpenBidDate() {    return openBidDate;  }  public void setOpenBidDate(Date openBidDate) {    this.openBidDate = openBidDate;  }  public String getProviderCode() {    return providerCode;  }  public void setProviderCode(String providerCode) {    this.providerCode = providerCode;  }}