/**   * @(#) project: TableProject* @(#) file: XmlTableCell.java* * Copyright 2010 UFGOV, Inc. All rights reserved.* UFGOV PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.* */package com.ufgov.zc.server.zc.web.ylbTable.entity;import java.io.Serializable;/*** @ClassName: XmlTableCell* @Description: TCJLODO(这里用一句话描述这个类的作用)* @date: 2010-4-27 下午01:59:53* @version: V1.0 * @since: 1.0* @author: Administrator* @modify: */public class XmlTableCell implements Serializable {  private String value;  public String getValue() {    return value;  }  public void setValue(String value) {    this.value = value;  }}