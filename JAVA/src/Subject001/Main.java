package Subject001;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.event.*;
import java.awt.*;
public class Main extends JFrame{
	JTextField namefield=new JTextField();
	JTextField majorfield=new JTextField();
	JLabel lbname=new JLabel("이름 :");
	JLabel lbmajor=new JLabel("학과 :");
	public Main() {
		setTitle("2015152030 이준규");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JPanel jp=new JPanel(new GridLayout(3,2,10,10));
		JButton accept=new JButton("확인");
		accept.addActionListener(new MyMouseListener());
		JButton cancel=new JButton("취소");
		cancel.addActionListener(new MyCancleListener());
		jp.add(new Label("이름"));
		jp.add(namefield);
		jp.add(new Label("학과"));
		lbname.setHorizontalAlignment(JLabel.CENTER);
		lbname.setOpaque(true);
		lbname.setBackground(Color.YELLOW);
		BevelBorder border=new BevelBorder(BevelBorder.RAISED);
		lbname.setBorder(border);
		jp.add(majorfield);
		jp.add(accept);
		jp.add(cancel);
		lbmajor.setHorizontalAlignment(JLabel.CENTER);
		lbmajor.setOpaque(true);
		lbmajor.setBackground(Color.YELLOW);
		lbmajor.setBorder(border);
		JLabel lbinput=new JLabel("입\n력\n창");
		lbinput.setBorder(border);
		lbinput.setOpaque(true);
		lbinput.setBackground(Color.YELLOW);
		lbinput.setSize(10,150);
		c.setLayout(new BorderLayout(0,0));
		c.add(lbname,BorderLayout.NORTH);
		c.add(lbinput,BorderLayout.WEST);
		c.add(jp,BorderLayout.CENTER);
		c.add(lbmajor,BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
	class MyMouseListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(namefield.getText()!=null&&majorfield.getText()!=null) {
				lbname.setText("이름 : "+namefield.getText());
				lbmajor.setText("학과 : "+majorfield.getText());
			}else {
				
			}
		}
	}
	class MyCancleListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			lbname.setText("이름 :");
			lbmajor.setText("학과 : ");
		}
	}
	public static void main(String[] args) {
		new Main();
	}
}
