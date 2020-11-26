package Practice1002;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class InnerClassListener extends JFrame{
	InnerClassListener(){
		setTitle("2015152030 이준규");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn=new JButton("ACTION");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b=(JButton)e.getSource();
			if(b.getText().contentEquals("ACTION"))
				b.setText("2015152030이준규액션");
			else
				b.setText("2015152030이준규ACTION");
			InnerClassListener.this.setTitle(b.getText());
			
		}
	}
	public static void main(String[] args) {
		new InnerClassListener();
	}
}
