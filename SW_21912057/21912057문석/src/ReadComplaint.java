import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ReadComplaint {
	
	private JFrame frame;
	private JTable complaintTb;
	
	ReadComplaint(JTable tb){
		frame=new JFrame();
		frame.setBounds(400,300,650,350);
		frame.setVisible(true);
		
		complaintTb=tb;
		
		JPanel panel=new JPanel();
		frame.add(panel);
		
		JLabel lb=new JLabel("불편사항 리스트");
		panel.add(lb);
		
		panel.add(new JScrollPane(complaintTb));
		
		
	}
}
