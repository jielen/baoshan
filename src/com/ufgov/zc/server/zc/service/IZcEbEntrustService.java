package com.ufgov.zc.server.zc.service;import java.util.List;import com.ufgov.zc.common.system.RequestMeta;import com.ufgov.zc.common.system.dto.ElementConditionDto;import com.ufgov.zc.common.system.dto.PrintObject;import com.ufgov.zc.common.zc.model.ZcEbEntrust;public interface IZcEbEntrustService {  List getZcEbEntrust(ElementConditionDto dto, RequestMeta meta);  List getZcEbEntrustDetailBySn(String sn);  ZcEbEntrust getZcEbEntrustBySn(String sn);  ZcEbEntrust updateZcEbEntrustStatus(ZcEbEntrust entrust);  public void updateZcEbEntrustStatus(List entrustList);  ZcEbEntrust newCommit(ZcEbEntrust entrust, RequestMeta requestMeta);//送审  ZcEbEntrust audit(ZcEbEntrust entrust, RequestMeta requestMeta);//审核  ZcEbEntrust unaudit(ZcEbEntrust entrust, RequestMeta requestMeta);//销审  ZcEbEntrust untread(ZcEbEntrust entrust, RequestMeta requestMeta);//退回  public PrintObject genMainSubPrintObject(List zcEbEntrustList);  void doBack(ZcEbEntrust entrust, RequestMeta requestMeta);  ZcEbEntrust doSave(ZcEbEntrust entrust);  int getCountData(String sn);  int deleteByPrimaryKey(ZcEbEntrust zcEbEntrust);  List findTransData(ElementConditionDto dto, RequestMeta meta);  void impEntrust(ZcEbEntrust zeas, RequestMeta meta);  public boolean checkUniqueZcMakeCode(ZcEbEntrust zeas, RequestMeta meta);  public List getTodoListByUser(List compId, String userId);  List getZcEbEntrustExportData(List entrustIdLst, RequestMeta meta);  String importTransDatasFN(ZcEbEntrust bill, RequestMeta meta);}