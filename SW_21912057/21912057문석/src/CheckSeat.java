import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CheckSeat {

	private JFrame frame;
	
	CheckSeat(){
		frame=new JFrame();
		frame.setSize(500,600);
		frame.setLayout(null);
		
		JPanel panel=new JPanel();
		panel.setBounds(17, 10, 450, 600);
		
		JLabel label=new JLabel("좌석확인");
		panel.add(label);
		
		frame.add(panel);
		
		JLabel imgLb=new JLabel();
		
		ImageIcon img = new ImageIcon(CheckSeat.class.getResource("/image/자리이미지1.PNG"));
		
		imgLb.setIcon(img);
		
		imgLb.setBounds(17, 50, 600, 280);
		
		imgLb.setHorizontalAlignment(JLabel.CENTER);
		panel.add(imgLb);
		
		frame.setVisible(true);
		panel.setVisible(true);
	}
}
