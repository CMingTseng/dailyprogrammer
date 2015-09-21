package dailyprogrammer.easy.challenge2.listener;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

public final class ClearButtonListener extends AbstractListener {

	public ClearButtonListener(JTextField textField) {
		super(textField);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		getTextField().setText("");
		setNumber(0);
	}

}
