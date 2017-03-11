package com.ufgov.zc.server.sf.dao;

import com.ufgov.zc.common.sf.model.SfJdResultFile;
import java.math.BigDecimal;

public interface SfJdResultFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SF_JD_RESULT_FILE
     *
     * @mbggenerated Mon Jul 18 03:06:09 CST 2016
     */
    int deleteByPrimaryKey(BigDecimal sfJdResultFileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SF_JD_RESULT_FILE
     *
     * @mbggenerated Mon Jul 18 03:06:09 CST 2016
     */
    int insert(SfJdResultFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SF_JD_RESULT_FILE
     *
     * @mbggenerated Mon Jul 18 03:06:09 CST 2016
     */
    int insertSelective(SfJdResultFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SF_JD_RESULT_FILE
     *
     * @mbggenerated Mon Jul 18 03:06:09 CST 2016
     */
    SfJdResultFile selectByPrimaryKey(BigDecimal sfJdResultFileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SF_JD_RESULT_FILE
     *
     * @mbggenerated Mon Jul 18 03:06:09 CST 2016
     */
    int updateByPrimaryKeySelective(SfJdResultFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SF_JD_RESULT_FILE
     *
     * @mbggenerated Mon Jul 18 03:06:09 CST 2016
     */
    int updateByPrimaryKey(SfJdResultFile record);
}