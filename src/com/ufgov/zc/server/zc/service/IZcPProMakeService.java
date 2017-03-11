package com.ufgov.zc.server.zc.service;import java.math.BigDecimal;import java.sql.SQLException;import java.util.List;import com.ufgov.zc.common.system.RequestMeta;import com.ufgov.zc.common.system.dto.ElementConditionDto;import com.ufgov.zc.common.system.dto.PrintObject;import com.ufgov.zc.common.system.model.AsFile;import com.ufgov.zc.common.zc.exception.ZcBudgetInterfaceException;import com.ufgov.zc.common.zc.model.ApArticle;import com.ufgov.zc.common.zc.model.ZcBMerchandise;import com.ufgov.zc.common.zc.model.ZcPProBaoJia;import com.ufgov.zc.common.zc.model.ZcPProMake;import com.ufgov.zc.common.zc.model.ZcPProMitem;public interface IZcPProMakeService {  List getZcPProMake(ElementConditionDto dto, RequestMeta meta) throws SQLException;  List getZcPProMakeXieYi(ElementConditionDto dto, RequestMeta meta) throws SQLException;  ZcPProMake updateZcPProMake(ZcPProMake zcPProMake, String serverAdd, boolean flag, RequestMeta requestMeta) throws Exception;  ZcPProMake updateZcPProMakeCode(ZcPProMake zcPProMake, RequestMeta requestMeta) throws Exception;  ZcPProMake updateXYZcPProMake(ZcPProMake zcPProMake, RequestMeta requestMeta) throws Exception;  public void updateZcPProMitem(ZcPProMitem mitem);  void deleteByPrimaryKey(String zcMakeCode, boolean flag, String serverAdd, RequestMeta requestMeta) throws Exception;  List getZcPProMitem(String zcMakeCode);  List getZcPProMitemMer(ZcPProMitem mItem);  List getZcPProMitemBi(String zcMakeCode, boolean flag);  ZcPProMake selectByPrimaryKey(String zcMakeCode);  ZcPProMake newCommitFN(ZcPProMake currentObject, String serverAdd, boolean flag, RequestMeta requestMeta) throws Exception;  ZcPProMake auditFN(ZcPProMake make, RequestMeta requestMeta);  ZcPProMake callbackFN(ZcPProMake make, RequestMeta requestMeta);  ZcPProMake unAuditFN(ZcPProMake make, RequestMeta requestMeta);//  ZcPProMake untreadFN(ZcPProMake make, RequestMeta requestMeta);  ZcPProMake selectXyByKey(ElementConditionDto dto, RequestMeta meta);  void updateBaoJia(ZcPProMake make, RequestMeta meta);  List findTransData(ElementConditionDto dto, RequestMeta meta);  String importJingJiaTransData(ZcPProMake make, RequestMeta meta);  List getMitemBiWithHtBi(ElementConditionDto dto);  public ZcPProMake updateZcPProMakeWithStatus(ZcPProMake make);  public void interruptZcPProMake(ZcPProMake make, RequestMeta meta);  public ZcPProMake CancelMake(ZcPProMake make, RequestMeta meta) throws ZcBudgetInterfaceException;  PrintObject genZcPProMakePrintObject(ZcPProMake make);  public List getWfActionDescription(Long id);  ZcPProMake selectXyByKeyForProvider(ElementConditionDto dto, RequestMeta requestMeta);  //  public boolean outputJJGonggaoP(ApArticle article);  //  //  public boolean outputJJGonggaoC(ApArticle article);  List findBulletinRelationTransData(ElementConditionDto dto);  public String insertApArticleWithID(ApArticle record, RequestMeta meta);  List findResultRelationTransData(ElementConditionDto dto);  String insertResultRelationTransData(ApArticle article);  List findTransDataForXieyiGongHuo(ElementConditionDto dto, RequestMeta meta);  AsFile getJingJiaBidWordContent(String makeCode, String templeId, boolean isWaitFrelease, RequestMeta requestMeta);  AsFile getJingJiaWidWordContent(String makeCode, String templeId, RequestMeta requestMeta);  //添加供应商报价记录信息 guoss  void addBaojia(ZcPProBaoJia baojia, RequestMeta meta);  public ZcBMerchandise getMerchandiseInfo(String zcMerCode);  String chackBiMoney(ZcPProMake make);  int getJjPinPNum(String catalogue, ElementConditionDto dto, RequestMeta requestMeta);  BigDecimal getJjPricQuota(ElementConditionDto dto, RequestMeta requestMeta);  public List getZcPProMakeNoHt(ElementConditionDto dto);  List queryExportsDatas(ElementConditionDto dto, RequestMeta meta);  String importTransDatasFN(ZcPProMake make, RequestMeta meta);  void sendToZhuren(ZcPProMake make, RequestMeta meta);}