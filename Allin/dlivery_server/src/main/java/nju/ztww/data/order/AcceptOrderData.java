package nju.ztww.data.order;

import java.util.ArrayList;

import nju.ztww.DBHelper.DBForReciveForm;
import nju.ztww.dao.ReciveFormDO;
import nju.ztww.po.AcceptPO;

public class AcceptOrderData {
	DBForReciveForm dbForReciveForm;
	private ArrayList<ReciveFormDO> list = new ArrayList<ReciveFormDO>();
	private ReciveFormDO reciveFormDO;
	
	public String insert(AcceptPO acceptPO){
		reciveFormDO = new ReciveFormDO();
		dbForReciveForm =  new DBForReciveForm();
		dbForReciveForm.init();
		reciveFormDO.setHoll(acceptPO.getBusinID());
		reciveFormDO.setRecip(acceptPO.getAccepter());
		reciveFormDO.setId(acceptPO.getAcceptID());
		reciveFormDO.setRealtime(acceptPO.getAcceptTime());
		reciveFormDO.setCourierid(acceptPO.getCourier());
		reciveFormDO.setState(acceptPO.getState());
		reciveFormDO.setExe(acceptPO.getExe());
		list.add(reciveFormDO);
		dbForReciveForm.insert(list, "reciveform");
		dbForReciveForm.close();
		System.out.println("Insert successful!");
		return "successful!";
	}
}
