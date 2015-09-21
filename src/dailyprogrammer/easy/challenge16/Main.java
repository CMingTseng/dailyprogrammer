package dailyprogrammer.easy.challenge16;

import java.util.Scanner;

/**
 * Remove specific letters in a string.
 *
 * @author Simin
 */
public class Main {

    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        //Ask for word and letters to leave out.
        System.out.println("Word?");
        String word = reader.nextLine();
        System.out.println("Letters to leave out?");
        String letters = reader.nextLine();

        //Make character arrays for both strings.
        char[] chars = word.toCharArray();
        char[] toBeRemoved = letters.toCharArray();

        //StringBuilder to build the word without the letters to leave out.
        StringBuilder sb = new StringBuilder();


        //If the character doesn't exist in toBeRemoved, append the character to the new string.
        //Name the loop so the an iteration of the loop can be skipped in another loop.
        word:
        for (char c : chars) {
            for (char d : toBeRemoved) {
                if (c == d)
                    continue word;
            }
            sb.append(c);
        }

        //Print the new word.
        System.out.println(sb);

    }
}
