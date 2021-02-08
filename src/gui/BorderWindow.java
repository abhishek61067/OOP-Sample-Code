package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderWindow extends JFrame {

	public BorderWindow(String title) throws HeadlessException {
		super(title);
		// Define new buttons with different regions
		JButton jb1 = new JButton("NORTH");
		JButton jb2 = new JButton("SOUTH");
		JButton jb3 = new JButton("WEST");
		JButton jb4 = new JButton("EAST");
		JButton jb5 = new JButton("CENTER");

		JPanel panel12 = new JPanel();
		panel12.add(new Button("Btn1"));
		panel12.add(new Button("Btn2"));
		panel12.add(new Button("Btn3"));
		// Define the panel to hold the buttons
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(panel12, BorderLayout.NORTH);
		panel.add(jb2, BorderLayout.SOUTH);
		panel.add(jb3, BorderLayout.WEST);
		panel.add(jb4, BorderLayout.EAST);
		panel.add(jb5, BorderLayout.CENTER);

		add(panel);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new BorderWindow("Border Layout");
	}

}
