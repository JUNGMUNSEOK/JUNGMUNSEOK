import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ModifyPricelist {
	
	private JFrame frame;
	private JTable priceTb1,priceTb2;
	private JTextField[] txt;
	
	ModifyPricelist(JTable tb1,JTable tb2){
		
		frame=new JFrame("요금 정보 수정");
		frame.setBounds(400, 300, 300, 300);
		
		JLabel lb=new JLabel("요금 정보 수정");
		
		priceTb1=tb1;
		priceTb2=tb2;
		
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		
		panel1.add(lb);
		panel1.setBounds(0, 0, 290, 30);
		panel2.setLayout(new GridLayout(5,2));
		panel2.setBounds(20, 40, 250, 150);
		panel3.setBounds(0, 200, 290, 30);
		panel4.setBounds(0, 280, 290, 10);
		
		
		JLabel hour2=new JLabel("2시간");
		JLabel hour3=new JLabel("3시간");
		JLabel hour4=new JLabel("4시간");
		JLabel hour100=new JLabel("10시간");
		JLabel day30=new JLabel("20시간");
		panel2.add(hour2);
		
		txt=new JTextField[5];
		txt[0]=new JTextField();
		txt[1]=new JTextField();
		txt[2]=new JTextField();
		txt[3]=new JTextField();
		txt[4]=new JTextField();
		
		panel2.add(txt[0]);
		panel2.add(hour3);
		panel2.add(txt[1]);
		panel2.add(hour4);
		panel2.add(txt[2]);
		panel2.add(day30);
		panel2.add(txt[3]);
		panel2.add(hour100);
		panel2.add(txt[4]);
		
		JButton bt=new JButton("수정");
		panel3.add(bt);
		
		frame.setVisible(true);
		
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(isFull(txt)) {
					modify_success(priceTb1,priceTb2,txt);
				}else {
					modify_failed();
				}
				
			}
			
		});
	}
	
	public boolean isFull(JTextField[] txt) {
		for(int i=0;i<5;i++) {
			if(txt[i].getText().equals(""))
					return false;
		}
		return true;
	}
	
	public void modify_failed() {
		JFrame warn=new JFrame();
		warn.setBounds(400,300,200,200);
		JLabel lb1=new JLabel("금액을 입력해주세요");
		warn.add(lb1);
		warn.setVisible(true);
	}
	
	public void modify_success(JTable priceTb1,JTable priceTb2,JTextField[] txt) {
		priceTb1.setValueAt(txt[0].getText(), 0, 1);
		priceTb1.setValueAt(txt[1].getText(), 1, 1);
		priceTb1.setValueAt(txt[2].getText(), 2, 1);
		priceTb2.setValueAt(txt[3].getText(), 0, 1);
		priceTb2.setValueAt(txt[4].getText(), 1, 1);
		
		JFrame acc=new JFrame();
		acc.setBounds(400,300,200,200);
		JLabel lb2=new JLabel("수정이 완료되었습니다.");
		acc.add(lb2);
		acc.setVisible(true);
	}
}
