package dailyprogrammer.easy.challenge9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Simin
 */
public class UserInterface {

    private Scanner reader;
    private static List<String> list = new ArrayList<>();

    public UserInterface(Scanner reader) {
        this.reader = reader;
    }

    public void start() {
        System.out.println("Add pieces of text to the list to sort them.");
        System.out.println("Enter empty text to sort your input.");
        while (true) {
            System.out.print("Enter text: ");
            String text = reader.nextLine();

            if (text.equals(""))
                break;

            list.add(text);
        }
        Collections.sort(list);
        System.out.println(list);
    }

}
