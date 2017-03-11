package com.ufgov.zc.client.console.elementrule;import com.ufgov.zc.common.commonbiz.model.MaElementRelationRuleEntry;import com.ufgov.zc.common.system.RequestMeta;public class RuleEntryNode extends RuleNode {  protected RuleEntryModel ruleEntryModel = new RuleEntryModel();  public RuleEntryNode() {    super();  }  public RuleEntryNode(Object userObject) {    MaElementRelationRuleEntry entry = (MaElementRelationRuleEntry) userObject;    this.userObject = entry;    this.ruleEntryModel.setRuleEntry(entry);    this.setGroupNode(false);    this.setTemplateNode(false);    this.setRuleNode(false);    this.setEntityNode(true);  }  /**   * @return the _view   * @throws IllegalAccessException    * @throws InstantiationException    */  public RuleView getRuleView() throws InstantiationException, IllegalAccessException {    if (view == null) {      view = (RuleView) this.viewClass.newInstance();      view.setRuleEntryModel(this.ruleEntryModel);    }    return view;  }  public RuleNode createNode(Object ruleObject, RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    return null;  }  public void delete(RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    MaElementRelationRuleEntry entry = (MaElementRelationRuleEntry) userObject;    String entryId = entry.getEntryId();    service.deleteRelationEntryByEntryId(entryId, requestMeta);    this.removeFromParent();  }  public void insert(RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    MaElementRelationRuleEntry ruleEntry = (MaElementRelationRuleEntry) this.userObject;    service.insertElementRelationEntry(ruleEntry, requestMeta);    this.setNewNode(false);  }  public void restored() {    // TCJLODO Auto-generated method stub    this.ruleEntryModel.restored();  }  public void update(RequestMeta requestMeta) {    // TCJLODO Auto-generated method stub    MaElementRelationRuleEntry ruleEntry = (MaElementRelationRuleEntry) this.userObject;    service.updateElementRelationEntry(ruleEntry, requestMeta);  }}