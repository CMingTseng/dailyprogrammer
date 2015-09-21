package dailyprogrammer.easy.challenge2.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import dailyprogrammer.easy.challenge2.listener.*;

public final class UserInterface implements Runnable {
	
	private JTextField textField;

	@Override
	public void run() {
		JFrame frame = new JFrame("Calculator");
		frame.setPreferredSize(new Dimension(500, 300));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		createComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}

	private void createComponents(Container contentPane) {
		contentPane.add(textField(), BorderLayout.NORTH);
		contentPane.add(userPanel());
	}
	
	private JTextField textField() {
		textField = new JTextField("Enter your number");
		textField.setHorizontalAlignment(SwingUtilities.CENTER);
		setBiggerFontSize(textField);
		textField.setDisabledTextColor(Color.BLACK);
		textField.setPreferredSize(new Dimension(textField.getWidth(), 100));
		textField.addMouseListener(new MouseListener(textField));
		textField.requestFocus();
		return textField;
	}
	
	private JPanel userPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout());
		
		JButton clearButton = new JButton("C");
		setBiggerFontSize(clearButton);
		clearButton.addActionListener(new ClearButtonListener(textField));
		JButton plusButton = new JButton("+");
		setBiggerFontSize(plusButton);
		plusButton.addActionListener(new PlusButtonListener(textField));
		JButton minusButton = new JButton("-");
		setBiggerFontSize(minusButton);
		minusButton.addActionListener(new MinusButtonListener(textField));
		JButton multiplyButton = new JButton("*");
		setBiggerFontSize(multiplyButton);
		multiplyButton.addActionListener(new MultiplyButtonListener(textField));
		JButton divideButton = new JButton("/");
		setBiggerFontSize(divideButton);
		divideButton.addActionListener(new DivideButtonListener(textField));
		JButton equalsButton = new JButton("=");
		setBiggerFontSize(equalsButton);
		equalsButton.addActionListener(new EqualsButtonListener(textField));
		
		panel.add(clearButton);
		panel.add(plusButton);
		panel.add(minusButton);
		panel.add(multiplyButton);
		panel.add(equalsButton);
		
		return panel;
	}
	
	private void setBiggerFontSize(JComponent component) {
		component.setFont(new Font("arial", Font.PLAIN, 30));
	}
}
