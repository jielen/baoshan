package com.ufgov.zc.client.component.ui.conditionitem;import java.awt.event.ActionEvent;import java.awt.event.ActionListener;import javax.swing.JComponent;import com.ufgov.zc.client.component.element.DAttrComboBox;import com.ufgov.zc.common.commonbiz.model.DAttr;import com.ufgov.zc.common.system.dto.ElementConditionDto;public class DAttrComboboxConditionItem extends AbstractSearchConditionItem {  private static final long serialVersionUID = -8304659690105606562L;  private String compoId;  private String dattrType;  public DAttrComboboxConditionItem(String displayName) {    init(displayName);  }  public DAttrComboboxConditionItem(String displayName, String dattrType, String compoId) {    this.compoId = compoId;    this.dattrType = dattrType;    init(displayName);  }  public DAttrComboBox dattrComboBox;  protected JComponent createEditorComponent() {    if (dattrComboBox == null) {      dattrComboBox = new DAttrComboBox(dattrType, compoId, false);      dattrComboBox.initComboBox();      dattrComboBox.addActionListener(new ActionListener() {        public void actionPerformed(ActionEvent e) {          fireSearch();          fireValueChanged();        }      });    }    return dattrComboBox;  }  public void setValue(Object value) {    dattrComboBox.setSelectedItem(value);  }  @Override  public Object getValue() {    return dattrComboBox.getSelectedItem();  }  public void setControlLevel(int level) {    dattrComboBox.setCtrlLevelNum(level);    dattrComboBox.initComboBox();  }  public void putToElementConditionDto(ElementConditionDto element) {    DAttr dAttr = dattrComboBox.getSelectedDAttr();    String dAttrCode = dAttr == null ? null : dAttr.getCode();    if (DAttr.D_ATTR1_TYPE.equals(dattrType)) {      element.setDattr1(dAttrCode);    } else if (DAttr.D_ATTR2_TYPE.equals(dattrType)) {      element.setDattr2(dAttrCode);    } else if (DAttr.D_ATTR3_TYPE.equals(dattrType)) {      element.setDattr3(dAttrCode);    } else if (DAttr.D_ATTR4_TYPE.equals(dattrType)) {      element.setDattr4(dAttrCode);    } else if (DAttr.D_ATTR5_TYPE.equals(dattrType)) {      element.setDattr5(dAttrCode);    }  }}