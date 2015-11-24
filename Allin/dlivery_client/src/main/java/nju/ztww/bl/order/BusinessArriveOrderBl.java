package nju.ztww.bl.order;

import java.util.ArrayList;
import java.util.List;

import nju.ztww.RMI.RMIHelper;
import nju.ztww.po.BusinessArrivePO;
import nju.ztww.po.OrderPO;
import nju.ztww.service.OrderDataService;
import nju.ztww.vo.BusinessArriveVO;
import nju.ztww.vo.MailingVO;

/**
 * 营业厅到达单的bl层
 * 
 * @author TQ
 * 
 * */

public class BusinessArriveOrderBl {
	//新的businessArrivePO
	BusinessArrivePO businessArrivePO=new BusinessArrivePO(2);
	//ip地址
	 private String IP = "127.0.0.1";
	 private RMIHelper rhelper = new RMIHelper(IP,"1010");
	 
	 private OrderDataService orderDataService;
	 
	 private List<OrderPO> list=new ArrayList<OrderPO>();
	
	public BusinessArriveOrderBl(){
		
	}
	
	/**
	 * 将单据添加到临时数据库
	 * 
	 * @param businessArriveVO
	 * @return
	 */
	public String handleVO(BusinessArriveVO businessArriveVO){
		businessArrivePO.setData(businessArriveVO.getData());
		businessArrivePO.setNumber(businessArriveVO.getNumber());
		businessArrivePO.setSend(businessArriveVO.getSend());
		businessArrivePO.setState(businessArriveVO.getState());
		
		orderDataService=(OrderDataService)rhelper.findService("OrderDataService");
		String result=orderDataService.insert(businessArrivePO,2);
		return result;
	}
	
	/**
	 * 修改物流数据库
	 * 
	 * @param list
	 * @return
	 */
	public String handleAllVO(List<BusinessArrivePO> list){
		for(BusinessArrivePO temp:list){
			this.list.add(temp);
		}
		orderDataService=(OrderDataService)rhelper.findService("OrderDataService");
		String result=orderDataService.insertToDateFactory(this.list,2);
		return result;
		
	}
}
