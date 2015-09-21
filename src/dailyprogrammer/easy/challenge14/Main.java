package dailyprogrammer.easy.challenge14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Number switcharoo.
 *
 * @author Simin
 */
public class Main {

    private static Scanner reader = new Scanner(System.in);
    private static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        run();
    }

    /**
     * Run the program.
     */
    private static void run() {
        System.out.println("Enter empty string to quit and show the list.");

        System.out.print("Block size: ");
        int block = 0;

        //Get a valid block
        boolean success = false;
        while(!success) {
            try {
                block = Integer.parseInt(reader.nextLine());
                success = true;
            } catch (Exception e) {
                System.out.println("Invalid input, try again.");
            }
        }

        //Get valid input, stop at empty string.
        while (true) {
            //Ask for input
            System.out.print("Enter number: ");
            String input = reader.nextLine();

            //Break the loop once user enters empty string.
            if (input.equals(""))
                break;

            //Convert the input to a number and add it to the list.
            convertAndAddToList(input);
        }

        //Print the list of numbers.
        System.out.println(changeNumbers(block));
    }

    /**
     * Convert a string to int and add it to the list.
     *
     * @param input
     */
    private static void convertAndAddToList(String input) {
        try {
            numbers.add(Integer.parseInt(input));
        } catch (Exception e) {
            System.out.println("Input was invalid, number has not been added.");
        }
    }

    /**
     * Switch around
     *
     * @param block
     * @return
     */
    private static List<Integer> changeNumbers(int block) {
        List<Integer> numbers2 = new ArrayList<>();
        int numbersAmount = 0;
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            numbersAmount++;
            temp.add(numbers.get(i));
            if (numbersAmount == block) {
                Collections.reverse(temp);
                numbers2.addAll(temp);
                numbersAmount = 0;
                temp.clear();
            }
        }
        Collections.reverse(temp);
        numbers2.addAll(temp);
        return numbers2;
    }
}
