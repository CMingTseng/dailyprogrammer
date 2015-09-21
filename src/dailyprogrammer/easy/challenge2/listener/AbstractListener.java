package dailyprogrammer.easy.challenge2.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public abstract class AbstractListener implements ActionListener {

    private static JTextField textField;
    private static int number;
    private static boolean firstNumber = true;
    private static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public AbstractListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textField.requestFocus();
    }

    public static void add(int number) {
        numbers.add(number);
    }

    public void add(String[] array) {
        for (String number : array) {
            try {
                numbers.add(Integer.parseInt(number));
            } catch (Exception e) {

            }
        }
    }

    public static void addLastNumberToList() {
        String[] numbers = getTextField().getText().split(" ");
        add(Integer.parseInt(numbers[numbers.length - 1]));
    }

    public static boolean lastNumberIsValid() {
        String[] numbers = getTextField().getText().split(" ");
        String lastNumber = numbers[numbers.length - 1];
        return lastNumber.matches("[0-9]*") || lastNumber.matches("-[0-9]+");
    }

    public void addToTextField(String text) {
        getTextField().setText(getTextField().getText() + " " + text);
    }

    public char lastSign() {
        String[] numbers = getTextField().getText().split(" ");
        return numbers[numbers.length - 2].charAt(0);
    }

    public static int lastNumber() {
        String[] numbers = getTextField().getText().split(" ");
        return Integer.parseInt(numbers[numbers.length - 2]);
    }

    boolean containsEqualsSign() {
        return getTextField().getText().contains("=");
    }

    public static JTextField getTextField() {
        return textField;
    }

    public static int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        firstNumber = false;
        this.number = number;
    }

    public static ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public static boolean isFirstNumber() {
        return firstNumber;
    }
}
