package com.ufgov.zc.common.sf.model;

import java.math.BigDecimal;

import com.ufgov.zc.common.zc.model.ZcBaseBill;

public class SfSj extends ZcBaseBill{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -873240790966303442L;
	public static final String SEQ_SF_SF_SJ_ID="SEQ_SF_SF_SJ_ID";
  public static final String SF_VS_SJ_GROUP="SF_VS_SJ_GROUP";
	public static final String TAB_ID="SfSj_Tab";
	 
	public static final String COL_CO_CODE="SF_SJ_CO_CODE"; // 鉴定机构
	public static final String COL_HAS_TIAOMA="SF_SJ_HAS_TIAOMA"; // 产品有无条码
	public static final String COL_NAME="SF_SJ_NAME"; // 试剂名称
	public static final String COL_PACK_SPEC="SF_SJ_PACK_SPEC"; // 包装规格
	public static final String COL_PIZHUN_DOC_CODE="SF_SJ_PIZHUN_DOC_CODE"; // 批准文号
	public static final String COL_PRODUCTOR_ID="SF_SJ_PRODUCTOR_ID"; // 生产商ID
	public static final String COL_PYM="SF_SJ_PYM"; // 拼音码
	public static final String COL_REMARK="SF_SJ_REMARK"; // 备注
	public static final String COL_SJ_ID="SF_SJ_SJ_ID"; // 试剂ID
	public static final String COL_STATUS="SF_SJ_STATUS"; // 是否停用
	public static final String COL_STOP_REASON="SF_SJ_STOP_REASON"; // 停用原因
	public static final String COL_STORE_CONDITION="SF_SJ_STORE_CONDITION"; // 存储条件
	public static final String COL_STORE_LIMIT_MAX="SF_SJ_STORE_LIMIT_MAX"; // 库存高限
	public static final String COL_STORE_LIMIT_MIN="SF_SJ_STORE_LIMIT_MIN"; // 库存低限
	public static final String COL_TXM="SF_SJ_TXM"; // 条形码
	public static final String COL_UNIT="SF_SJ_UNIT"; // 单位
	public static final String COL_REGIST_CODE="SF_SJ_REGIST_CODE"; // 注册证号
  public static final String COL_SJ_GROUP="SF_SJ_SJ_GROUP"; // 试剂组别
	
	/**
	 * 试剂单位
	 */
	public static final String VS_SF_SJ_UNIT = "VS_SF_SJ_UNIT";
	
	/**
	 * 存储条件
	 */
	public static final String VS_SF_SJ_STORE_CONDITION = "VS_SF_SJ_STORE_CONDITION";

	private SfSjSupplier productor=new SfSjSupplier();
	
	private SfSjUnit unit=new SfSjUnit();
	
	private String registCode;
	private SfSjGroup sjGroup=new SfSjGroup();
	
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SF_SJ.SJ_ID
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    private BigDecimal sjId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SF_SJ.NAME
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SF_SJ.PYM
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    private String pym;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SF_SJ.TXM
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    private String txm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SF_SJ.PACK_SPEC
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    private String packSpec;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SF_SJ.UNIT
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    private BigDecimal unitId;

    

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SF_SJ.STORE_CONDITION
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    private String storeCondition;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SF_SJ.PIZHUN_DOC_CODE
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    private String pizhunDocCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SF_SJ.STORE_LIMIT_MIN
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    private BigDecimal storeLimitMin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SF_SJ.STORE_LIMIT_MAX
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    private BigDecimal storeLimitMax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SF_SJ.STATUS
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SF_SJ.HAS_TIAOMA
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    private String hasTiaoma;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SF_SJ.STOP_REASON
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    private String stopReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SF_SJ.REMARK
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    private String remark;
 

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SF_SJ.PRODUCTOR_ID
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    private BigDecimal productorId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SF_SJ.SJ_ID
     *
     * @return the value of SF_SJ.SJ_ID
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public BigDecimal getSjId() {
        return sjId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SF_SJ.SJ_ID
     *
     * @param sjId the value for SF_SJ.SJ_ID
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public void setSjId(BigDecimal sjId) {
        this.sjId = sjId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SF_SJ.NAME
     *
     * @return the value of SF_SJ.NAME
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SF_SJ.NAME
     *
     * @param name the value for SF_SJ.NAME
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SF_SJ.PYM
     *
     * @return the value of SF_SJ.PYM
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public String getPym() {
        return pym;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SF_SJ.PYM
     *
     * @param pym the value for SF_SJ.PYM
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public void setPym(String pym) {
        this.pym = pym;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SF_SJ.TXM
     *
     * @return the value of SF_SJ.TXM
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public String getTxm() {
        return txm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SF_SJ.TXM
     *
     * @param txm the value for SF_SJ.TXM
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public void setTxm(String txm) {
        this.txm = txm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SF_SJ.PACK_SPEC
     *
     * @return the value of SF_SJ.PACK_SPEC
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public String getPackSpec() {
        return packSpec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SF_SJ.PACK_SPEC
     *
     * @param packSpec the value for SF_SJ.PACK_SPEC
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public void setPackSpec(String packSpec) {
        this.packSpec = packSpec;
    }

    

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SF_SJ.STORE_CONDITION
     *
     * @return the value of SF_SJ.STORE_CONDITION
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public String getStoreCondition() {
        return storeCondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SF_SJ.STORE_CONDITION
     *
     * @param storeCondition the value for SF_SJ.STORE_CONDITION
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public void setStoreCondition(String storeCondition) {
        this.storeCondition = storeCondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SF_SJ.PIZHUN_DOC_CODE
     *
     * @return the value of SF_SJ.PIZHUN_DOC_CODE
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public String getPizhunDocCode() {
        return pizhunDocCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SF_SJ.PIZHUN_DOC_CODE
     *
     * @param pizhunDocCode the value for SF_SJ.PIZHUN_DOC_CODE
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public void setPizhunDocCode(String pizhunDocCode) {
        this.pizhunDocCode = pizhunDocCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SF_SJ.STORE_LIMIT_MIN
     *
     * @return the value of SF_SJ.STORE_LIMIT_MIN
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public BigDecimal getStoreLimitMin() {
        return storeLimitMin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SF_SJ.STORE_LIMIT_MIN
     *
     * @param storeLimitMin the value for SF_SJ.STORE_LIMIT_MIN
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public void setStoreLimitMin(BigDecimal storeLimitMin) {
        this.storeLimitMin = storeLimitMin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SF_SJ.STORE_LIMIT_MAX
     *
     * @return the value of SF_SJ.STORE_LIMIT_MAX
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public BigDecimal getStoreLimitMax() {
        return storeLimitMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SF_SJ.STORE_LIMIT_MAX
     *
     * @param storeLimitMax the value for SF_SJ.STORE_LIMIT_MAX
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public void setStoreLimitMax(BigDecimal storeLimitMax) {
        this.storeLimitMax = storeLimitMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SF_SJ.STATUS
     *
     * @return the value of SF_SJ.STATUS
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SF_SJ.STATUS
     *
     * @param status the value for SF_SJ.STATUS
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SF_SJ.HAS_TIAOMA
     *
     * @return the value of SF_SJ.HAS_TIAOMA
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public String getHasTiaoma() {
        return hasTiaoma;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SF_SJ.HAS_TIAOMA
     *
     * @param hasTiaoma the value for SF_SJ.HAS_TIAOMA
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public void setHasTiaoma(String hasTiaoma) {
        this.hasTiaoma = hasTiaoma;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SF_SJ.STOP_REASON
     *
     * @return the value of SF_SJ.STOP_REASON
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public String getStopReason() {
        return stopReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SF_SJ.STOP_REASON
     *
     * @param stopReason the value for SF_SJ.STOP_REASON
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public void setStopReason(String stopReason) {
        this.stopReason = stopReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SF_SJ.REMARK
     *
     * @return the value of SF_SJ.REMARK
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SF_SJ.REMARK
     *
     * @param remark the value for SF_SJ.REMARK
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SF_SJ.PRODUCTOR_ID
     *
     * @return the value of SF_SJ.PRODUCTOR_ID
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public BigDecimal getProductorId() {
        return getProductor().getSupplierId();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SF_SJ.PRODUCTOR_ID
     *
     * @param productorId the value for SF_SJ.PRODUCTOR_ID
     *
     * @mbggenerated Wed Aug 10 01:41:15 CST 2016
     */
    public void setProductorId(BigDecimal productorId) {
        getProductor().setSupplierId(productorId);
    }

	public String getRegistCode() {
		return registCode;
	}

	public void setRegistCode(String registCode) {
		this.registCode = registCode;
	}

	public SfSjSupplier getProductor() {
		return productor;
	}

	public void setProductor(SfSjSupplier productor) {
		this.productor = productor==null?new SfSjSupplier():productor;
	}

  public SfSjGroup getSjGroup() {
    return sjGroup;
  }

  public void setSjGroup(SfSjGroup sjGroup) {
    this.sjGroup = sjGroup;
  }

  public BigDecimal getUnitId() {
    return getUnit().getUnitId();
  }

  public void setUnitId(BigDecimal unitId) {
    getUnit().setUnitId(unitId);
    this.unitId = unitId;
  }

  public SfSjUnit getUnit() {
    return unit;
  }

  public void setUnit(SfSjUnit unit) {
    this.unit = unit;
  }
}