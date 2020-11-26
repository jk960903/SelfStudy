package Practice903;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx(int x,int y) {
		setTitle("2015152030 ¿Ã¡ÿ±‘");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT,x,y));
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("calculate"));
		
		setSize(300,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		FlowLayoutEx fl=new FlowLayoutEx(a,b);
	}
}
