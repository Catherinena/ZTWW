package nju.ztww.ui.finance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import confligUI.MyButton;
import confligUI.MyTextField;

public class Dialog_init4 extends JDialog {
     EditPanel tablePanel ;
     MainPanel mainPanel = new MainPanel();
	public Dialog_init4(EditPanel tablePanel){
		this.tablePanel = tablePanel;
		this.setLayout(null);
		mainPanel.setBounds(0,0,600,450);
		mainPanel.submit.addActionListener(new Listener(this));
		//mainPanel.submit.addActionListener(new Listener(this));
		this.setContentPane(mainPanel);
		this.setTitle("库存建账");
		this.setSize(500, 450);
		this.setResizable(false);
		// this.pack();

		this.setVisible(false);
		
	}
	
	public class MainPanel extends JPanel{
		 private int height = 30;
         private int width = 150;
         private int margin1 = 50;
         private int margin2 = 250;
         private int margin3 = 50;
         private int margin4 =10;
         //"快件编号1", "入库日期2", "目的地3", "区号4", "排号5" ,"架号6","位号7"
         MyTextField name1,input1,name2,input2,name3,input3,name4,input4,name5,input5,name6,input6,name7,input7;
         MyButton submit = new MyButton('a');
         public MainPanel(){
        	 this.setLayout(null);
        	 input1 = new MyTextField();
        	 input2 = new MyTextField();
        	 input3 = new MyTextField();
        	 input4 = new MyTextField();
        	 input5 = new MyTextField();
        	 input6 = new MyTextField();
        	 input7 = new MyTextField();
        	 _setBounds(name1,0,1,"快件编号");
        	 _setBounds(input1,0,2,"");
        	 _setBounds(name2,1,1,"入库日期");
        	 _setBounds(input2,1,2,"");
        	 _setBounds(name3,2,1,"目的地");
        	 _setBounds(input3,2,2,"");
        	 _setBounds(name4,3,1,"区号");
        	 _setBounds(input4,3,2,"");
        	 _setBounds(name5,4,1,"排号");
        	 _setBounds(input5,4,2,"");
        	 _setBounds(name6,5,1,"架号");
        	 _setBounds(input6,5,2,"");
        	 _setBounds(name7,6,1,"位号");
        	 _setBounds(input7,6,2,"");
        	 submit.setBounds(200,350, 80, 30);
        	 this.add(submit);
        	 
         }
         
		 public void _setBounds(MyTextField text,int index, int tag,String contain){
        	 if(tag ==1){
        		 text = new MyTextField();
        		 text.setBounds(margin1,margin3+height*index+margin4*index,width,height);
        		 text.setText(contain);
        		 text.setHorizontalAlignment(JTextField.CENTER);
        		 text.setEditable(false);
        		 this.add(text);
        	 }else{
        		// text = new MyTextField();
        		 text.setBounds(margin2,margin3+height*index+margin4*index , width, height);
        		 this.add(text);
        	 }
         }
	}
	
	public class Listener implements ActionListener{
        JDialog dia;
        public Listener(JDialog dia){
        	this.dia = dia;
        }
        
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			 //"快件编号1", "入库日期2", "目的地3", "区号4", "排号5" ,"架号6","位号7"
			String id = mainPanel.input1.getText();
			String date = mainPanel.input2.getText();
			String address = mainPanel.input3.getText();
			String qu = mainPanel.input4.getText();
			String pai = mainPanel.input5.getText();
			String jia = mainPanel.input6.getText();
			String wei = mainPanel.input7.getText();
			mainPanel.input1.setText("");
			mainPanel.input2.setText("");
			mainPanel.input3.setText("");
			mainPanel.input4.setText("");
			mainPanel.input5.setText("");
			mainPanel.input6.setText("");
			mainPanel.input7.setText("");
			//mainPanel.input1.setText("");
			Object[] contain = new Object[]{new String(id),new String(date),new String(address),new String(qu)
			,new String(pai),new String(jia),new String(wei)};
			
			tablePanel.tableModel.addRow(contain);
			dia.dispose();
		}
		
	}
}
