package com.ufgov.zc.client.component.ui.fieldeditor;import java.awt.event.KeyAdapter;import java.awt.event.KeyEvent;import javax.swing.JComponent;import javax.swing.JTextField;import com.ufgov.zc.common.bi.model.BiApply;public class InputGroupTextFieldEditor extends AbstractFieldEditor {  private JTextField field;  public InputGroupTextFieldEditor(String name) {    super(name);  }  public InputGroupTextFieldEditor(String name, boolean isEditable) {    super(name);    this.field.setEditable(isEditable);  }  public Object getValue() {    return field.getText();  }  public void setValue(Object value) { //在选择的上面的行发生改变的时候所触发的事件    if (value == null || value instanceof String) {      field.setText((String) value);    } else if (value instanceof BiApply) {      BiApply biApply = (BiApply) value;      field.setText(biApply.getInputGroupId());      return;    }  }  protected JComponent createEditorComponent() { //生成下面的控件，并将改变的内容同步到对象中    field = new JTextField();    field.addKeyListener(new KeyAdapter() {      public void keyReleased(KeyEvent e) {        syncEditObject();      }    });    return field;  }  protected void syncEditObject() {    if (getEditObject() instanceof BiApply) {      BiApply biApply = (BiApply) getEditObject();      if (biApply != null) {        String fieldValue = field.getText();        if (fieldValue != null) {          biApply.setInputGroupId(fieldValue);        }        else {          biApply.setInputGroupId(null);        }      }    }    this.fireEditSynced();  }  @Override  public void setFieldEditorCode() {    // TCJLODO Auto-generated method stub  }}