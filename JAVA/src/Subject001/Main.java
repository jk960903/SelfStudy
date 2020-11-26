package Subject001;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.event.*;
import java.awt.*;
public class Main extends JFrame{
	JTextField namefield=new JTextField();
	JTextField majorfield=new JTextField();
	JLabel lbname=new JLabel("�̸� :");
	JLabel lbmajor=new JLabel("�а� :");
	public Main() {
		setTitle("2015152030 ���ر�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JPanel jp=new JPanel(new GridLayout(3,2,10,10));
		JButton accept=new JButton("Ȯ��");
		accept.addActionListener(new MyMouseListener());
		JButton cancel=new JButton("���");
		cancel.addActionListener(new MyCancleListener());
		jp.add(new Label("�̸�"));
		jp.add(namefield);
		jp.add(new Label("�а�"));
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
		JLabel lbinput=new JLabel("��\n��\nâ");
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
				lbname.setText("�̸� : "+namefield.getText());
				lbmajor.setText("�а� : "+majorfield.getText());
			}else {
				
			}
		}
	}
	class MyCancleListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			lbname.setText("�̸� :");
			lbmajor.setText("�а� : ");
		}
	}
	public static void main(String[] args) {
		new Main();
	}
}
