package Practice902;
import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("2015152030 ���ر�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLUE);
		contentPane.setLayout(new FlowLayout());

		contentPane.add(new JButton("2015152030"));
		contentPane.add(new JButton("��ǻ�Ͱ���"));
		contentPane.add(new JButton("���ر�"));

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
