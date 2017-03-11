/**   * @(#) project: GK* @(#) file: ZcEbEvalDao.java* * Copyright 2010 UFGOV, Inc. All rights reserved.* UFGOV PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.* */package com.ufgov.zc.server.zc.dao;import java.util.List;import com.ufgov.zc.common.system.dto.ElementConditionDto;import com.ufgov.zc.common.zc.model.DataExchange;import com.ufgov.zc.common.zc.model.DataExchangeLog;import com.ufgov.zc.common.zc.model.DataExchangeRedo;/*** @ClassName: IDataExchangeDao* @Description: 项目模块取数接口。* @date: 2010-4-21 下午03:39:42* @version: V1.0 * @since: 1.0* @author: leo* @modify: */public interface IDataExchangeDao {  List getDataExchangeLogs(ElementConditionDto dto);  DataExchangeLog save(DataExchangeLog log);  List getAllDataExchange();  List getDataExchangeRedos(ElementConditionDto dto);  void saveRedo(DataExchangeRedo redo);  DataExchange save(DataExchange de);  void updateDataExchangeRedoIsExported(DataExchangeRedo redo);  void delete(DataExchangeRedo de);  void deleteByRecordIDAndDataTypeID(DataExchangeRedo redo);  List getDataExchangeRedosByLikeRecordID(ElementConditionDto redoDto);}