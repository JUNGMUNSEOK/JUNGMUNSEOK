	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTable;
	import javax.swing.JTextField;
	import javax.swing.table.DefaultTableModel;
	
	public class WriteComplaint {
		
		private DefaultTableModel complaintTb;
		
		WriteComplaint(DefaultTableModel model){
			
			JFrame frame=new JFrame();
			frame.setTitle("불편사항 적기");
			frame.setBounds(400,300,400,170);
			frame.setVisible(true);
			
			JPanel panel=new JPanel();
			frame.add(panel);
			
			JLabel lb=new JLabel("불편사항 적기");
			panel.add(lb);
			
			JTextField txt=new JTextField(40);
			panel.add(txt);
			
			JButton bt=new JButton("작성");
			panel.add(bt);
			
			complaintTb=model;
			
			bt.addActionListener(new ActionListener() {
	
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					addContents(complaintTb,txt);
				}
				
			});
		}
		
		void addContents(DefaultTableModel complaintTb,JTextField txt) {
			String[] content=new String[1];
			content[0]=txt.getText();
			complaintTb.addRow(content);
		}
	}
