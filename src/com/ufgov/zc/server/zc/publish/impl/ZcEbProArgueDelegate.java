package com.ufgov.zc.server.zc.publish.impl;import java.util.List;import com.ufgov.zc.common.system.RequestMeta;import com.ufgov.zc.common.system.dto.ElementConditionDto;import com.ufgov.zc.common.zc.model.ZcEbProArgue;import com.ufgov.zc.common.zc.publish.IZcEbProArgueDelegate;import com.ufgov.zc.server.zc.service.IZcEbProArgueService;public class ZcEbProArgueDelegate implements IZcEbProArgueDelegate {  private IZcEbProArgueService zcEbProArgueService;  public void deleteZcEbProArgueByIdFN(String id, RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    zcEbProArgueService.deleteZcEbProArgueById(id);  }  public void deleteZcEbProArgueByIdsFN(String[] id, RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    zcEbProArgueService.deleteZcEbProArgueByIds(id);  }  public List getZcEbProArgueByCondition(ElementConditionDto condition, RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    return zcEbProArgueService.getZcEbProArgueByCondition(condition, requestMeta);  }  public ZcEbProArgue getZcEbProArgueById(String id, RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    return zcEbProArgueService.getZcEbProArgueById(id);  }  public ZcEbProArgue insertZcEbProArgueFN(ZcEbProArgue po, RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    System.out.println("ZcEbProArgueDelegate.......................");    zcEbProArgueService.insertZcEbProArgue(po, requestMeta);    return po;  }  public void updateZcEbProArgueFN(ZcEbProArgue po, RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    zcEbProArgueService.updateZcEbProArgue(po);  }  public IZcEbProArgueService getZcEbProArgueService() {    return zcEbProArgueService;  }  public void setZcEbProArgueService(IZcEbProArgueService zcEbProArgueService) {    this.zcEbProArgueService = zcEbProArgueService;  }  public ZcEbProArgue CancelMakeFN(ZcEbProArgue make, RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    return zcEbProArgueService.CancelMake(make, requestMeta);  }  public ZcEbProArgue auditFN(ZcEbProArgue make, RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    return zcEbProArgueService.auditFN(make, requestMeta);  }  public ZcEbProArgue callbackFN(ZcEbProArgue make, RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    return zcEbProArgueService.callbackFN(make, requestMeta);  }  public ZcEbProArgue newCommitFN(ZcEbProArgue make, boolean b, RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    return zcEbProArgueService.newCommitFN(make, requestMeta);  }  public ZcEbProArgue unAuditFN(ZcEbProArgue make, RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    return zcEbProArgueService.unAuditFN(make, requestMeta);  }  public ZcEbProArgue untreadFN(ZcEbProArgue make, RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    return zcEbProArgueService.untreadFN(make, requestMeta);  }}