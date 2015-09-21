package dailyprogrammer.easy.challenge10;

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
        System.out.print("Enter a phone number to validate: ");
        String telephoneNumber = reader.nextLine();
        if (telephoneNumber.matches("[1-9]{3}[-. ][1-9]{3}[-. ][1-9]{4}")
                || telephoneNumber.matches("[(][1-9]{3}[)] ?[1-9]{3}[-. ][1-9]{4}"))
            System.out.println("Telephone number is valid");
        else
            System.out.println("Telephone number is invalid");
    }
}
