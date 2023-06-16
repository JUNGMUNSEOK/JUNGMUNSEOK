import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class UserHome {
	
	private JButton b1,b2,b3,login;
	private JTable priceTb1,priceTb2,complaintTb;
	private DefaultTableModel model;
	
	private JFrame frame;
	
	public UserHome() {
		
		frame = new JFrame();
		frame.setTitle("SEAT");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 400, 400);
		
		JPanel panel1=new JPanel();
		panel1.setBounds(0,0,400,100);
		JPanel panel2=new JPanel();
		panel2.setBounds(0,100,390,265);
		panel2.setLayout(new GridLayout(4,1));
		frame.add(panel2);
		frame.add(panel1);
		
		b1=new JButton("요금 정보");
		b2=new JButton("불편사항 작성");
		b3=new JButton("좌석 현황");
		login=new JButton("관리자 로그인");
		
		JLabel lb=new JLabel("환영합니다.");
		
		panel1.add(lb);
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(login);
		
		//
		String[] headings=new String[] {"Contents"};
		model=new DefaultTableModel(headings,0);
		complaintTb=new JTable(model);
		complaintTb.setPreferredScrollableViewportSize(new Dimension(570,200));
		complaintTb.setFillsViewportHeight(true);
		
		//
		String header[]= {"시간","가격(원)"};
		String contents[][]= {{"2시간","3000"},{"3시간","4000"},{"4시간","5000"}};
		priceTb1=new JTable(contents,header);
		
		String contents2[][]= {{"10시간","12000"},{"20시간","20000"}};
		priceTb2=new JTable(contents2,header);
		
		//
		frame.setVisible(true);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new CheckPricelist(priceTb1,priceTb2);
				
			}
			
		});
		
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new WriteComplaint(model);
				
			}
			
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new CheckSeat();
				
			}
			
		});
		
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Login(complaintTb,priceTb1,priceTb2);
			}
			
		});
		
	}
	
}
