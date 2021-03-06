package com.ufgov.zc.client.component;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.ufgov.smartclient.component.JComboBoxEx;
import com.ufgov.zc.client.common.ServiceFactory;
import com.ufgov.zc.client.common.WorkEnv;
import com.ufgov.zc.common.commonbiz.publish.IBaseDataServiceDelegate;
import com.ufgov.zc.common.system.RequestMeta;
import com.ufgov.zc.common.system.model.AsVal;
import com.ufgov.zc.common.zc.publish.IZcEbBaseServiceDelegate;

public class ZcCommonComboBox extends JComboBoxEx {
	private static final long serialVersionUID = 7695985762179916173L;

	private List dataList = new ArrayList();

	private List filterList = null;

	private Map<String, AsVal> dataMap = new HashMap<String, AsVal>();

	private String valsetid = "ZC_EB_PUR_TYPE";// 全部
	
	private String sqlId = null;
	
	private boolean isSQL = false;

	public ZcCommonComboBox() {

		super();

		init();

	}

	public ZcCommonComboBox(String valsetid) {

		super();

		this.valsetid = valsetid;
		
		initDataList();

		init();

	}

	public ZcCommonComboBox(List dataList) {

		super();

		this.dataList = dataList;

		init();

	}
	
	public ZcCommonComboBox(String valsetid, List filterList) {

		super();

		this.valsetid = valsetid;

		this.filterList = filterList;
		
		initDataList();

		init();

	}
	
	public ZcCommonComboBox(List dataList, List filterList) {

		super();

		this.dataList = dataList;

		this.filterList = filterList;
		
		init();

	}
	
	public ZcCommonComboBox(String sqlId, List filterList, boolean isSQL) {

		super();

		this.sqlId = sqlId;

		this.filterList = filterList;
		
		this.isSQL = isSQL;
		
		initDataList();

		init();

	}
	
	private void initDataList(){
		

		RequestMeta requestMeta = WorkEnv.getInstance().getRequestMeta();
		
		if(isSQL){
			
			IZcEbBaseServiceDelegate zcEbBaseServiceDelegate = (IZcEbBaseServiceDelegate) ServiceFactory.create(IZcEbBaseServiceDelegate.class,
				    "zcEbBaseServiceDelegate");
			
			dataList = zcEbBaseServiceDelegate.queryDataForList(sqlId, null, requestMeta);
			
		} else{
			
			IBaseDataServiceDelegate baseDataServiceDelegate = (IBaseDataServiceDelegate) ServiceFactory
					.create(IBaseDataServiceDelegate.class, "baseDataServiceDelegate");
			
			dataList = baseDataServiceDelegate.getAsVal(this.valsetid, requestMeta);
		}

	}

	private void init() {

		this.addItem(null);

		for (int i = 0; i < dataList.size(); i++) {

			AsVal data = (AsVal) dataList.get(i);

			if (filterList == null) {

				this.addItem(data);

				this.addItemDisplaLable(data, data.getVal());

				this.dataMap.put(data.getValId(), data);

			} else {

				if (filterList.contains(data.getValId())) {

					this.addItem(data);

					this.addItemDisplaLable(data, data.getVal());

					this.dataMap.put(data.getValId(), data);

				}

			}

		}

		this.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {

				if (((AsVal) getSelectedItem()) != null) {

					setToolTipText(((AsVal) e.getItem()).getVal());

				} else {

					setToolTipText(null);

				}

			}

		});

	}

	public AsVal getSelectedAsVal() {

		return (AsVal) this.getSelectedItem();

	}

	public void setSelectedAsVal(AsVal asVal) {

		this.setSelectedItem(asVal);

	}

	public void setSelectedAsValByCode(String asValCode) {

		AsVal asVal = dataMap.get(asValCode);

		this.setSelectedItem(asVal);

	}

	public static void main(String[] args) {

		JFrame f = new JFrame();

		ZcCommonComboBox planTypeField = new ZcCommonComboBox();

		JPanel panel = new JPanel();

		panel.add(planTypeField);

		f.getContentPane().add(panel, BorderLayout.NORTH);

		f.setSize(400, 300);

		f.setLocationRelativeTo(null);

		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				System.exit(0);

			}

		});

	}
}
