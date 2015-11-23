package nju.ztww.data.user;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.ztww.DBHelper.DBHelper;
import nju.ztww.dao.UserDO;
import nju.ztww.po.MemberPO;
import nju.ztww.po.OrderPO;
import nju.ztww.po.StatePO;
import nju.ztww.service.UserDataService;
import nju.ztww.serviceimpl.UserDataServiceImpl;

public class UserData{
	DBHelper dbHelper = new DBHelper();
    ArrayList<UserDO> list;   
    

    
	public OrderPO findOrder(String id){
		if(id.equals("0000000001")){
			StatePO statePO = new StatePO(1);
			statePO.setCurrentPlace("南京中转中心站");
			statePO.setHistoryPlace("上海中转中心");
			return  statePO;
		}else{
			return null;
		}
	}




	public MemberPO checkMember(String id, String password){
		// TODO Auto-generated method stub
		dbHelper.init();
		list = dbHelper.queryByID(id, "userstable");
		if(list.size()!=0){
		UserDO user = list.get(0);
		MemberPO member;
		member = new MemberPO(user.getId(), user.getPsw());
		
	
			member.setLegal(true);
			dbHelper.close();
			return member;
		}else{
			MemberPO member = new MemberPO(id, password);
			member.setLegal(false);
			member.setRight(true);
			dbHelper.close();
			return member;
		}

		
		
	}
	
//	public static void main(String[] args){
//		UserData userData = new UserData();
//		userData.dbHelper.init();
//		userData.dbHelper.queryTable("userstable");
//		userData.dbHelper.close();
//	}





	public OrderPO checkOrder(String id) throws RemoteException {
		// TODO Auto-generated method stub
		
		return null;
	}
}
