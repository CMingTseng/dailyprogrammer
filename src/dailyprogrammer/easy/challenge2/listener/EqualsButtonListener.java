package dailyprogrammer.easy.challenge2.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class EqualsButtonListener extends AbstractListener {

    public EqualsButtonListener(JTextField textField) {
        super(textField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        String[] numbers = getTextField().getText().split(" ");

        if (!lastNumberIsValid())
            return;

        if (lastSign() == '+') {
            setNumber(getNumber() + Integer.parseInt(numbers[numbers.length - 1]));
        } else  if (lastSign() == '-') {
            setNumber(getNumber() - Integer.parseInt(numbers[numbers.length - 1]));
        } else  if (lastSign() == '*') {
            setNumber(getNumber() * Integer.parseInt(numbers[numbers.length - 1]));
        } else  if (lastSign() == '/') {
            setNumber(getNumber() / Integer.parseInt(numbers[numbers.length - 1]));
        }

        add(numbers);
        getTextField().setText(getTextField().getText() + " = " + getNumber());
    }
}
