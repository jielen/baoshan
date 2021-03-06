package com.ufgov.zc.client.common.converter.sf;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;

import javax.swing.table.TableModel;

import com.ufgov.zc.client.common.LangTransMeta;
import com.ufgov.zc.client.common.MyTableModel;
import com.ufgov.zc.common.sf.model.SfJdDocCode;

public class SfReportCodeToTableModelConverter {

	  public static TableModel convertMainLst(List mainLst) {
	    // TCJLODO Auto-generated method stub

	    MyTableModel tableModel = null;
	    Vector names = new Vector();
	    Vector values = new Vector();

	    names.add(LangTransMeta.translate(SfJdDocCode.COL_GONG_ZI));
	    names.add(LangTransMeta.translate(SfJdDocCode.COL_JIAN_ZI_1));
	    names.add(LangTransMeta.translate(SfJdDocCode.COL_JIAN_ZI_2));
	    names.add(LangTransMeta.translate(SfJdDocCode.COL_ND));
	    names.add(LangTransMeta.translate(SfJdDocCode.COL_NUM)); 
	    names.add("全名"); 
	    if (mainLst != null && mainLst.size() > 0) {

	      SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
	      for (int i = 0; i < mainLst.size(); i++) {
	        Vector rowData = new Vector();
	        SfJdDocCode agreement = (SfJdDocCode) mainLst.get(i);
	        rowData.add(agreement.getGongZi());
	        rowData.add(agreement.getJianZi1());
	        rowData.add(agreement.getJianZi2());
	        rowData.add(agreement.getNd());
	        rowData.add(agreement.getNum().intValue()); 
	        rowData.add(agreement.getCode()); 
	        values.add(rowData);
	      }
	    }

	    tableModel = new MyTableModel(values, names) {
	      public Class getColumnClass(int column) {
	        if ((column >= 0) && (column < getColumnCount()) && this.getRowCount() > 0) {
	          for (int row = 0; row < this.getRowCount(); row++) {
	            if (getValueAt(row, column) != null) {
	              return getValueAt(row, column).getClass();
	            }
	          }
	        }
	        return Object.class;
	      }

	      public boolean isCellEditable(int row, int colum) {
	        return false;
	      }
	    };
	    tableModel.setList(mainLst);
	    return tableModel;
	  } 
}
