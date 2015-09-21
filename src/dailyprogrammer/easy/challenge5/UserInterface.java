package dailyprogrammer.easy.challenge5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Simin
 */
public final class UserInterface {

    private Scanner reader;
    private static final String USERNAME = "Username";
    private static final String PASSWORD = "Password";

    private String username;
    private String password;

    public UserInterface(Scanner reader) {
        this.reader = reader;
    }

    public void start() {
        writeLoginToFile();
        readLoginFromFile();

        //System.out.println(username + " : " + password);

        System.out.println("Username?");
        String username = reader.nextLine();

        System.out.println("Password?");
        String password = reader.nextLine();

        if (username.equals(USERNAME) && password.equals(PASSWORD))
            System.out.println("Logged in!");
        else
            System.out.println("Login invalid!");
    }

    private void writeLoginToFile() {
        try {
            PrintWriter pw = new PrintWriter(new File("challenge5.txt"));
            pw.println(USERNAME);
            pw.println(PASSWORD);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void readLoginFromFile() {
        try {
            Scanner fileReader = new Scanner(new FileReader("challenge5.txt"));
            username = fileReader.nextLine();
            password = fileReader.nextLine();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
