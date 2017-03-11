package com.ufgov.zc.server.zc.dao.ibatis;import java.util.List;import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;import com.ufgov.zc.common.zc.model.ZcPProMake;import com.ufgov.zc.common.zc.model.ZcPProMitem;import com.ufgov.zc.common.zc.model.ZcPProMitemExample;import com.ufgov.zc.common.zc.model.ZcPProMitemMer;import com.ufgov.zc.server.zc.dao.IZcPProMitemMerDao;public class ZcPProMitemMerDao extends SqlMapClientDaoSupport implements IZcPProMitemMerDao {  /**   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ZC_P_PRO_MITEM   * @ibatorgenerated  Thu Apr 29 16:50:54 CST 2010   */  public ZcPProMitemMerDao() {    super();  }  public void insert(ZcPProMitemMer record) {    getSqlMapClientTemplate().insert("ZC_P_PRO_MITEM_MER.ibatorgenerated_insert", record);  }  public List selectByBrand(ZcPProMitem item) {    List list = getSqlMapClientTemplate().queryForList("ZC_P_PRO_MITEM_MER.selectByBrand", item);    return list;  }  public int deleteJingJiaMerByKey(ZcPProMitemExample example) {    int rows = getSqlMapClientTemplate().delete("ZC_P_PRO_MITEM_MER.deleteJingJiaMerByKey", example);    return rows;  }  public int updateMitemMerPrimaryKeyByTempCode(ZcPProMake record) {    int rows = getSqlMapClientTemplate().update("ZC_P_PRO_MITEM_MER.ibatorgenerated_updateMitemMerPrimaryKeyByTempCode", record);    return rows;  }}