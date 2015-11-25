package nju.ztww.ui.manage;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GManager_ManageSalaryUI extends JPanel{
	String[] Position = {"快递员", "营业厅业务员", "中转中心业务员", "中转中心仓库人员", "财务人员", "总经理", "管理员"};
	String names;
	String[] Places = {"北京", "上海", "深圳", "广州", "南京"};
	JButton sureButton1 = new JButton();
	JButton sureButton2 = new JButton();
	JButton searchButton = new JButton();
	JLabel positionLabel = new JLabel();
	JLabel nameLabel = new JLabel();
	JLabel idLabel = new JLabel();
	JLabel nameLabel2 = new JLabel();
	JLabel idLabel2 = new JLabel();
	JLabel numLabel = new JLabel();
	JLabel moneyLabel = new JLabel();
	JLabel strategyLabel = new JLabel();
	JLabel sumSalaryLabel = new JLabel();
	JLabel fromLabel = new JLabel();
	JLabel toLabel = new JLabel();
	JLabel distanceLabel = new JLabel();
	JLabel RMB = new JLabel();
	JComboBox position = new JComboBox(Position);
	JComboBox from = new JComboBox(Places);
	JComboBox to = new JComboBox(Places);
	JTextField id1 = new JTextField();
	JTextField name2 = new JTextField();
	JTextField id2 = new JTextField();
	JTextField num = new JTextField();
	JTextField money = new JTextField();
	JTextField sumSalary = new JTextField();
	JTextField distance = new JTextField();
	JRadioButton monthly = new JRadioButton("按月提成");
	JRadioButton timely = new JRadioButton("按次提成");
	public GManager_ManageSalaryUI(){
		String[] name = {"Tom", "Jerry"};
		this.setLayout(null);
		positionLabel.setText("职位");
		positionLabel.setBounds(20, 20, 80, 30);
		position.setBounds(80, 20, 170, 30);
		
		nameLabel.setText("姓名");
		nameLabel.setBounds(20, 100, 80, 30);
		JComboBox name1 = new JComboBox(name);
		name1.setBounds(80, 100, 170, 30);
		
		idLabel.setText("ID");
		idLabel.setBounds(20, 180, 80, 30);
		id1.setBounds(80, 180, 140, 30);
		searchButton.setText("查找");
		searchButton.setBounds(220, 180, 30, 30);
		
		nameLabel2.setText("姓名");
		nameLabel2.setBounds(300, 20, 60, 30);
		name2.setBounds(360, 20, 110, 30);
		idLabel2.setText("ID");
		idLabel2.setBounds(490, 20, 60, 30);
		id2.setBounds(550, 20, 110, 30);
		
		numLabel.setText("派件数量");
		numLabel.setBounds(300, 80, 60, 30);
		num.setBounds(360, 80, 110, 30);
		moneyLabel.setText("单件酬金");
		moneyLabel.setBounds(490, 80, 60, 30);
		money.setBounds(550, 80, 110, 30);
		
		strategyLabel.setText("薪水策略");
		strategyLabel.setBounds(300, 140, 60, 30);
		monthly.setBounds(380, 140, 100, 30);
		timely.setBounds(480, 140, 100, 30);
		
		sumSalaryLabel.setText("薪水总额");
		sumSalaryLabel.setBounds(300, 200, 60, 30);
		sumSalary.setBounds(360, 200, 110, 30);
		RMB.setText("RMB");
		RMB.setBounds(490, 200, 60, 30);
		
		sureButton1.setText("确认");
		sureButton1.setBounds(580, 200, 80, 30);
		
		fromLabel.setText("出发地");
		fromLabel.setBounds(50, 270, 100, 30);
		toLabel.setText("到达地");
		toLabel.setBounds(230, 270, 100, 30);
		distanceLabel.setText("距离");
		distanceLabel.setBounds(410, 270, 100, 30);
		
		from.setBounds(50, 300, 130, 30);
		to.setBounds(230, 300, 130, 30);
		distance.setBounds(410, 300, 130, 30);
		sureButton2.setText("确定");
		sureButton2.setBounds(580, 300, 80, 30);
		this.add(positionLabel);
		this.add(position);
		this.add(nameLabel);
		this.add(name1);
		this.add(idLabel);
		this.add(id1);
		this.add(searchButton);
		this.add(name2);
		this.add(nameLabel2);
		this.add(idLabel2);
		this.add(id2);
		this.add(numLabel);
		this.add(num);
		this.add(moneyLabel);
		this.add(money);
		this.add(strategyLabel);
		this.add(monthly);
		this.add(timely);
		this.add(sumSalaryLabel);
		this.add(sumSalary);
		this.add(RMB);
		this.add(sureButton1);
		this.add(fromLabel);
		this.add(toLabel);
		this.add(distanceLabel);
		this.add(from);
		this.add(to);
		this.add(distance);
		this.add(sureButton2);
	}
	
}