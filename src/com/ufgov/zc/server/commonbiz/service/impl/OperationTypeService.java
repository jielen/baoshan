package com.ufgov.zc.server.commonbiz.service.impl;import java.util.List;import com.ufgov.zc.common.system.dto.ElementConditionDto;import com.ufgov.zc.server.commonbiz.dao.IOperationTypeDao;import com.ufgov.zc.server.commonbiz.service.IOperationTypeService;public class OperationTypeService implements IOperationTypeService {  private IOperationTypeDao operationTypeDao;  public IOperationTypeDao getOperationTypeDao() {    return operationTypeDao;  }  public void setOperationTypeDao(IOperationTypeDao operationTypeDao) {    this.operationTypeDao = operationTypeDao;  }  public List getOperationType(ElementConditionDto dto) {    return operationTypeDao.getOperationType(dto);  }}