package dailyprogrammer.easy.challenge11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Program that returns the name of the weekday of the given date.
 * @author Simin
 */
public class Main {
    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        //Asks the user for a day.
        System.out.println("day?");
        int day = readNextInt();

        //Asks the user for a month.
        System.out.println("month?");
        int month = readNextInt();

        //Asks the user for a year.
        System.out.println("year?");
        int year = readNextInt();

        //Sets the date format.
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        //Create Date object with the information the user gave us.
        Date date = null;
        try {
             date = format.parse(day + "-" + month + "-" + year);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Format the date to return only the name of the weekday.
        format.applyPattern("EEEE");

        //Format the date to print the pattern applied.
        System.out.println(format.format(date));
    }

    /**
     * Reads number input, invalid numbers will be caught and user will have to try again.
     * @return
     */
    private static int readNextInt() {
        boolean success = false;
        int number = 0;
        while (!success) {
            try {
                number = Integer.parseInt(reader.nextLine());
                success = true;
            } catch (Exception e) {
                System.out.println("Invalid number, try again.");
            }
        }
        return number;
    }
}
