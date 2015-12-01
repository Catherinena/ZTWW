package nju.ztww.ui.finance;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EditBusiness extends EditPanel{
    Header header = new Header();
    JLabel label1 = new JLabel("付款单：",JLabel.LEFT);
    JLabel label2 = new JLabel("收款单：",JLabel.LEFT);
    EditPanel scrollPanel2 = new EditPanel(new String[]{"收款日期","收款金额","收款快递员","订单条形码"},new Object[][]{{new String("2015/11"),new Integer(100),new String("000002"),new String("00000001")}});
	public EditBusiness(String[] strings,Object[][] objects){
		super(strings,objects);
		scrollPanel2.remove(button1);
		scrollPanel2.remove(button2);
		scrollPanel2.remove(button3);
		
		header.setBounds(0, 0, 690, 25);
		label1.setBounds(0, 25, 690, 25);
		label2.setBounds(0,225,690,25);
		this.scrollPane.setBounds(0, 50, 690, 175);
		scrollPanel2.setBounds(0, 250, 690, 175);
		
		
		
		this.add(header);
		this.add(label1);
		this.add(label2);
		this.add(scrollPanel2);
		
		
		
		this.remove(button1);
		this.remove(button2);
		this.remove(button3);
	}
	
	
	
	class Header extends JPanel {
		public JLabel label1  = new JLabel("开始时间：",JLabel.CENTER);
    	public JLabel label2 = new JLabel("结束时间：",JLabel.CENTER);
    	public JButton button1  = new JButton("查看");
    	public JTextField text1 = new JTextField();
    	public JTextField text2 = new JTextField();
    	public JComboBox jbox1;
    	public JComboBox jbox2;
    	public String[] startTime = {"2015/10","2015/11","2015/12","2015/13"};
    	public String[] endTime = {"2016/1","2016/2","2016/3"};
    	public Header(){
    		jbox1 =   new JComboBox(startTime);
    		jbox2 = new JComboBox(endTime);
    		this.setLayout(new GridLayout(1,5));
    		this.add(label1);
    		//this.add(text1);
    		this.add(jbox1);
    		this.add(label2);
    		//this.add(text2);
    		this.add(jbox2);
    		this.add(button1);
    		button1.addActionListener(new Listener());
    	}
	}
	
	
	public class Listener implements ActionListener{
		

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String beginTime = (String)header.jbox1.getSelectedItem();
			String endTime   = (String)header.jbox2.getSelectedItem();
			
		}
		
	}
	
}
