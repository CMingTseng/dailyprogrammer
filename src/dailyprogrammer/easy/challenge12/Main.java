package dailyprogrammer.easy.challenge12;

import java.util.*;

/**
 * Permutation printer
 *
 * @author Simin
 */
public class Main {

    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            //Asks for word.
            System.out.print("Enter string: ");
            String word = reader.nextLine();

            //Empty string means quit.
            if (word.equals(""))
                break;

            //Print permutations
            printPermutations(permutationList(word));
            System.out.println(permutationsPossible(word) + " permutations printed.\n");
        }
        System.out.println("\nHave a nice day!");
    }

    /**
     * Returns a list of all permutations of a word.
     *
     * @param word
     * @return
     */
    private static List<String> permutationList(String word) {
        //Create permutations list and adds the original word.
        List<String> permutations = new ArrayList<>();
        permutations.add(word);

        //Generate permutation and adds to the permutation list if it didnt contain it.
        String permutation = permutation(word);

        //Generates permutations until the maximum amount of permutations were made.
        while (permutations.size() < permutationsPossible(word)) {
            //while (permutations.size() < 6) {
            if (!permutations.contains(permutation))
                permutations.add(permutation);
            else
                permutation = permutation(word);
        }

        return permutations;
    }

    /**
     * Create random permutation of a word.
     *
     * @param word
     * @return
     */
    private static String permutation(String word) {
        StringBuilder sb = new StringBuilder();
        char[] chars = word.toCharArray();
        List<Character> list = new ArrayList<>();

        //Add the characters to an ArrayList.
        for (char c : chars) {
            list.add(c);
        }

        //ArrayList with numbers generated.
        List<Integer> numberList = new ArrayList<>();

        //Iterate through character list.
        for (char c : list) {

            //Generate random number.
            Random rand = new Random();
            int generatedNumber = rand.nextInt((list.size() - 1) + 1);

            //If the number had been generated before, generate new one.
            while (numberList.contains(generatedNumber))
                generatedNumber = rand.nextInt((list.size() - 1) + 1);

            //Get the letter from the list, index is the random number.
            char letter = list.get(generatedNumber);

            //Add the letter to the permutation.
            sb.append(letter);

            //Add the number generated to the list.
            numberList.add(generatedNumber);
        }
        return sb.toString();
    }

    /**
     * Calculates how many permutations are possible.
     *
     * @param word
     * @return
     */
    private static int permutationsPossible(String word) {
        //Length of the given word.
        int length = word.length();

        //Creates a map for characters and the amount of characters.
        Map<Character, Integer> charDuplicates = new HashMap<>();

        //Adds the characters to the map.
        char[] chars = word.toCharArray();
        for (char c : chars) {
            if (charDuplicates.get(c) == null) {
                charDuplicates.put(c, 1);
                continue;
            }
            charDuplicates.put(c, charDuplicates.get(c) + 1);
        }

        //Permutation formula
        int divide = 1;
        for (char c : charDuplicates.keySet())
            divide *= permutationOf(charDuplicates.get(c));
        return permutationOf(length) / divide;
    }

    /**
     * Returns permutation of a number.
     *
     * @param value
     * @return
     */
    private static int permutationOf(int value) {
        int result = value;
        for (int i = 1; i < value; i++)
            result *= (value - i);
        return result;
    }

    /**
     * Checks whether all letters of a word are the same.
     *
     * @param word
     * @return
     */
    private static boolean allLettersSame(String word) {

        if (word.length() <= 1)
            return true;

        char[] chars = word.toCharArray();
        char first = chars[0];
        for (char c : chars) {
            if (c != first)
                return false;
        }
        return true;
    }

    /**
     * Prints the List of permutations.
     *
     * @param permutations
     */
    private static void printPermutations(List<String> permutations) {
        permutations.forEach(System.out::println);
    }
}
