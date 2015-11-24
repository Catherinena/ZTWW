package nju.ztww.bl.order;


import nju.ztww.RMI.RMIHelper;
import nju.ztww.po.LoadingPO;
import nju.ztww.service.OrderDataService;

import nju.ztww.vo.LoadingVO;

/**
 * 营业厅装车单的bl层
 * 
 * @author TQ
 * 
 * */

public class LoadingOrderBl {
	
	   //新的LoadingPO
	   LoadingPO loadingPO=new LoadingPO(4);
		
		 private String IP = "127.0.0.1";
		 private RMIHelper rhelper = new RMIHelper(IP,"1010");
		 
		 private OrderDataService orderDataService;
		
		public LoadingOrderBl(){
			
		}
		
		public String handleVO(LoadingVO loadingVO){
			loadingPO.setArrive(loadingVO.getArrive());
			loadingPO.setCarNumber(loadingVO.getCarNumber());
			loadingPO.setData(loadingVO.getData());
			loadingPO.setJianZhuangName(loadingVO.getJianZhuangName());
			loadingPO.setMoney(loadingVO.getMoney());
			loadingPO.setOrderNumber(loadingVO.getOrderNumber());
			loadingPO.setQiYunNumber(loadingVO.getQiYunNumber());
			loadingPO.setYaYunName(loadingVO.getYaYunName());
			loadingPO.setYingYeNumber(loadingVO.getYingYeNumber());
			
			orderDataService=(OrderDataService)rhelper.findService("OrderDataService");
			String result=orderDataService.insert(loadingPO,4);
			return result;
		}

}
