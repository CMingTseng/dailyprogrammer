package dailyprogrammer.easy.challenge4;

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
        System.out.println("Length?");
        int length = Integer.parseInt(reader.nextLine());

        System.out.println("Amount?");
        int amount = Integer.parseInt(reader.nextLine());

        PasswordGenerator.generateMultiplePasswords(length, amount);
    }
}
