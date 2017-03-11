/**   * @(#) project: zcxa* @(#) file: ZcSuppleMentBiDao.java* * Copyright 2010 UFGOV, Inc. All rights reserved.* UFGOV PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.* */package com.ufgov.zc.server.zc.dao.ibatis;import java.math.BigDecimal;import java.util.List;import java.util.Map;import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;import com.ufgov.zc.common.zc.model.ZcSuppleMentBi;import com.ufgov.zc.server.zc.dao.IZcSuppleMentBiDao;/*** @ClassName: ZcSuppleMentBiDao* @Description: TCJLODO(这里用一句话描述这个类的作用)* @date: 2010-8-11 上午09:59:15* @version: V1.0 * @since: 1.0* @author: Administrator* @modify: */public class ZcSuppleMentBiDao extends SqlMapClientDaoSupport implements IZcSuppleMentBiDao {  public void deleteBiByBalId(String zcMakeSuppleMentCode) {    this.getSqlMapClientTemplate().delete("ZcSuppleMentBi.deleteZcSuppleMentByBiNo", zcMakeSuppleMentCode);  }  public List getBiList(String zcMakeSuppleMentCode) {    return this.getSqlMapClientTemplate().queryForList("ZcSuppleMentBi.selectZcSuppleMentBiList",    zcMakeSuppleMentCode);  }  public BigDecimal getSumBiSum(Map map) {    BigDecimal bigDecimal = new BigDecimal("0.0");    bigDecimal = (BigDecimal) this.getSqlMapClientTemplate().queryForObject(    "ZcSuppleMentBi.getSumZcSuppleMentBiSum", map);    return bigDecimal;  }  public ZcSuppleMentBi insertlBi(ZcSuppleMentBi zcSuppleMentBi) {    this.getSqlMapClientTemplate().insert("ZcSuppleMentBi.insertZcSuppleMentBi", zcSuppleMentBi);    return zcSuppleMentBi;  }}