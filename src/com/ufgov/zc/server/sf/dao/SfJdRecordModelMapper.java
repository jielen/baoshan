package com.ufgov.zc.server.sf.dao;

import com.ufgov.zc.common.sf.model.SfJdRecordModel;
import java.math.BigDecimal;

public interface SfJdRecordModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SF_JD_RECORD_MODEL
     *
     * @mbggenerated Mon Jul 18 13:02:17 CST 2016
     */
    int deleteByPrimaryKey(BigDecimal jdRecordModelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SF_JD_RECORD_MODEL
     *
     * @mbggenerated Mon Jul 18 13:02:17 CST 2016
     */
    int insert(SfJdRecordModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SF_JD_RECORD_MODEL
     *
     * @mbggenerated Mon Jul 18 13:02:17 CST 2016
     */
    int insertSelective(SfJdRecordModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SF_JD_RECORD_MODEL
     *
     * @mbggenerated Mon Jul 18 13:02:17 CST 2016
     */
    SfJdRecordModel selectByPrimaryKey(BigDecimal jdRecordModelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SF_JD_RECORD_MODEL
     *
     * @mbggenerated Mon Jul 18 13:02:17 CST 2016
     */
    int updateByPrimaryKeySelective(SfJdRecordModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SF_JD_RECORD_MODEL
     *
     * @mbggenerated Mon Jul 18 13:02:17 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(SfJdRecordModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SF_JD_RECORD_MODEL
     *
     * @mbggenerated Mon Jul 18 13:02:17 CST 2016
     */
    int updateByPrimaryKey(SfJdRecordModel record);
}