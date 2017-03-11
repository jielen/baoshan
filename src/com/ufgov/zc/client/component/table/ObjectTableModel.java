package com.ufgov.zc.client.component.table;import java.text.DateFormat;import java.text.SimpleDateFormat;import java.util.ArrayList;import java.util.List;import javax.swing.table.AbstractTableModel;import com.ufgov.zc.common.bi.model.BiTrack;import com.ufgov.zc.common.system.util.DigestUtil;import com.ufgov.zc.common.system.util.ObjectUtil;public class ObjectTableModel extends AbstractTableModel {  /**   *    */  private static final long serialVersionUID = -4104068476870969196L;  /**   *    */  protected String[] columnNames;  protected String[] propNames;  private List origRowList = new ArrayList();  private List rowList = new ArrayList();  private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  public ObjectTableModel() {  }  public ObjectTableModel(String[] columnNames, String[] propNames) {    this.columnNames = columnNames;    this.propNames = propNames;  }  public int getColumnCount() {    // TCJLODO Auto-generated method stub    return columnNames.length;  }  public int getRowCount() {    // TCJLODO Auto-generated method stub    return rowList.size();  }  public String getColumnName(int column) {    return columnNames[column];  }  public Object getValueAt(int rowIndex, int columnIndex) {    // TCJLODO Auto-generated method stub    Object model = rowList.get(rowIndex);    if (model == null)      return "";    String propName = propNames[columnIndex];    try {      Object result = ObjectUtil.getProperty(model, propName);      if (result instanceof java.util.Date) {        result = dateFormat.format(result);      }      return result;    } catch (Exception ex) {      ex.printStackTrace();      return "Illegal property name";    }  }  public boolean isCellEditable(int row, int col) {    return false;  }  public Object getRowObject(int index) {    return this.rowList.get(index);  }  public Object getOrigRowObject(int index) {    return this.origRowList.get(index);  }  public void setRowList(List rowList) {    this.origRowList = rowList;    this.rowList = (List) ObjectUtil.deepCopy(rowList);    this.fireTableStructureChanged();  }  public List getOrigRowList() {    return origRowList;  }  public void setOrigRowList(List origRowList) {    this.origRowList = origRowList;  }  public List getRowList() {    return rowList;  }  public void setValueAt(Object aValue, int rowIndex, int columnIndex) {    super.setValueAt(aValue, rowIndex, columnIndex);  }  public Class getColumnClass(int columnIndex) {    return super.getColumnClass(columnIndex);  }  public void refresh() {    this.fireTableStructureChanged();  }  public List getDirtyRecords() {    List dirtys = new ArrayList();    BiTrack track1 = null;    BiTrack track2 = null;    for (int i = 0; i < origRowList.size(); i++) {      track1 = (BiTrack) origRowList.get(i);      track2 = (BiTrack) rowList.get(i);      if (!DigestUtil.digest(track1).equals(DigestUtil.digest(track2))) {        dirtys.add(i);      }    }    return dirtys;  }}