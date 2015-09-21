package dailyprogrammer.easy.challenge3;

import java.util.Scanner;

/**
 * @author Simin
 */
public class UserInterface {

    private Scanner reader;

    public UserInterface(Scanner reader) {
        this.reader = reader;
    }

    public void run() {
        while (true) {
            System.out.println("Encrypt or decrypt? (e/d) - x to exit");
            switch (reader.nextLine()) {
                case "e":
                    encrypt();
                    break;
                case "d":
                    decrypt();
                    break;
                case "exit":
                case "x":
                    return;
            }
        }
    }

    public void encrypt() {
        CaesarCipher.encrypt(askForText(), askForSwitches());
    }

    public void decrypt() {
        CaesarCipher.decrypt(askForText(), askForSwitches());
    }

    public String askForText() {
        System.out.print("Text: ");
        return reader.nextLine();
    }

    public int askForSwitches() {
        System.out.println("Switches?");
        return Integer.parseInt(reader.nextLine());
    }
}
