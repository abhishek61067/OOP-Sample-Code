package gui;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KilometerConverter {

	public static void main(String[] args) {
		KilometerConverterWindow gui = new KilometerConverterWindow("Kilometer Converter");
		gui.initializeComponents();
	}
}

class KilometerConverterWindow extends JFrame {
	private JLabel messageLabel;
	private JTextField kiloTextField;
	private JButton calcButton;
	private JPanel panel;

	public KilometerConverterWindow(String title) {
		super(title);
	}

	private class CalcButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// try {
			double input = Double.parseDouble(kiloTextField.getText());
			double mile = input * 0.621371;
			JOptionPane.showMessageDialog(KilometerConverterWindow.this, input + " KM in mile = " + mile + " miles");
			// System.out.println("Converted value: " + mile);
//			}finally {
//				System.out.println("Inside Finally Block");
//			}
		}

	}

	public void initializeComponents() {

		messageLabel = new JLabel("Enter a distance in kilometers");
		kiloTextField = new JTextField(10);
		calcButton = new JButton("Calculate");
		calcButton.setBackground(Color.GREEN);
		calcButton.setForeground(new Color(255, 0, 255));
		CalcButtonListener listener = new CalcButtonListener();
		calcButton.addActionListener(listener);
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(kiloTextField);
		panel.add(calcButton);
		add(panel);
		setSize(400, 200);
		setVisible(true);

	}
}