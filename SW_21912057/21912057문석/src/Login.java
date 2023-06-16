import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class Login {
	
	private TextField txt;
	private String pw="1234";
	private JFrame frame;
	
	public Login(JTable tb,JTable tb1,JTable tb2) {
		
		frame=new JFrame("관리자 로그인");
		frame.setBounds(400,300,200,200);
		
		JPanel panel=new JPanel();
		
		JLabel lb=new JLabel("비밀번호를 입력하세요");
		
		txt=new TextField(10);
		txt.setEchoChar('*');
		
		JButton bt=new JButton("Login");
				
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(isCorrect(pw,txt)) {
					new ManagerHome(tb,tb1,tb2);
				}else {
					Login_Failed();
				}
			}
			
		});
		
		panel.add(lb);
		panel.add(txt);
		panel.add(bt);
		frame.add(panel);
		frame.setVisible(true);
	}
	
	
	public boolean isCorrect(String pw,TextField txt) {
		if(pw.equals(txt.getText())) return true;
		else return false;
	}
	
	public void Login_Failed() {
		JFrame fr=new JFrame();
		fr.setBounds(400,300,200,200);
		JLabel lb=new JLabel("비밀번호가 잘못되었습니다.");
		fr.add(lb);
		fr.setVisible(true);
	}
}
