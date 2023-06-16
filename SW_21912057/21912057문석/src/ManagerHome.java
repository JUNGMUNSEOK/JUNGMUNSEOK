import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class ManagerHome {
	
	private JFrame frame;
	
	public ManagerHome(JTable tb,JTable tb1,JTable tb2) {
		
		frame=new JFrame("관리자 홈");
		frame.setBounds(400, 300, 200, 200);
		JPanel panel=new JPanel();
		frame.add(panel);
		JLabel lb=new JLabel("관리자님 어서오세요.");
;		JButton b1=new JButton("요금 정보 수정");
		JButton b2=new JButton("불편 사항 보기");
		panel.add(lb);
		panel.add(b1);
		panel.add(b2);
		frame.setVisible(true);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new ModifyPricelist(tb1,tb2);
			}	
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new ReadComplaint(tb);
			}	
		});
		
		
	}
}
