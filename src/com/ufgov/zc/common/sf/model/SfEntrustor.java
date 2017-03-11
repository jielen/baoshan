package com.ufgov.zc.common.sf.model;

import java.math.BigDecimal;
import java.util.Date;

import com.ufgov.zc.common.system.model.User;
import com.ufgov.zc.common.zc.model.ZcBaseBill;

public class SfEntrustor extends ZcBaseBill{

  public static final String SEQ_SF_ENTRUSTOR_ID = "SEQ_SF_ENTRUSTOR_ID";
  
  public static final String ENTRUSTOR_ID="SF_ENTRUSTOR_ID";
  public static final String CODE="SF_ENTRUSTOR_CODE";
  public static final String NAME="SF_ENTRUSTOR_NAME";
  public static final String SHORT_NAME="SF_ENTRUSTOR_SHORT_NAME";
  public static final String ADDRESS="SF_ADDRESS";
  public static final String ZIP="SF_ZIP";
  public static final String LINK_MAN="SF_LINK_MAN";
  public static final String LINK_TEL="SF_LINK_TEL";
  public static final String ENTRUSTOR_TYPE="SF_ENTRUSTOR_TYPE";
  public static final String PARENT_ID="SF_ENTRUSTOR_PARENT_ID";
  public static final String DISTRICT_CODE="SF_ENTRUSTOR_DISTRICT_CODE";
  
  
  
  public static final String TAB_ID_ENTRUSTOR="SF_ENTRUSTOR_TAB_ID";
  


  /**
   * 默认用户组
   */
	public static final String OPT_SF_WTF_GROUP_ID = "OPT_SF_WTF_GROUP_ID";

	/**
	 * 默认内部机构
	 */
	public static final String OPT_SF_WTF_ORG_ID = "OPT_SF_WTF_ORG_ID";

	/**
	 * 默认用户单位码
	 */
	public static final String OPT_SF_WTF_CO_CODE = "OPT_SF_WTF_CO_CODE";

	/**
	 *  默认职位码
	 */
	public static final String OPT_SF_WTF_POSI_ID = "OPT_SF_WTF_POSI_ID";
	
	/**
	 * 默认用户角色
	 */
	public static final String OPT_SF_WTF_ROLE_ID="OPT_SF_WTF_ROLE_ID";
    
/**
 * 委托方类别
1：公检法部门
2：企事业单位
3：律师事务所
4：个人
5：其他主体

 */
  public static final String SF_VS_ENTRUSTOR_TYPE = "SF_VS_ENTRUSTOR_TYPE";
  

  public static final String SF_VS_ENTRUSTOR_DISTRICT = "SF_VS_ENTRUSTOR_DISTRICT";
  
  /**
   * 委托方登陆系统时的对应用户信息
   */
  private User user=new User();
   
  
  private SfEntrustorUser wtfUser;
  
  private String entrustorType;
  
  private String districtCode;
  
  private BigDecimal parentId;
  private String parentName;
  
  private String inputor;
  private Date inputDate;
  
  private String shortName;
  
  /**
   * 是否登陆系统
   */
  private String isLogin;
  
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_ENTRUSTOR.ENTRUSTOR_ID
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	private BigDecimal entrustorId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_ENTRUSTOR.CODE
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_ENTRUSTOR.NAME
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_ENTRUSTOR.ADDRESS
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	private String address;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_ENTRUSTOR.ZIP
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	private String zip;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_ENTRUSTOR.LINK_MAN
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	private String linkMan;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_ENTRUSTOR.LINK_TEL
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	private String linkTel;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_ENTRUSTOR.ENTRUSTOR_ID
	 * @return  the value of SF_ENTRUSTOR.ENTRUSTOR_ID
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	public BigDecimal getEntrustorId() {
		return entrustorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_ENTRUSTOR.ENTRUSTOR_ID
	 * @param entrustorId  the value for SF_ENTRUSTOR.ENTRUSTOR_ID
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	public void setEntrustorId(BigDecimal entrustorId) {
		this.entrustorId = entrustorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_ENTRUSTOR.CODE
	 * @return  the value of SF_ENTRUSTOR.CODE
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	public String getCode() {
		return getUser().getUserId();
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_ENTRUSTOR.CODE
	 * @param code  the value for SF_ENTRUSTOR.CODE
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_ENTRUSTOR.NAME
	 * @return  the value of SF_ENTRUSTOR.NAME
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_ENTRUSTOR.NAME
	 * @param name  the value for SF_ENTRUSTOR.NAME
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_ENTRUSTOR.ADDRESS
	 * @return  the value of SF_ENTRUSTOR.ADDRESS
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_ENTRUSTOR.ADDRESS
	 * @param address  the value for SF_ENTRUSTOR.ADDRESS
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_ENTRUSTOR.ZIP
	 * @return  the value of SF_ENTRUSTOR.ZIP
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_ENTRUSTOR.ZIP
	 * @param zip  the value for SF_ENTRUSTOR.ZIP
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_ENTRUSTOR.LINK_MAN
	 * @return  the value of SF_ENTRUSTOR.LINK_MAN
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	public String getLinkMan() {
		return linkMan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_ENTRUSTOR.LINK_MAN
	 * @param linkMan  the value for SF_ENTRUSTOR.LINK_MAN
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_ENTRUSTOR.LINK_TEL
	 * @return  the value of SF_ENTRUSTOR.LINK_TEL
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	public String getLinkTel() {
		return linkTel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_ENTRUSTOR.LINK_TEL
	 * @param linkTel  the value for SF_ENTRUSTOR.LINK_TEL
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	public void setLinkTel(String linkTel) {
		this.linkTel = linkTel;
	}

	public String getEntrustorType() {
		return entrustorType;
	}

	public void setEntrustorType(String entrustorType) {
		this.entrustorType = entrustorType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(String isLogin) {
		this.isLogin = isLogin;
	}

	public SfEntrustorUser getWtfUser() {
		return wtfUser;
	}

	public void setWtfUser(SfEntrustorUser wtfUser) {
		this.wtfUser = wtfUser;
	}

	public BigDecimal getParentId() {
    return parentId;
  }

  public void setParentId(BigDecimal parentId) {
    this.parentId = parentId;
  }

  public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public String getInputor() {
    return inputor;
  }

  public void setInputor(String inputor) {
    this.inputor = inputor;
  }

  public Date getInputDate() {
    return inputDate;
  }

  public void setInputDate(Date inputDate) {
    this.inputDate = inputDate;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }
 

  public String getDistrictCode() {
    return districtCode;
  }

  public void setDistrictCode(String districtCode) {
    this.districtCode = districtCode;
  }


  /**
   * 
   */
  private static final long serialVersionUID = -1818757105251063158L;
}