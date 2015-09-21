package dailyprogrammer.easy.challenge2;

import javax.swing.SwingUtilities;

import dailyprogrammer.easy.challenge2.ui.UserInterface;

/**
 * Calculator
 */
public final class Main {

	public static void main(String[] args) {
		UserInterface ui = new UserInterface();
		SwingUtilities.invokeLater(ui);
	}

}
