package dailyprogrammer.easy.challenge2.listener;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

public class MinusButtonListener extends AbstractListener {

	public MinusButtonListener(JTextField textField) {
		super(textField);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);

		if (!lastNumberIsValid())
			return;

		if (containsEqualsSign()) {
			getTextField().setText("Ans(" + getNumber() + ") - ");
			return;
		}

		if (isFirstNumber())
			setNumber(Integer.parseInt(getTextField().getText()));
		else
			setNumber(calculate());

		addLastNumberToList();
		addToTextField(" - ");

	}

	public int calculate() {
		return getNumber() - getNumbers().get(getNumbers().size() - 1);
	}

}
