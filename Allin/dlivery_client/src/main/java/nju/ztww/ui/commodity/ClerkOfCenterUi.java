package nju.ztww.ui.commodity;

import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import nju.ztww.ui.finance.EditSearch;
import nju.ztww.ui.user.PersonalMesageUI;
import nju.ztww.ui.user.ThemeLabelUI;


//date 11-18 name wh
public class ClerkOfCenterUi extends JFrame {
	ClerkOfCenterNavigationPanel navigationpanel;

    ClerkOfCenterArriveMidPanel ArriveMidpanel;
    ThemeLabelUI Theme = new ThemeLabelUI();
    EditSearch editSearch;
   static ClerkOfCenterTransferPanel  Transferpanel;
    ClerkOfCenterArriveEndPanel ArriveEndpanel;
   static ClerkOfCenterCarloadPanel CarloadPanel;
    FindStoragePanel findStoragePanel;
    PersonalMesageUI personInfo;
    ArrayList<JPanel>arraylist=new ArrayList<JPanel>();
    //modify
    private ArrayList<JPanel> list = new ArrayList<JPanel>();
	public ClerkOfCenterUi() {
		// TODO Auto-generated constructor stub
		setup();
		setPosition();
		setController();
		//注掉
//		setTitle("Worker of Center!");
//		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
//		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
//		setLocation((width-900)/2, (height-600)/2);
//		setSize(900,600);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//
		}
	public  void setup(){
		editSearch=new EditSearch();
		navigationpanel=new ClerkOfCenterNavigationPanel();
		ArriveMidpanel=new ClerkOfCenterArriveMidPanel();
		Transferpanel=new ClerkOfCenterTransferPanel();
		ArriveEndpanel=new ClerkOfCenterArriveEndPanel();
		CarloadPanel=new ClerkOfCenterCarloadPanel();
		findStoragePanel=new FindStoragePanel();
		personInfo = new PersonalMesageUI();
		personInfo.setVisible(false);
	}
	public void setPosition(){
		this.setLayout(null);
		navigationpanel.setBounds(25, 150, 150, 400);
		Theme.setBounds(200, 0, 670, 120);
		editSearch.setBounds(200,120,670,410);
		ArriveMidpanel.setBounds(200,120,670,410);
		Transferpanel.setBounds(200,120,670,410);
		ArriveEndpanel.setBounds(200,120,670,410);
		CarloadPanel.setBounds(200,120,670,410);
		findStoragePanel.setBounds(200,120,670,410);
		personInfo.setBounds(200,120,670,410);
		//注掉
	
//		this.add(navigationpanel);
//		this.add(toppanel);
//		this.add(ArriveMidpanel);
//		this.add(Transferpanel);
//		this.add(ArriveEndpanel);
//		this.add(CarloadPanel);
//		this.add(findStoragePanel);
		//
	}
	public void setController(){
		arraylist.add(ArriveMidpanel);
		arraylist.add(Transferpanel);
		arraylist.add(ArriveEndpanel);
		arraylist.add(CarloadPanel);
		arraylist.add(findStoragePanel);
		arraylist.add(editSearch);
		arraylist.add(personInfo);
		for(JPanel panel : arraylist){
			panel.setVisible(false);
			panel.setOpaque(false);
		}
		navigationpanel.ArriveMid.addActionListener(new ClerkOfCenterController(this, ArriveMidpanel, arraylist));
		navigationpanel.Transfer.addActionListener(new ClerkOfCenterController(this, Transferpanel, arraylist));
//		navigationpanel.ArriveEnd.addActionListener(new ClerkOfCenterController(this, ArriveEndpanel, arraylist));
		navigationpanel.CarLoadbutton.addActionListener(new ClerkOfCenterController(this, CarloadPanel, arraylist));
		navigationpanel.StorageFind.addActionListener(new ClerkOfCenterController(this, findStoragePanel, arraylist));
		navigationpanel.checkOrderButton.addActionListener(new ClerkOfCenterController(this, editSearch, arraylist));
		navigationpanel.yourMessageButton.addActionListener(new ClerkOfCenterController(this, personInfo, arraylist));
	}

//	public static void main(String[] args) {
//		
//		new ClerkOfCenterUi();
//       
//}
	
	public ArrayList<JPanel> getPanelList(){
		list.add(navigationpanel);
		list.add(Theme);
		list.add(ArriveMidpanel);
		list.add(Transferpanel);
		list.add(CarloadPanel);
		list.add(findStoragePanel);
		list.add(personInfo);
		list.add(editSearch);
		return list;
	}
}
