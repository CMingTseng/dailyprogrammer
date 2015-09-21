package dailyprogrammer.easy.challenge1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Simin on 4-9-2015.
 */
public class UserInterface {

    private Scanner reader;
    private String name;
    private int age;
    private String username;

    public UserInterface(Scanner reader) {
        this.reader = reader;
    }

    public void run() {
        boolean success = false;

        System.out.println("name?");
        name = reader.nextLine();

        while (!success) {
            try {
                System.out.println("age?");
                age = Integer.parseInt(reader.nextLine());
                success = true;
            } catch (Exception e) {
                System.out.println("Invalid number, enter age again.");
            }
        }

        System.out.println("username?");
        username = reader.nextLine();

        writeDetails();
        printDetails();
    }

    private void writeDetails() {
        try {
            PrintWriter pw = new PrintWriter(new File("challenge1.txt"));
            pw.println("name: " + name);
            pw.println("age: " + age);
            pw.println("username: " + username);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void printDetails() {
        System.out.println("name: " + name + ", age: " + age + ", username: " + username);
    }
}
