package com.ufgov.zc.server.sf.dao;

import java.math.BigDecimal;
import java.util.List;

import com.ufgov.zc.common.sf.model.SfXysxType;
import com.ufgov.zc.common.system.dto.ElementConditionDto;

public interface SfXysxTypeMapper {
  /**
   * This method was generated by MyBatis Generator.
   * This method corresponds to the database table SF_XYSX_TYPE
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  int deleteByPrimaryKey(BigDecimal xysxTypeId);

  /**
   * This method was generated by MyBatis Generator.
   * This method corresponds to the database table SF_XYSX_TYPE
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  int insert(SfXysxType record);

  /**
   * This method was generated by MyBatis Generator.
   * This method corresponds to the database table SF_XYSX_TYPE
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  SfXysxType selectByPrimaryKey(BigDecimal xysxTypeId);

  /**
   * This method was generated by MyBatis Generator.
   * This method corresponds to the database table SF_XYSX_TYPE
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  int updateByPrimaryKey(SfXysxType record);

  List getMainDataLst(ElementConditionDto elementConditionDto);
}