package com.ufgov.zc.common.cp.model.report;import java.math.BigDecimal;public class BiPayQueryBiTrack extends PayQueryReport {  private BigDecimal unauditBi;  private BigDecimal auditBi;  private BigDecimal freezeBi;  private BigDecimal adjustaddBi;  private BigDecimal adjustdelBi;  public BigDecimal getUnauditBi() {    return unauditBi;  }  public void setUnauditBi(BigDecimal unauditBi) {    this.unauditBi = unauditBi;  }  public BigDecimal getAuditBi() {    return auditBi;  }  public void setAuditBi(BigDecimal auditBi) {    this.auditBi = auditBi;  }  public BigDecimal getFreezeBi() {    return freezeBi;  }  public void setFreezeBi(BigDecimal freezeBi) {    this.freezeBi = freezeBi;  }  public BigDecimal getAdjustaddBi() {    return adjustaddBi;  }  public void setAdjustaddBi(BigDecimal adjustaddBi) {    this.adjustaddBi = adjustaddBi;  }  public BigDecimal getAdjustdelBi() {    return adjustdelBi;  }  public void setAdjustdelBi(BigDecimal adjustdelBi) {    this.adjustdelBi = adjustdelBi;  }}