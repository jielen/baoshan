package com.ufgov.zc.server.cp.dao.ibatis;import java.sql.SQLException;import java.util.HashMap;import java.util.List;import java.util.Map;import org.springframework.orm.ibatis.SqlMapClientCallback;import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;import com.ibatis.sqlmap.client.SqlMapExecutor;import com.ufgov.zc.common.cp.model.CpPayClearList;import com.ufgov.zc.common.system.exception.DaoException;import com.ufgov.zc.server.cp.dao.ICpPayClearListDao;public class CpPayClearListDao extends SqlMapClientDaoSupport implements ICpPayClearListDao {  public List getCpPayClearListByBillId(String payClearBillId) {    return this.getSqlMapClientTemplate().queryForList("CpPayClearList.getCpPayClearListByBillId",    payClearBillId);  }  public List getCpPayClearListForList(List billIdList) {    if (billIdList.size() == 0) {      throw new DaoException("getCpPayClearListForList的参数billIdList为空");    }    Map map = new HashMap();    map.put("billIdList", billIdList);    return this.getSqlMapClientTemplate().queryForList("CpPayClearList.getCpPayClearListForList", map);  }  public void insertCpPayClearList(CpPayClearList cpPayClearList) {    this.getSqlMapClientTemplate().insert("CpPayClearList.insertCpPayClearList", cpPayClearList);  }  public void insertCpPayClearLists(final List cpPayClearLists) {    this.getSqlMapClientTemplate().execute(new SqlMapClientCallback() {      public Object doInSqlMapClient(SqlMapExecutor executor) throws SQLException {        executor.startBatch();        for (int i = 0; i < cpPayClearLists.size(); i++) {          executor.insert("CpPayClearList.insertCpPayClearList", cpPayClearLists.get(i));        }        executor.executeBatch();        return null;      }    });  }}