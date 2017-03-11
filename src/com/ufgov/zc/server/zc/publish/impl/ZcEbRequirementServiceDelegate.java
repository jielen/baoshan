package com.ufgov.zc.server.zc.publish.impl;import java.util.List;import com.ufgov.zc.common.system.RequestMeta;import com.ufgov.zc.common.system.dto.ElementConditionDto;import com.ufgov.zc.common.zc.model.ZcEbReqFile;import com.ufgov.zc.common.zc.model.ZcEbRequirement;import com.ufgov.zc.common.zc.publish.IZcEbRequirementServiceDelegate;import com.ufgov.zc.server.zc.service.IZcEbRequirementService;public class ZcEbRequirementServiceDelegate implements IZcEbRequirementServiceDelegate {  private IZcEbRequirementService zcEbRequirementService;  /**   * @return the zcEbRequirementService   */  public IZcEbRequirementService getZcEbRequirementService() {    return zcEbRequirementService;  }  /**   * @param zcEbRequirementService the zcEbRequirementService to set   */  public void setZcEbRequirementService(IZcEbRequirementService zcEbRequirementService) {    this.zcEbRequirementService = zcEbRequirementService;  }  public List getZcEbRequirementList(ElementConditionDto dto, RequestMeta meta) {    return zcEbRequirementService.getZcEbRequirementList(dto, meta);  }  public ZcEbRequirement getZcEbRequirementDetailByReqCode(String reqCode, RequestMeta requestMeta) {    return zcEbRequirementService.getZcEbRequirementDetailByReqCode(reqCode);  }  public ZcEbRequirement getZcEbRequirementByReqCode(String reqCode, RequestMeta requestMeta) {    return zcEbRequirementService.getZcEbRequirementByReqCode(reqCode);  }  public ZcEbRequirement saveFN(ZcEbRequirement zcEbRequirement, RequestMeta requestMeta) {    return zcEbRequirementService.save(zcEbRequirement, requestMeta);  }  public ZcEbRequirement getOriginalZcEbRequirementByReqCode(String reqCode, RequestMeta requestMeta) {    return zcEbRequirementService.getOriginalZcEbRequirementByReqCode(reqCode);  }  public void deleteFN(String reqCode, RequestMeta requestMeta) {    zcEbRequirementService.delete(reqCode);  }  public ZcEbRequirement auditFN(ZcEbRequirement requirement, RequestMeta requestMeta) {    return zcEbRequirementService.auditFN(requirement, requestMeta);  }  public ZcEbRequirement newCommitFN(ZcEbRequirement requirement, RequestMeta requestMeta) {    return zcEbRequirementService.newCommitFN(requirement, requestMeta);  }  public ZcEbRequirement unAuditFN(ZcEbRequirement requirement, RequestMeta requestMeta) throws Exception {    return zcEbRequirementService.unAuditFN(requirement, requestMeta);  }  public ZcEbRequirement untreadFN(ZcEbRequirement requirement, RequestMeta requestMeta) {    return zcEbRequirementService.untreadFN(requirement, requestMeta);  }  public ZcEbRequirement callbackFN(ZcEbRequirement requirement, RequestMeta requestMeta) {    return zcEbRequirementService.callbackFN(requirement, requestMeta);  }  public ZcEbRequirement sendToProcurementUnitFN(ZcEbRequirement requirement, RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    return zcEbRequirementService.sendToProcurementUnit(requirement, requestMeta);  }  public void updateZcEbReqFile(ZcEbReqFile zcEbReqFile, RequestMeta requestMeta) {    zcEbRequirementService.updateZcEbReqFile(zcEbReqFile, requestMeta);  }    public boolean isExistZbEbReqFileByRegCode(String reqCode, RequestMeta requestMeta){	  	  return zcEbRequirementService.isExistZbEbReqFileByRegCode(reqCode);	    }  public ZcEbRequirement getZcEbRequirementByUseBudget(String snCode, RequestMeta requestMeta) {    return zcEbRequirementService.getZcEbRequirementByUseBudget(snCode, requestMeta);  }  public List getPackCount(ZcEbRequirement requirement, RequestMeta meta) {    return zcEbRequirementService.getPackCount(requirement, meta);  }}