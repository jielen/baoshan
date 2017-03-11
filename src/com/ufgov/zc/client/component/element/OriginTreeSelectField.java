package com.ufgov.zc.client.component.element;import java.awt.BorderLayout;import java.awt.Dialog;import java.awt.event.WindowAdapter;import java.awt.event.WindowEvent;import javax.swing.JFrame;import javax.swing.JPanel;import com.ufgov.zc.client.common.AsOptionMeta;import com.ufgov.zc.client.component.JButtonTextField;import com.ufgov.zc.common.commonbiz.model.Origin;import com.ufgov.zc.common.system.util.LevelControlUtil;public class OriginTreeSelectField extends JButtonTextField {  /**   *    */  private static final long serialVersionUID = -3573181273384644506L;  private String dataRuleId;  public String getDataRuleId() {    return dataRuleId;  }  public void setDataRuleId(String dataRuleId) {    this.dataRuleId = dataRuleId;  }  public void setValue(Object value) {    this.value = value;    if (value != null) {      Origin data = (Origin) value;      this.setText(data.getName());      this.setToolTipText("[" + data.getCode() + "]" + data.getName());    } else {      this.setText("");      this.setToolTipText(null);    }    this.fireValueChanged();  }  public void setOrigin(Origin value) {    this.setValue(value);  }  public Origin getOrigin() {    return (Origin) this.getValue();  }  public void handleClick(JButtonTextField jButtonTextField) {    await();    selectDialog.setVisible(true);  }  private void init(String compoId) {    this.compoId = compoId;    this.elementCode = "ORIGIN_CODE";    selectDialog = new OriginTreeSelectDialog(owner, true, this);  }  public OriginTreeSelectField(int col) {    super(col);    this.init(null);  }  public OriginTreeSelectField(String dataRuleId, int col) {    super(col);    this.dataRuleId = dataRuleId;    this.init(null);  }  public OriginTreeSelectField(int col, String compoId, String dataRuleId) {    super(col);    this.dataRuleId = dataRuleId;    this.init(compoId);  }  public OriginTreeSelectField(int col, Dialog owner) {    super(col);    this.owner = owner;    this.init(null);  }  public OriginTreeSelectField(int col, Dialog owner, String compoId) {    super(col);    this.owner = owner;    this.init(compoId);  }  public OriginTreeSelectField() {    super(20);    this.init(null);  }  public OriginTreeSelectField(String compoId) {    super(20);    this.init(compoId);  }  public void setCtrlLevelNum(int ctrlLevelNum) {    super.setCtrlLevelNum(ctrlLevelNum);    this.ctrlLen = LevelControlUtil.getCtrLength(AsOptionMeta.getOptVal("OPT_CP_ORIGIN_LEVEL"), ctrlLevelNum);  }  public static void main(String[] args) {    JFrame f = new JFrame();    OriginTreeSelectField textField = new OriginTreeSelectField(20);    //    textField.setEditable(false);    //    textField.setValueByCode("10603");    //    textField.setEnabled(false);    //    textField.setEnabled(true);    //        textField.setPrefix("2");    //        textField.setRandomEdit(false);    //        textField.setCtrlLevelNum(2);    JPanel panel = new JPanel();    panel.add(textField);    f.getContentPane().add(panel, BorderLayout.NORTH);    // f.pack();    // SwingUtilities.updateComponentTreeUI(panel);    f.setSize(400, 300);    f.setLocationRelativeTo(null);    f.setVisible(true);    f.addWindowListener(new WindowAdapter() {      public void windowClosing(WindowEvent e) {        System.exit(0);      }    });  }}