package dailyprogrammer.easy.challenge17;

import java.util.Scanner;

/**
 * @author Simin
 */
public class Main {

    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        //printTriangle(getNumberInput());
        printReverseTriangle(getNumberInput());
    }


    private static void printTriangle(int height) {
        int amount = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < amount; j++) {
                System.out.print("@");
            }
            System.out.println();
            amount *= 2;
        }
    }

    // Flawed.
    private static void printReverseTriangle(int height) {
        int amount = 1;
        int maxAmount = amount;

        for (int i = maxAmount; i < height; i++) {
            maxAmount *= 2;
        }

        System.out.println("maxAmount: " + maxAmount);

        for (int i = 0; i < height; i++) {
            for (int k = 0; k < maxAmount; k++) {
                printEmptyLine(maxAmount);
                maxAmount /= 2;

                //System.out.println("maxAmount: " + maxAmount);
            }
            for (int j = 0; j < amount; j++) {
                System.out.print("@");
            }
            System.out.println();
            amount *= 2;
        }
    }

    private static int getNumberInput() {
        int height = 0;
        boolean success = false;

        while (!success) {
            try {
                height = Integer.parseInt(reader.nextLine());
                success = true;
            } catch (Exception e) {
                System.out.println("Invalid number, try again.");
            }
        }
        return height;
    }

    private static void printEmptyLine(int length) {
        for (int k = 0; k < length; k++) {
            System.out.print(" ");
        }
    }

}
