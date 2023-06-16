import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class CheckPricelist {
	
	private JFrame frame;
	private JTable priceTb1,priceTb2;
	
	public CheckPricelist(JTable tb1,JTable tb2) {
		frame=new JFrame();
		priceTb1=tb1;
		priceTb2=tb2;
		frame.setTitle("요금정보");
		frame.setBounds(400, 300, 400, 400);
		
		JPanel panel1=new JPanel();
		panel1.setBounds(0,0,390,50);
		JPanel panel2=new JPanel();
		panel2.setBounds(0, 50, 390, 30);
		
		JLabel title=new JLabel("요금정보");
		JLabel lb=new JLabel("< 시간 >");
		JLabel lb2=new JLabel("< 정액권 >");
		panel2.setBackground(Color.GRAY);
		panel2.add(lb);
		panel1.add(title);
		
		JPanel panel3=new JPanel();
		panel3.setBounds(0, 90, 390, 100);
		panel3.add(priceTb1);
		priceTb1.setPreferredSize(new Dimension(350,80));
		
		JPanel panel4=new JPanel();
		panel4.setBounds(0, 200, 390, 30);
		panel4.setBackground(Color.GRAY);
		panel4.add(lb2);
		
		JPanel panel5=new JPanel();
		panel5.setBounds(0,240,390,60);
		panel5.add(priceTb2);
		priceTb2.setPreferredSize(new Dimension(350,30));
		
		JPanel panel6=new JPanel();
		panel6.setBounds(0,300,390,10);
		
		frame.add(panel3);
		frame.add(panel2);
		frame.add(panel1);
		frame.add(panel4);
		frame.add(panel5);
		frame.add(panel6);
		
		frame.setVisible(true);
	}
	
	
}