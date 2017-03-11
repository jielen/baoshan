/** * ForeignEntitySearchConditionItem.java * com.ufgov.gk.client.component.ui.conditionitem * Administrator * 2010-6-8 */package com.ufgov.zc.client.component.ui.conditionitem;import com.ufgov.zc.client.common.MyTableModel;import com.ufgov.zc.client.common.WorkEnv;import com.ufgov.zc.client.component.event.ValueChangeEvent;import com.ufgov.zc.client.component.event.ValueChangeListener;import com.ufgov.zc.client.component.zc.fieldeditor.ForeignEntityField;import com.ufgov.zc.client.util.NumLimUtil;import com.ufgov.zc.common.system.constants.NumLimConstants;import com.ufgov.zc.common.system.dto.ElementConditionDto;import com.ufgov.zc.common.system.util.BeanUtil;import com.ufgov.zc.common.zc.foreignentity.IForeignEntityHandler;import com.ufgov.zc.common.zc.model.ZcPProMakeExt;import java.util.List;import javax.swing.JComponent;import javax.swing.table.TableModel;/** * @author Administrator * */public class ZcEbProMakeSearchConditionItem extends AbstractSearchConditionItem {  private String compoId;  private String fieldName = "zcText0";  public ZcEbProMakeSearchConditionItem(String displayName) {    init(displayName);  }  public ZcEbProMakeSearchConditionItem(String displayName, String compoId) {    this.compoId = compoId;    init(displayName);  }  private ForeignEntityField projectSelectField;  @Override  protected JComponent createEditorComponent() {    if (projectSelectField == null) {      creatField();      projectSelectField.addValueChangeListener(new ValueChangeListener() {        public void valueChanged(ValueChangeEvent e) {          ZcPProMakeExt value = (ZcPProMakeExt) projectSelectField.getValue();          String code = null;          if (value != null) {            code = value.getZcMakeCode();          }          fireSearch();          fireValueChanged();        }      });    }    return projectSelectField;  }  private void creatField() {    String columNames[] = { "编号", "项目名称", "单位代码", "单位名称" };    ZcEbProMakeHandler proMakeHandler = new ZcEbProMakeHandler(columNames);    ElementConditionDto dto = new ElementConditionDto();    // 这里要取业务年度    dto.setNd(WorkEnv.getInstance().getTransNd());    dto.setNumLimitStr(NumLimUtil.getInstance().getNumLimCondByCoType(compoId, NumLimConstants.FWATCH, "ZC_MAKE_CODE"));    projectSelectField = new ForeignEntityField("ZC_P_PRO_MAKE.getProMake", dto, 50, proMakeHandler, columNames, "采购项目");  }  public void setProject(ZcPProMakeExt proj) {    if (projectSelectField != null) {      projectSelectField.setValue(proj);    }  }  @Override  public void setValue(Object value) {    projectSelectField.setValue(value);  }  @Override  public Object getValue() {    return projectSelectField.getValue();  }  @Override  public void putToElementConditionDto(ElementConditionDto element) {    String v = "";    if (projectSelectField.getValue() != null) {      ZcPProMakeExt proj = (ZcPProMakeExt) projectSelectField.getValue();      v = proj.getZcMakeCode();    }    BeanUtil.set(fieldName, v.equals("") ? null : v, element);  }  private class ZcEbProMakeHandler implements IForeignEntityHandler {    private String columNames[];    public ZcEbProMakeHandler(String columNames[]) {      this.columNames = columNames;    }    public void excute(List selectedDatas) {      // TCJLODO Auto-generated method stub      for (Object object : selectedDatas) {        ZcPProMakeExt proj = (ZcPProMakeExt) object;        ZcEbProMakeSearchConditionItem.this.projectSelectField.setValue(proj);        ZcEbProMakeSearchConditionItem.this.projectSelectField.setText(proj.getZcMakeName());        fireSearch();        fireValueChanged();      }    }    @Override    public TableModel createTableModel(List showDatas) {      Object data[][] = new Object[showDatas.size()][columNames.length];      for (int i = 0; i < showDatas.size(); i++) {        ZcPProMakeExt rowData = (ZcPProMakeExt) showDatas.get(i);        int col = 0;        data[i][col++] = rowData.getZcMakeCode();        data[i][col++] = rowData.getZcMakeName();        data[i][col++] = rowData.getCoCode();        data[i][col++] = rowData.getCoName();      }      MyTableModel model = new MyTableModel(data, columNames) {        @Override        public boolean isCellEditable(int row, int colum) {          return false;        }      };      return model;    }    @Override    public boolean isMultipleSelect() {      // TCJLODO Auto-generated method stub      return false;    }  }}